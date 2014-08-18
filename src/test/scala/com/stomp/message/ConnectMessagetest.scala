package com.stomp.message

import com.stomp.test.core.UnitSpec

/**
 * Created by vitormp on 8/17/14.
 */
class ConnectMessagetest extends UnitSpec {

  "A Connect Message" should "contains only the command and endOfMessage part" in {
    assert("CONNECT\n\n\000" equals new Connect().build)
  }
}
