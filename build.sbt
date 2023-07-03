ThisBuild / scalaVersion := "2.13.10"
ThisBuild / organization := "com.gu"

lazy val testDependcies = Seq("org.scalatest" %% "scalatest" % "3.2.7" % Test)

lazy val hello = {project in file("hello-frontend")}
  .enablePlugins(ZipPlugin)
  .settings{
    name := "Hello"
    libraryDependencies ++= testDependcies ++ Seq(
      "com.typesafe.play" %% "play-json" % "2.9.2",
      "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0"
    )

    sourceZipDir := crossTarget.value / name.value
  }
  .dependsOn(helloApi % "test->test; compile->compile")

lazy val helloApi = {project in file("hello-api")}
  .enablePlugins(ZipPlugin)
  .settings{
    name := "HelloApi"
    libraryDependencies ++= testDependcies ++ Seq(
      "com.typesafe.play" %% "play-json" % "2.9.2",
      "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0"
    )
    sourceZipDir := crossTarget.value / name.value
  }


