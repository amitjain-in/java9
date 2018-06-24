package amit.quiz.service

import com.typesafe.config.ConfigFactory

import scala.util.Try

class Webservice {

    def init(): Unit = {
        /** Application config object. */
        val config = ConfigFactory.load()
        /** Port to start service on. */
        lazy val servicePort = Try(config.getInt("service.port")).getOrElse(8080)

    }
}
