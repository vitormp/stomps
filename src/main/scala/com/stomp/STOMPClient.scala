package com.stomp

import java.io.{OutputStream, PrintWriter}
import java.net.Socket

import com.stomp.message.{Connect, STOMPMessage}

/**
 * Created by vmp on 8/8/14.
 */
class STOMPClient(serverHost : String = "127.0.0.1", serverPort : Integer = 61613) {

  def connect() = {
    val server = new Socket(serverHost, serverPort)
    val client = server.getOutputStream()
    val connectMessage = Connect()
    System.out.println(connectMessage.build.getBytes("US-ASCII"))
    client.write(connectMessage.build.getBytes("US-ASCII"))

  }

  def send(message : STOMPMessage) = {
    val server = new Socket(serverHost, serverPort)
    val client = server.getOutputStream()
    val connectMessage = Connect().build
    System.out.println(connectMessage)
    System.out.println(message.build)
    client.write(connectMessage.getBytes("US-ASCII"))
    System.out.println(message.build.getBytes("US-ASCII"))
    client.write(message.build.getBytes("US-ASCII"))
  }
}
