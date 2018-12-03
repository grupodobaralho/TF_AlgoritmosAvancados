package Ex4;

/**
 * Trabalho Final da disciplina de Algoritmos Avançados PUCRS - 2018/2
 * 
 * @authors Bruna Prauchner, Israel Deorce e Mayara Oliveira.
 *
 */
public class nQueens {
	final int N = 4;
	static int k = 1;

	public void imprimeMatrix(int matrix[][]) {

		System.out.println("Solucao " + k++ + ":");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	// Método para verificar se é seguro colocar uma rainha
	// em tal lugar
	public boolean isSafe(int matrix[][], int row, int col) {
		int i, j;

		// Verificar linha do lado esquerdo
		for (i = 0; i < col; i++)
			if (matrix[row][i] == 1)
				return false;

		// Verificar diagonal de cima, lado esquerdo
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (matrix[i][j] == 1)
				return false;

		// Verificar diagonal debaixo, lado esquerdo
		for (i = row, j = col; j >= 0 && i < N; i++, j--)
			if (matrix[i][j] == 1)
				return false;

		return true;
	}

	public boolean solveNQUtil(int matrix[][], int col) {
		// Caso base: as rainhas ja estao alocadas corretamente
		if (col == N) {
			imprimeMatrix(matrix);
			return true;
		}

		// Considera a coluna e tenta encaixar a rainha em todas as
		// linhas uma por uma
		boolean res = false;
		for (int i = 0; i < N; i++) {

			// Verifica se é seguro colocar a rainha ali
			if (isSafe(matrix, i, col)) {
				matrix[i][col] = 1; // se for, coloca 1

				// Chamada recursiva e poe result TRUE se for possivel encaixar
				res = solveNQUtil(matrix, col + 1) || res;

				// Parte do backtracking: Se colocar uma rainha
				// em uma posicao que nao leva para a solucao correta
				// a rainha é removida, e volta ao estado de antes
				matrix[i][col] = 0; // BACKTRACK
			}
		}

		// Se nao puder colocar rainha em nenhuma linha desta coluna, retorna falso;
		return res;
	}

	public boolean solveNQ() {
		// Cria matriz
		int matrix[][] = new int[N][N];

		// Tenta resolver o problema retornando true ou false
		if (solveNQUtil(matrix, 0) == false) {
			System.out.print("Não existe solução");
			return false;
		}

		return true;
	}

	public static void main(String args[]) {
		nQueens Queen = new nQueens();
		Queen.solveNQ();
	}
}
// Este codigo foi baseado na solução que o site geeksforgeeks explica
// https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/ 