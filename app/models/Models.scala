package models

import java.util.UUID

sealed abstract class Color(val id: Int)
object Color {
  case object White extends Color(0)
  case object Black extends Color(1)
  def colorOfInt(id: Int): Color =
    id match {
      case 0 => White
      case 1 => Black
      case _ => throw new Exception("Int cannot be converted into color")
    }
  def intOfColor(color: Color): Int = color.id
}

case class CreateGame(playerId: UUID, handle: String, color: Color)
