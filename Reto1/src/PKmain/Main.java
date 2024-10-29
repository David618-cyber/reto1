package PKmain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
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
				switch (resultado) {

				}
				switch (resultado) {
				case 1 :
					System.out.println();
					break;
				case 2:
					System.out.println();
					break;
				case 3:
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				case 5:
					System.out.println();
					break;
				case 6:
					System.out.println();
					break;
				case 7:
					System.out.println();
					break;
				case 8:
					System.out.println();
					break;
				case 0:

					break;

				}
			} catch (Exception e) {
				System.out.println("Valor introducido por consola no es válido.");
			}
		} while (!(resultado >= 0 && resultado < 9));

	}

}
