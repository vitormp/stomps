package com.stomp.message

/**
 * Created by vmp on 8/8/14.
 */
trait STOMPMessage {
  def command : String
//  val headers : List = List()
  def headers : String
  def body : String
  val endOfMessage : String = "\000"

  def build : String = new StringBuffer().append(command).append("\n\n").append(endOfMessage).toString
}

case class Connect(messageHeaders : String = "") extends STOMPMessage {
  override def command = "CONNECT"
  def headers = messageHeaders
  def body = ""
}

case class Send(messageBody : String = "")(messageHeaders : String = "") extends STOMPMessage {
  override def command = "SEND"
  def headers = messageHeaders + "destination:/queue/stomp_q"
  def body = messageBody

  override def build = new StringBuffer()
              .append(command)
              .append("\n")
              .append("destination:/queue/stomp_q")
              .append("\n\n")
              .append(body)
              .append("\n\n")
              .append(endOfMessage).toString
}