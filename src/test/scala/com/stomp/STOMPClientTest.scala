package com.stomp

import com.stomp.message.Connect
import com.stomp.test.core.UnitSpec

/**
 * Created by vmp on 8/12/14.
 */
class STOMPClientTest extends UnitSpec {

  "A Client" should "connect to a message broker sending a STOMP message of CONNECT type" in {
    val client: STOMPClient = new STOMPClient("127.0.0.1", 61613)
    client.send(Connect(""))
  }

  "A Client" should "connect to message broker when calling the connect method without parameters" in {
    new STOMPClient().connect();
  }

  "A Client" should "connect to message broker when calling the connect method specifying the host" in {
    new STOMPClient("127.0.0.1").connect();
  }
}