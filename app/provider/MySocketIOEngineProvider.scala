package provider

import javax.inject.{Inject, Provider, Singleton}
import play.engineio.EngineIOController
import play.socketio.scaladsl.SocketIO

@Singleton
class MySocketIOEngineProvider @Inject() (socketIO: SocketIO)
    extends Provider[EngineIOController] {

  override lazy val get: EngineIOController = socketIO.builder.createController()
}
