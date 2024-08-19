object FunctionOfInterest {
  def interestPerYear(deposit: Double): Double = deposit match {
    case x if (x <= 20000)   => deposit * 0.02
    case x if (x <= 200000)  => deposit * 0.04
    case x if (x <= 2000000) => deposit * 0.035
    case x if (x > 2000000)  => deposit * 0.065
  }

  def main(args: Array[String]): Unit = {

    print("Enter the Deposit Amount: ")
    val amount = scala.io.StdIn.readDouble()
    println(s"Interest Per Year = Rs. ${interestPerYear(amount)}")

  }
}
