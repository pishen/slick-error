name := "slick-error"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "net.pishen" %% "slick-error-shared" % "0.1.0-SNAPSHOT",
  //database
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
  "com.h2database" % "h2" % "1.4.196",
  //json
  "io.circe" %% "circe-core" % "0.9.1",
  "io.circe" %% "circe-generic" % "0.9.1",
  "io.circe" %% "circe-parser" % "0.9.1"
)
