package controllers

import javax.inject.Singleton
import javax.inject.Inject
import play.api.mvc.{
  Action,
  AnyContent,
  ControllerComponents,
  BaseController,
  Request
}

@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  def index(): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(views.html.index())
    }
}
