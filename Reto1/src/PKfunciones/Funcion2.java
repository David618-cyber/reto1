package PKfunciones;

public class Funcion2 {
	// multiplicar(int a, int b) → Devuelve int el producto de a y b.
	// o dividir(int a, int b) → Devuelve int la división de a entre b, con validación para evitar división por cero.
	// esPositivo(int n) → Devuelve boolean True si es mayor o igual 0 y False si no
	// o esNegativo(int n) → Devuelve boolean True si es menor de 0 y False si no
	public static int multiplicar(int n1,int n2) {
		return n1*n2;
	}
	public static int dividir(int n1,int n2) {
		if (n2!=0) {
			return n1/n2;
		}
		return 0;
	}
	public static boolean esPositivo(int n1) {
		if (n1>=0) {
			return true;
		}
		return false;
	}
	public static boolean esNegativo(int n1) {
		if (n1>=0) {
			return true;
		}
		return false;
	}
	
}
