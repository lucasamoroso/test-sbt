import sbt._

object Dependencies {


  object Lombok {
    private lazy val version = "1.18.20"

    private lazy val lombok = "org.projectlombok" % "lombok" % version % Provided

    val all: Seq[ModuleID] = Seq(lombok)
  }

  object Jackson {
    private lazy val version = "2.12.3"

    private lazy val jacksonScalaModule = "com.fasterxml.jackson.module" % "jackson-module-scala_2.13" % version
    private lazy val jacksonCore = "com.fasterxml.jackson.core" % "jackson-databind" % version
    private lazy val jacksonDataType = "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % version
    private lazy val jacksonAfterburnerModule = "com.fasterxml.jackson.module" % "jackson-module-afterburner" % version

    val all: Seq[ModuleID] = Seq(jacksonScalaModule, jacksonCore, jacksonDataType, jacksonAfterburnerModule)
  }

  object ScalaTest {
    private lazy val scalatest = "org.scalatest" %% "scalatest" % "3.2.9" % "test"

    val all: Seq[ModuleID] = Seq(scalatest)
  }

}
