package com.stomp.frames

/**
 * Created by vitormp on 8/18/14.
 */
trait ServerFrame

case class Connected() extends ServerFrame
