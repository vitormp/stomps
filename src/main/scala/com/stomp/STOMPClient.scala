package com.stomp

import java.io.PrintWriter
import java.net.Socket

import com.stomp.message.{Connect, STOMPMessage}

/**
 * Created by vmp on 8/8/14.
 */
class STOMPClient(serverHost : String = "127.0.0.1", serverPort : Integer = 61613) {

  def connect() = {
    val server = new Socket(serverHost, serverPort)
    val client = new PrintWriter(server.getOutputStream())
    client.println(Connect)
  }

  def send(message : STOMPMessage) = {
    val server = new Socket(serverHost, serverPort)
    val client = new PrintWriter(server.getOutputStream())
    client.println(message.command + message.endOfMessage)
  }
}
