import Dependencies._

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3"
    )),
    name := "sbt-release-gitflow",
    libraryDependencies += scalaTest % Test)
  .settings(Release.settings)
