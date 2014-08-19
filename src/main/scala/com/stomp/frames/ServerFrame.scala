package com.stomp.frames

/**
 * Created by vitormp on 8/18/14.
 */
trait ServerFrame {
  val headers : String
}

case class Connected(headers : String) extends ServerFrame {

  val token = "CONNECTED"

  def apply = new Connected("")
}

case class Message(headers : String) extends ServerFrame {
  val token = "MESSAGE"
}
