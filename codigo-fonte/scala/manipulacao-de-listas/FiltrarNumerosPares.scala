object FiltrarNumerosPares extends App {

  val tempoInicial: Double = System.nanoTime

  val numeros = 1 to 1000000
  val resultado = numeros.view.filter(_ % 2 == 0)

  val tempoFinal: Double = System.nanoTime

  println(s"Resultado: ${resultado.size}")
  println(s"Tempo (ms): ${((tempoFinal - tempoInicial) / 1000000)}")

}
