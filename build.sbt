name := """grandmaster"""
organization := "com.pamulabs"

version := "1.0-SNAPSHOT"

lazy val playSocketIO = RootProject(uri("git://github.com/pamu/play-socket.io.git"))

lazy val root = (project in file(".")).dependsOn(playSocketIO).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.pamulabs.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.pamulabs.binders._"
