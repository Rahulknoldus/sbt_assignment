package dependency
import sbt._
object dep {



    object  Version {
      val AkkaVersion = "2.6.15"
      val ScalaTestVersion = "3.2.9"
    }

    object Libraries {

      val embeddedKafka = "net.manub" %% "scalatest-embedded-kafka" % "0.14.0" % "test"
      val json4s        = "org.json4s" %% "json4s-native" % "3.2.11"
      val scalactic     = "org.scalactic" %% "scalactic" % Version.ScalaTestVersion

      val akka         = "com.typesafe.akka" %% "akka-actor-typed" % Version.AkkaVersion
      val akkaStream    = "com.typesafe.akka" %% "akka-stream" % Version.AkkaVersion
      val akkaPersist   =  "com.typesafe.akka" %% "akka-persistence-typed" % Version.AkkaVersion
      val scalaTest     = "org.scalatest" %% "scalatest" % Version.ScalaTestVersion % Test

      val mockito         = "org.mockito" % "mockito-core" % "3.6.0" % Test
      val akkTest         = "com.typesafe.akka" %% "akka-actor-testkit-typed" % Version.AkkaVersion % Test
      val akkaStreamTest  =  "com.typesafe.akka" %% "akka-stream-testkit" % Version.AkkaVersion % Test
      val akkaPersistTest = "com.typesafe.akka" %% "akka-persistence-testkit" % Version.AkkaVersion % Test
    }


    val commonModuleDependencies: Seq[sbt.ModuleID] =
      Seq(Libraries.embeddedKafka, Libraries.json4s, Libraries.scalactic,Libraries.scalaTest,Libraries.mockito)
    val actorModuleDependencies: Seq[sbt.ModuleID] =

      Seq(Libraries.akka, Libraries.akkTest,Libraries.scalaTest,  Libraries.akkaStream,Libraries.akkaPersist)

  }


}
