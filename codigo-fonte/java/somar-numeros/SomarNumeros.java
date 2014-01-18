public class SomarNumeros {

	public static void main(String[] args) {
		double tempoInicial = System.nanoTime();

		long somatoria = 0;
		for (long i = 1; i < 1000000; i++) {
			somatoria += i;
		}

		double tempoFinal = System.nanoTime();

		System.out.println("Resultado: " + somatoria);
		System.out.println("Tempo (ms): " + ((tempoFinal - tempoInicial) / 1000000));
	}

}