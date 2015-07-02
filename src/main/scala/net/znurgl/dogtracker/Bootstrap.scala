package net.znurgl.dogtracker

import akka.actor.{Actor, ActorLogging, Props, ActorSystem}
import akka.io.IO
import com.typesafe.config.{ ConfigFactory, Config }
import net.znurgl.dogtracker.controllers.LocationsService
import spray.can.Http

/**
 * Created by znurgl on 02/07/15.
 */
object Bootstrap extends App {

  implicit val system = ActorSystem("dogtracker-system")

  val service = system.actorOf(Props[BootstrapActor], "dogtracker-system")

  IO(Http) ! Http.Bind(service, system.settings.config.getString("app.interface"), system.settings.config.getInt("app.port"))

}

/* Our Server Actor is pretty lightweight; simply mixing in our route trait and logging */
class BootstrapActor extends Actor with LocationsService with ActorLogging {
  def actorRefFactory = context
  def receive = runRoute(route)
}
