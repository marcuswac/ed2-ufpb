package s3;

public class BuscaLinear implements Busca {
	
	public int busca(int[] A, int x) {
		return buscaSequencial(A, x);
	}

	public static int buscaSequencial(int[] A, int x) {
		for (int i = 0; i < A.length; i++) {
			if (x == A[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] A = { 8, 10, 6, 2, 9, 5 };
		int elemento = 6;
		Busca buscaSequencial = new BuscaLinear();
		int index = buscaSequencial.busca(A, elemento);

		if (index != -1) {
			System.out.println("Elemento " + elemento + " encontrado no índice " + index);
		} else {
			System.out.println("Elemento não encontrado no array");
		}
	}
}
