package scala.tasty

import scala.tasty.pattern.{CaseDef, Pattern}
import scala.tasty.statement.TopLevelStatement
import scala.tasty.typetree.TypeTree

trait Extractor {

  // Statements

  def unapplyPackage(arg: TopLevelStatement): Option[statement.Package.Data]
  def unapplyImport(arg: TopLevelStatement): Option[statement.Import.Data]

  // Definitions

  def unapplyValDef(arg: TopLevelStatement): Option[statement.ValDef.Data]
  def unapplyDefDef(arg: TopLevelStatement): Option[statement.DefDef.Data]
  def unapplyTypeDef(arg: TopLevelStatement): Option[statement.TypeDef.Data]
  def unapplyClassDef(arg: TopLevelStatement): Option[statement.ClassDef.Data]

  // Terms

  def unapplyIdent(arg: TopLevelStatement): Option[term.Ident.Data]
  def unapplySelect(arg: TopLevelStatement): Option[term.Select.Data]
  def unapplyLiteral(arg: TopLevelStatement): Option[term.Literal.Data]
  def unapplyThis(arg: TopLevelStatement): Option[term.This.Data]
  def unapplyNew(arg: TopLevelStatement): Option[term.New.Data]
  def unapplyNamedArg(arg: TopLevelStatement): Option[term.NamedArg.Data]
  def unapplyApply(arg: TopLevelStatement): Option[term.Apply.Data]
  def unapplyTypeApply(arg: TopLevelStatement): Option[term.TypeApply.Data]
  def unapplySuper(arg: TopLevelStatement): Option[term.Super.Data]
  def unapplyTyped(arg: TopLevelStatement): Option[term.Typed.Data]
  def unapplyAssign(arg: TopLevelStatement): Option[term.Assign.Data]
  def unapplyBlock(arg: TopLevelStatement): Option[term.Block.Data]
  def unapplyLambda(arg: TopLevelStatement): Option[term.Lambda.Data]
  def unapplyIf(arg: TopLevelStatement): Option[term.If.Data]
  def unapplyMatch(arg: TopLevelStatement): Option[term.Match.Data]
  def unapplyTry(arg: TopLevelStatement): Option[term.Try.Data]
  def unapplyReturn(arg: TopLevelStatement): Option[term.Return.Data]
  def unapplyRepeated(arg: TopLevelStatement): Option[term.Repeated.Data]

  // Case

  def unapplyCaseDef(arg: CaseDef): Option[CaseDef.Data]

  // Patterns

  def unapplyValue(arg: Pattern): Option[pattern.Value.Data]
  def unapplyBind(arg: Pattern): Option[pattern.Bind.Data]
  def unapplyUnapply(arg: Pattern): Option[pattern.Unapply.Data]
  def unapplyAlternative(arg: Pattern): Option[pattern.Alternative.Data]
  def unapplyTypeTest(arg: Pattern): Option[pattern.TypeTest.Data]
  def unapplyWildcard(arg: Pattern): Boolean

  // Type trees

  def unapplySynthetic(arg: TypeTree): Boolean
  def unapplyIdent(arg: TypeTree): Option[typetree.Ident.Data]
  def unapplySelect(arg: TypeTree): Option[typetree.Select.Data]
  def unapplySingleton(arg: TypeTree): Option[typetree.Singleton.Data]
//  def unapplyRefined(arg: TypeTree): Option[typetree.Refined.Data]
  def unapplyApplied(arg: TypeTree): Option[typetree.Applied.Data]
  def unapplyTypeBounds(arg: TypeTree): Option[typetree.TypeBounds.Data]
  def unapplyAnnotated(arg: TypeTree): Option[typetree.Annotated.Data]
  def unapplyAnd(arg: TypeTree): Option[typetree.And.Data]
  def unapplyOr(arg: TypeTree): Option[typetree.Or.Data]
  def unapplyByName(arg: TypeTree): Option[typetree.ByName.Data]

  // Names

  def unapplySimple(arg: Name): Option[String]

  // Constants

  def unapplyUnit(arg: Constant): Boolean
  def unapplyNull(arg: Constant): Boolean
  def unapplyBoolean(arg: Constant): Option[Boolean]
  def unapplyByte(arg: Constant): Option[Byte]
  def unapplyChar(arg: Constant): Option[Char]
  def unapplyShort(arg: Constant): Option[Short]
  def unapplyInt(arg: Constant): Option[Int]
  def unapplyLong(arg: Constant): Option[Long]
  def unapplyFloat(arg: Constant): Option[Float]
  def unapplyDouble(arg: Constant): Option[Double]
  def unapplyString(arg: Constant): Option[String]

}
