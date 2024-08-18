object InterestCalculator {
  val calculateInterest: Double => Double = {
    case deposit if deposit <= 20000     => deposit * 0.02
    case deposit if deposit <= 200000    => deposit * 0.04
    case deposit if deposit <= 2000000   => deposit * 0.035
    case deposit                         => deposit * 0.065
  }

  // Main function
  def main(args: Array[String]): Unit = {
    val depositAmount = 50000.0
    val interestEarned = calculateInterest(depositAmount)
    println(f"The interest earned on a deposit of Rs. $depositAmount%.2f in a year is Rs. $interestEarned%.2f.")
  }
}
