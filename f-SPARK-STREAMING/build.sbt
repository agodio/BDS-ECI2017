name := "relation-count"

version := "1.0"
scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.2.0",
    "org.apache.spark" %% "spark-streaming" % "2.2.0"
)
