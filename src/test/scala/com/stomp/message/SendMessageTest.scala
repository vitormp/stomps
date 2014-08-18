package com.stomp.message

import com.stomp.test.core.UnitSpec

/**
 * Created by vitormp on 8/17/14.
 */
class SendMessageTest extends UnitSpec {

  "A Send Message" should "contains at least the command and destination header" in {
    assert("SEND\ndestination:/queue/stomp_q\n\nMessage body\n\n\000" equals new Send("Message body")().build)
  }

  "A Send Message" should "contains at least the command and destination header and a body" in {
    assert("SEND\ndestination:/queue/stomp_q\n\nThis is a body\n\n\000" equals new Send("This is a body")().build)
  }
}
