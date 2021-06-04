import Dependencies.{Jackson, Lombok, ScalaTest}

name := "test-sbt"

version := "0.1"

scalaVersion := "2.13.6"

compileOrder := CompileOrder.Mixed

libraryDependencies ++= Jackson.all ++ Lombok.all ++  ScalaTest.all ++ Seq("com.stephenn" %% "scalatest-json-jsonassert" % "0.2.0" % "test")
