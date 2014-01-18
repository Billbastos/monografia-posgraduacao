object CalcularFactorial extends App {

  val tempoInicial: Double = System.nanoTime

  def factorial(f: BigInt, n: BigInt): BigInt = {
    if (n == 1) f else factorial((f * n), (n - 1))
  }

  val resultado = factorial(1, 50)
  val tempoFinal: Double = System.nanoTime

  println(s"Resultado: $resultado")
  println(s"Tempo (ms): ${((tempoFinal - tempoInicial) / 1000000)}")

}
