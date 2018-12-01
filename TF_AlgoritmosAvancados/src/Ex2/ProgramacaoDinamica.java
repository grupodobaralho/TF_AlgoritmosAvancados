package Ex2;

/**
 * Trabalho Final da disciplina de Algoritmos Avançados
 * PUCRS - 2018/2 
 * @authors Bruna Prauchner, Israel Deorce e Mayara Oliveira.
 *
 */
public class ProgramacaoDinamica {

	static int count = 0;
	static int[][] matriz_acc;

	public static void main(String[] args) {
		ProgramacaoDinamica ex2 = new ProgramacaoDinamica();

		int[] peso 		=	{ 2, 1, 4, 1, 12 };
		int[] utilidade = 	{ 2, 1, 10, 2, 4 };
		int nPecas = 5;
		int capacidadeMochila = 15;

		// E1 - Forca Bruta
		int res = ex2.Mochila_B_Rec(peso, utilidade, nPecas - 1, capacidadeMochila);
		System.out.println("E1 Forca Bruta -> Peso max: " + res + "; N Interacoes: " + count);
		System.out.println("A Complexidade eh: O(n*2^n)");

		count = 0;

		// E2
		matriz_acc = new int[capacidadeMochila][nPecas+1];
		ex2.Mochila_Dinamica(peso, utilidade, nPecas, capacidadeMochila);
	
		for(int i=0; i< capacidadeMochila; i++) {
			for(int j=0; j<nPecas+1; j++) {
				System.out.print(matriz_acc[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("E2 Prog. Dinamica; N Interacoes: " + count);
		System.out.println("A Complexidade eh: O(n * capacidadeMochila)");
	}

	public int Mochila_B_Rec(int[] p, int[] u, int n, int M) {
		count++;
		int A, B;
		if (n == -1) {
			return 0;
		} else {
			A = Mochila_B_Rec(p, u, n - 1, M);
			if (p[n] > M) {
				return A;
			} else {
				B = u[n] + Mochila_B_Rec(p, u, n - 1, M - p[n]);
				return Math.max(A, B);
			}
		}
	}

	public void Mochila_Dinamica(int[] p, int[] u, int n, int M) {
		int valor1, valor2;
		for (int i = 0; i < n; i++) {
			matriz_acc[0][i] = 0;
		}
		for (int i = 1; i < M; i++) {
			matriz_acc[i][0] = 0;
			for (int j = 1; j < n; j++) {
				count++;
				valor1 = matriz_acc[i][j - 1];
				if (p[j - 1] > i) {
					valor2 = 0;
				} else {
					valor2 = matriz_acc[(i - p[j - 1])][j - 1] + u[j - 1];
				}

				if (valor1 > valor2) {
					matriz_acc[i][j] = valor1;
				} else {
					matriz_acc[i][j] = valor2;
				}
			}
		}
	}
}
