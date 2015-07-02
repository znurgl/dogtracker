package net.znurgl.dogtracker.controllers

import spray.routing.HttpService

/**
 * Created by znurgl on 02/07/15.
 */
trait LocationsService extends HttpService {

  val route = {
    path("ping") {
      get {
        complete("pong")
      }
    }
  }

}
