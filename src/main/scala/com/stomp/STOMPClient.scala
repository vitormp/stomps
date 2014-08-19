package com.stomp

import java.io.{InputStreamReader, BufferedReader, OutputStream, PrintWriter}
import java.net.Socket

import com.stomp.frames.{Message, Connected}
import com.stomp.message.{Connect, STOMPMessage}

/**
 * Created by vmp on 8/8/14.
 */
class STOMPClient(serverHost : String = "127.0.0.1", serverPort : Integer = 61613) {

  val STOMPServer = new Socket(serverHost, serverPort)

  def connect() = {
    val client = STOMPServer.getOutputStream()
    val connectMessage = Connect()
    client.write(connectMessage.build.getBytes("US-ASCII"))

  }

  def send(message : STOMPMessage) = {
    val client = STOMPServer.getOutputStream
    val connectMessage = Connect().build
    client.write(message.build.getBytes("US-ASCII"))
  }

  def receive = {
    val receiver = new BufferedReader(new InputStreamReader(STOMPServer.getInputStream, "US-ASCII"))
    val frame = receiver.readLine()
    frame match {
      case "CONNECTED" => Connected
      case "MESSAGE" => Message
    }
  }
}
