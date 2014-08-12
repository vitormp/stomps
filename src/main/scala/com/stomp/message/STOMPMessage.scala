package com.stomp.message

/**
 * Created by vmp on 8/8/14.
 */
class STOMPMessage {

  val endOfMessage = "\n\n\\@"

}

class Connect extends STOMPMessage {
  val command = "CONNECT"
}

class Send extends STOMPMessage {
  val command = "SEND"
}