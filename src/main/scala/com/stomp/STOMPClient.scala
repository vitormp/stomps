package com.stomp

import java.io.PrintWriter
import java.net.Socket

import com.stomp.message.STOMPMessage

/**
 * Created by vmp on 8/8/14.
 */
class STOMPClient(host : String, port : Integer) {

  def send(message : STOMPMessage) = {
    val server = new Socket(host, port)
    val client = new PrintWriter(server.getOutputStream())
    client.println()
  }
}
