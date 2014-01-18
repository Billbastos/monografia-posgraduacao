object SomarNumeros extends App {
  val tempoInicial: Double = System.nanoTime

  def somar(inicio: Long, total: Long, resultado: Long = 0): Long =
    if (inicio >= total) resultado else somar(inicio + 1, total, inicio + resultado)

  val resultado = somar(1, 1000000)
  val tempoFinal: Double = System.nanoTime

  println(s"Resultado: $resultado")
  println(s"Tempo (ms): ${((tempoFinal - tempoInicial) / 1000000)}")
}
