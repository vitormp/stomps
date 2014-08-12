package com.stomp

import java.io.PrintWriter
import java.net.Socket

import com.stomp.message.STOMPMessage

/**
 * Created by vmp on 8/8/14.
 */
class STOMPClient(serverHost : String, serverPort : Integer) {

  def send(message : STOMPMessage) = {
    val server = new Socket(serverHost, serverPort)
    val client = new PrintWriter(server.getOutputStream())
    client.println(message.command + message.endOfMessage)
  }
}
