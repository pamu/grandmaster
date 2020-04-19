package module

import play.api._
import play.api.inject.{Binding, Module}
import play.engineio.EngineIOController
import provider.MySocketIOEngineProvider

class MyModule extends Module {
  override def bindings(
      environment: Environment,
      configuration: Configuration
  ): Seq[Binding[EngineIOController]] =
    Seq(
      bind[EngineIOController].toProvider[MySocketIOEngineProvider]
    )
}
