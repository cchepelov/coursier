
object ScalaVersion {

  def scala213 = "2.13.3"
  def scala212 = "2.12.12"

  val versions = Seq(scala213, scala212)

  val map = versions
    .map { v =>
      v.split('.').take(2).mkString(".") -> v
    }
    .toMap

}
