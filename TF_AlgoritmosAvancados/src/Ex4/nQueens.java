package Ex4;

public class nQueens {
			
		/**
		 * 1) Start in the leftmost column
			2) If all queens are placed
	    return true
			3) Try all rows in the current column.  Do following for every tried row.
	    a) If the queen can be placed safely in this row then mark this [row, 
	        column] as part of the solution and recursively check if placing queen here leads to a solution.
	    b) If placing the queen in [row, column] leads to a solution then return 
	        true.
	    c) If placing queen doesn't lead to a solution then umark this [row, 
	        column] (Backtrack) and go to step (a) to try other rows.
	3) If all rows have been tried and nothing worked, return false to trigger 
	    backtracking.
		 */
		
		public static void main(String[] args) {
			int[][] m = {
					{0,0,0,0},
					{0,0,0,0},
					{0,0,0,0},
					{0,0,0,0}
				};
			new nQueens().test(m, 4, 0);
		}
		
		void test(int[][] matrix, int N, int r) {
			if(r == N) {
				printaMatriz(matrix);
				return;
			}
			for(int i=0; i<matrix.length; i++) {
				for(int j=0; j<matrix[i].length; j++) {
					if(matrix[i][j]==0) {
						matrix[i][j] = 1;	
						test(matrix, N, r+1);
						return;
					}
				}
			}
		}
		
		void pintaPreto(int[][] matrix, int i, int j) {
			
		}
			
		void printaMatriz(int[][] m) {
			for(int i=0; i<m.length; i++) {
				for(int j=0; j<m[i].length; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
