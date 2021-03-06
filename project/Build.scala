import sbt._
import Keys._
import com.twitter.sbt._

object SbtScroogePlugin extends Build {
  lazy val root = Project(
    id = "sbt11-scrooge",
    base = file("."),
    settings = StandardProject.newSettings ++
      SubversionPublisher.newSettings ++
      ScriptedPlugin.scriptedSettings
  ).settings(
    name := "sbt11-scrooge",
    organization := "com.twitter",
    version := "3.0.1-SNAPSHOT",
    sbtPlugin := true,

    SubversionPublisher.subversionRepository := Some("https://svn.twitter.biz/maven-public")
  )
}
