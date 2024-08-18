object NameFormatter {
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val formattedNames = names.map {
      case "Benny"   => formatNames("Benny", toUpper)
      case "Niroshan" => formatNames("Niroshan", name => name.head.toUpper + name.tail.toLowerCase)
      case "Saman"   => formatNames("Saman", toLower)
      case "Kumara"  => formatNames("Kumara", name => name.init.toLowerCase + name.last.toUpper)
    }

    formattedNames.foreach(println)
  }
}
