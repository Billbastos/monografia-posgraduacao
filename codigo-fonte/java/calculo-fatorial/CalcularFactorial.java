import java.math.BigInteger;

public class CalcularFactorial {

	public BigInteger factorial(BigInteger f, BigInteger n) {
		if (n.compareTo(new BigInteger("1")) == 0)
			return f;
		else
			return factorial(f.multiply(n), n.subtract(new BigInteger("1")));
	}

	public static void main(String[] args) {
		double tempoInicial = System.nanoTime();
		
		CalcularFactorial c = new CalcularFactorial();
		BigInteger resultado = c.factorial(new BigInteger("1"),  new BigInteger("50"));
		
		double tempoFinal = System.nanoTime();

		System.out.println("Resultado: " + resultado);
		System.out.println("Tempo (ms): " + ((tempoFinal - tempoInicial) / 1000000));
	}
}

