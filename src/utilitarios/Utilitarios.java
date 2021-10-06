package utilitarios;

import org.apache.commons.math3.fraction.Fraction;

public class Utilitarios {

	public static void ImprimeFracao(Fraction a, Fraction b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void Separador() {
		System.out.println("********************");
		
	}

	public static void ImprimirSoma(Fraction a, Fraction b) {
		Fraction resultado = a.add(b);
		System.out.println("ADICAO");
		System.out.println(a + " + " + b + " = " + resultado);
	}
	
	public static void ImprimirSubtracao(Fraction a, Fraction b) {
		Fraction resultado = a.subtract(b);
		System.out.println("SUBTRACAO");
		System.out.println(a + " - " + b + " = " + resultado);
	}

}
