import AssemblyKeys._

assemblySettings

name := "template-scala-parallel-recommendation"

organization := "org.jpioug.predictionio"

val sparkVersion = sys.props.getOrElse("spark.version", "1.6.3")

libraryDependencies ++= Seq(
  "org.jpioug.predictionio" %% "apache-predictionio-core" % "0.11.1-v1-SNAPSHOT" % "provided",
  "org.apache.spark"        %% "spark-core"               % sparkVersion         % "provided",
  "org.apache.spark"        %% "spark-mllib"              % sparkVersion         % "provided")
