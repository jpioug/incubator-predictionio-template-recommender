name := "template-scala-parallel-recommendation"

scalaVersion := "2.11.0"

organization := "org.jpioug.predictionio"

libraryDependencies ++= Seq(
  "org.jpioug.predictionio" %% "apache-predictionio-core" % "0.11.1-v1-SNAPSHOT" % "provided",
  "org.apache.spark"        %% "spark-core"               % "2.1.0" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "2.1.0" % "provided")
