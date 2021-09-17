package common
import sbt._

object commonSetting {




    lazy val projectSettings = Seq(

    )
    def baseProject(name: String): Project = {
      Project(name, file(name))
    }

}
