name := "dogtracker-test"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV       = "2.3.11"
  val sprayVersion = "1.3.3"
  val scalaTestV  = "2.2.5"
  Seq(
    "com.typesafe.akka"     %% "akka-actor"                             % akkaV,
    "com.typesafe.akka"     %% "akka-testkit"                           % akkaV % "test",
    "com.typesafe.akka"     %% "akka-actor"                             % akkaV,
    "com.typesafe.akka"     %% "akka-slf4j"                             % akkaV,
    "io.spray"              %% "spray-routing"                          % sprayVersion,
    "io.spray"              %% "spray-can"                              % sprayVersion,
    "io.spray"              %% "spray-httpx"                            % sprayVersion,
    "io.spray"              %% "spray-testkit"                          % sprayVersion % "test",
    "org.scalatest"         %% "scalatest"                              % scalaTestV % "test"
  )
}

resolvers ++= Seq(
  "spray repo"                        at "http://repo.spray.io",
  "Typesafe repository snapshots"     at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe repository releases"      at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype repo"                     at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype releases"                 at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots"                at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype staging"                  at "http://oss.sonatype.org/content/repositories/staging",
  "Java.net Maven2 Repository"        at "http://download.java.net/maven/2/",
  "Twitter Repository"                at "http://maven.twttr.com",
  "Websudos releases"                 at "https://dl.bintray.com/websudos/oss-releases/"
)

Revolver.settings