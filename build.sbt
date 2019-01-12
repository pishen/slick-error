lazy val backend = (project in file("backend"))
  .settings(
    name := "slick-error",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
    //database
    "com.typesafe.slick" %% "slick" % "3.2.3",
    "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
    "com.h2database" % "h2" % "1.4.196",
    //json
    "io.circe" %% "circe-core" % "0.9.1",
    "io.circe" %% "circe-generic" % "0.9.1",
    "io.circe" %% "circe-parser" % "0.9.1"
    )
  )
  .dependsOn(shared)

lazy val shared = (project in file("shared"))
  .settings(
    scalaVersion := "2.12.8"
  )
