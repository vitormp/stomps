val x = "rah";

import java.io._
import java.net._

import com.sun.xml.internal.ws.resources.WsservletMessages

val client : Socket = new Socket("127.0.0.1", 61613)
client.getInetAddress().getHostName()

val sender = new PrintStream(client.getOutputStream())

sender.println("CONNECT\nlogin:guest\npassword:guest\n\n\n\\@")




