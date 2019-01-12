package app

import slick.jdbc.H2Profile.api._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._

package object database {
  val h2db = Database.forConfig("h2")

  implicit val jobStatusColumnType =
    MappedColumnType.base[Gender, String](
      { _.asJson.noSpaces },
      { decode[Gender](_).right.get }
    )
}
