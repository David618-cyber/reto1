package PKmain;

import java.util.Scanner;

import PKfunciones.Funcion2;
import PKfunciones.Función1;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		int n1 = 0;
		int n2 = 0;
		do {
			try {
				System.out.println("Elige la operación :");
				System.out.println("1. Sumar");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicación");
				System.out.println("4. División");
				System.out.println("5. Par");
				System.out.println("6. Impar");
				System.out.println("7. Positivo");
				System.out.println("8. negativo");
				System.out.println("0. Salir");
				String s = sc.nextLine();
				resultado = Integer.parseInt(s);
				if (resultado <= 4) {
					System.out.println("Escribe primer nº");
					String s1 = sc.nextLine();
					n1 = Integer.parseInt(s1);

					System.out.println("Escribe segundo nº");
					String s2 = sc.nextLine();
					n2 = Integer.parseInt(s2);
				}
				if (resultado >= 5) {
					System.out.println("Escribe primer nº");
					String s1 = sc.nextLine();
					n1 = Integer.parseInt(s1);

				}

				switch (resultado) {
				case 1:

					System.out.println("El resultado de la suma es: " + Función1.sumar(n1, n2));

					break;
				case 2:

					System.out.println("El resultado de la resta es: " + Función1.resta(n1, n2));
					System.out.println();
					break;
				case 3:

					System.out.println("El resultado de la resta es: " + Funcion2.multiplicar(n1, n2));
					break;
				case 4:

					System.out.println("El resultado de la resta es: " + Funcion2.dividir(n1, n2));
					break;
				case 5:

					System.out.println("el resultado es: " + Función1.esPar(n1));
					break;
				case 6:

					System.out.println("el resultado es: " + Función1.esImpar(n1));
					break;
				case 7:

					System.out.println("el resultado es: " + Funcion2.esPositivo(n1));
					break;
				case 8:

					System.out.println("el resultado es: " + Funcion2.esNegativo(n1));
					break;
				case 0:
					System.out.println("Salir");
					break;

				}
			} catch (Exception e) {
				System.out.println("Valor introducido por consola no es válido.");
			}
		} while (!(resultado >= 0 && resultado < 9));

	}

}
