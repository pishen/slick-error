package app.database

import slick.jdbc.H2Profile.api._
import app._

class Users(tag: Tag) extends Table[User](tag, "requests") {
  def id = column[Long]("id")
  def gender = column[Gender]("gender")
  def * = (id, gender) <> (User.tupled, User.unapply)
}

object Users {
  val table = TableQuery[Users]

  def init(id: Long) = h2db.run {
    table
      .filter(r => r.id === id)
      .map(_.gender)
      .update(Female)
  }

  def updateStatus(id: Long, status: Gender) = h2db.run {
    table
      .filter(r => r.id === id)
      .map(_.gender)
      .update(status)
  }
}
