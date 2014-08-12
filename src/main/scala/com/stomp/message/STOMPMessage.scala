package com.stomp.message

/**
 * Created by vmp on 8/8/14.
 */
abstract class STOMPMessage {
  val command : String
//  val headers : List = List()
  val endOfMessage = "\n\n\\@"

}

case class Connect(headers : String) extends STOMPMessage {
  val command = "CONNECT\n"
}

case class Send(headers : String) extends STOMPMessage {
  val command = "SEND\n"
}