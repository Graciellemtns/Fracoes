package principal;

import org.apache.commons.math3.fraction.Fraction;

import utilitarios.Utilitarios;

public class Fracao {

	public static void main(String[] args) {

		Fraction a = new Fraction(0.25);
		Fraction b = new Fraction(1, 3);

		Utilitarios.ImprimeFracao(a, b);
		Utilitarios.Separador();
		Utilitarios.ImprimirSoma(a, b);
		Utilitarios.Separador();
		Utilitarios.ImprimirSubtracao(a, b);

	}

}
