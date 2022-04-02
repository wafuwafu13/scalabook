// https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html
lazy val root = (project in file(".")).settings(
  name := "HelloWorld",
  version := "1.0",
  scalaVersion := "2.13.8"
)
