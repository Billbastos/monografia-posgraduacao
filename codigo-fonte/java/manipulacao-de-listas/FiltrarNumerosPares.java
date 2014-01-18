import java.util.ArrayList;
import java.util.List;

public class FiltrarNumerosPares {

	public static void main(String[] args) {
		double tempoInicial = System.nanoTime();

		List<Long> resultado = new ArrayList<Long>();

		for (long numero = 1; numero <= 1000000; numero++) {
			if (numero % 2 == 0) {
				resultado.add(numero);
			}
		}

		double tempoFinal = System.nanoTime();

		System.out.println("Resultado: " + resultado.size());
		System.out.println("Tempo (ms): " + ((tempoFinal - tempoInicial) / 1000000));
	}

}

