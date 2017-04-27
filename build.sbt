import AssemblyKeys._

assemblySettings

name := "template-scala-parallel-recommendation"

scalaVersion := "2.11.0"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  "org.jpioug.predictionio" %% "apache-predictionio-core" % "0.11.0-v1-SNAPSHOT" % "provided",
  "org.apache.spark"        %% "spark-core"               % "2.1.0" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "2.1.0" % "provided")
