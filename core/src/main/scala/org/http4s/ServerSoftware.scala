package org.http4s

case class ServerSoftware(product: String, productVersion: Option[String] = None, comment: Option[String] = None)

object ServerSoftware {
  val Unknown = ServerSoftware("Unknown", None, None)
}
