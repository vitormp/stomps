package com.stomp

import com.stomp.message.Connect
import com.stomp.test.core.UnitSpec

/**
 * Created by vmp on 8/12/14.
 */
class STOMPClientTest extends UnitSpec {

  "A Client" should "connect to a message broker" in {
    val client : STOMPClient = new STOMPClient("127.0.0.1", 61613)
    client.send(Connect(""))
  }
}