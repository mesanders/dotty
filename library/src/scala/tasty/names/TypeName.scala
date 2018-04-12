package scala.tasty.names

import scala.runtime.tasty.Toolbox

trait TypeName extends Name

object TypeName {
  type Data = TermName
  def unapply(arg: Name)(implicit toolbox: Toolbox): Option[Data] = toolbox.unapplyTypeName(arg)
}
