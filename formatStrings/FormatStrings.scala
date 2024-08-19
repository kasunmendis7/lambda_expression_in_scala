object q3 {
  def toUpper(str: String): String = {
    str.map { char =>
      if (char >= 'a' && char <= 'z') {
        ('A' + (char - 'a')).toChar
      } else {
        char
      }
    }
  }

  def toLower(str: String): String = {
    str.map { char =>
      if (char >= 'A' && char <= 'Z') {
        ('a' + (char - 'A')).toChar
      } else {
        char
      }
    }
  }

  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    val formattedNames = names.map {
      case "Benny"     => formatNames("Benny")(toUpper)
      case "Niroshan"  => formatNames("Niroshan") { name =>
                          val (first, rest) = name.splitAt(2)
                          toUpper(first) + rest
                        }
      case "Saman"     => formatNames("Saman")(toLower)
      case "Kumara"    => formatNames("Kumara") { name =>
                          val (first, middle, last) = (name.head.toString, name.slice(1, name.length - 1), name.last.toString)
                          toUpper(first) + toLower(middle) + toUpper(last)
                        }
    }
    formattedNames.foreach(println)
  }
}

