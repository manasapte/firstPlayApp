package controllers

import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import models.Task

object Application extends Controller {
  val taskForm = Form(
    "label" -> nonEmptyText
  )

  def index = Action {
    Redirect(routes.Application.tasks)
    //Ok("Hello World")
    //Ok(views.html.index("Your new application is ready."))
  }

  def tasks = Action {
    Ok(views.html.index(Task.all(), taskForm))
  }

  def newTask = TODO

  def deleteTask(id: Long) = TODO
  

}
