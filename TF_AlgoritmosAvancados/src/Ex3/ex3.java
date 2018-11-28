package Ex3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ex3 {
	
	public static void main(String[] args) {
//		Set<Set<Integer>> conjuntao = new LinkedHashSet<>();
//		
//		Set<Integer> conjunto1 = new LinkedHashSet<>();
//		conjunto1.add(4);
//		conjunto1.add(5);
//		conjunto1.add(6);
//		conjunto1.add(7);
//		conjunto1.add(8);
//		Set<Integer> conjunto2 = new LinkedHashSet<>();
//		conjunto2.add(6);
//		conjunto2.add(7);
//		Set<Integer> conjunto3 = new LinkedHashSet<>();
//		conjunto3.add(13);
//		conjunto3.add(14);
//		Set<Integer> conjunto4 = new LinkedHashSet<>();
//		conjunto4.add(4);
//		conjunto4.add(5);
//		Set<Integer> conjunto5 = new LinkedHashSet<>();
//		conjunto5.add(2);
//		conjunto5.add(3);
//		conjunto5.add(4);
//		Set<Integer> conjunto6 = new LinkedHashSet<>();
//		conjunto6.add(6);
//		conjunto6.add(7);
//		conjunto6.add(8);
//		conjunto6.add(9);
//		Set<Integer> conjunto7 = new LinkedHashSet<>();
//		conjunto7.add(7);
//		conjunto7.add(8);
//		conjunto7.add(9);
//		conjunto7.add(10);
//		Set<Integer> conjunto8 = new LinkedHashSet<>();
//		conjunto8.add(9);
//		conjunto8.add(10);
//		conjunto8.add(11);
//		Set<Integer> conjunto9 = new LinkedHashSet<>();
//		conjunto9.add(1);
//		conjunto9.add(2);
//		conjunto9.add(3);
//		conjunto9.add(4);
//		conjunto9.add(5);
//		conjunto9.add(6);
//		Set<Integer> conjunto10 = new LinkedHashSet<>();
//		conjunto10.add(3);
//		conjunto10.add(4);
//		conjunto10.add(5);
//		conjunto10.add(6);
//		conjunto10.add(7);
//		conjunto10.add(8);
//		conjunto10.add(9);
//		conjunto10.add(10);
//		conjunto10.add(11);
//		conjunto10.add(12);
//		conjunto10.add(13);
//		Set<Integer> conjunto11 = new LinkedHashSet<>();
//		conjunto11.add(9);
//		conjunto11.add(10);
//		conjunto11.add(11);
//		conjunto11.add(12);	
//		
//		conjuntao.add(conjunto1);
//		conjuntao.add(conjunto2);
//		conjuntao.add(conjunto3);
//		conjuntao.add(conjunto4);
//		conjuntao.add(conjunto5);
//		conjuntao.add(conjunto6);
//		conjuntao.add(conjunto7);
//		conjuntao.add(conjunto8);
//		conjuntao.add(conjunto9);
//		conjuntao.add(conjunto10);
//		conjuntao.add(conjunto11);
//		
//		System.out.println(conjuntao);		
		
		
		int[] s = {4,6, 13, 4, 2, 6, 7, 9, 1, 3, 9};
		int[] f = {8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};
		
		
	}
	
	public int[] sdm(int[] s, int[] f, int n) {
		int[] X;
		int[] Y;
		int i;
		if( n <= 1) {
			if( n == 0 ) {
				return new int[0];
			} else {
				return new int[]{1};
			}
		} else {
			X = sdm(s, f, n-1);
			i = n;
			for(i = 0; i != 0 || f[i] < s[n]; i++) {
				Y = sdm(s, f, i);
				//return Math.max(X, Y)
				//devolva max (X , X′ ∪ {n})
			}
			
		}return null;
		
	}
	
	
	
////subcoleção disjunta máxima SDM
//SDM-Recursivo (s, f, n)
//1  se n ≤ 1
//2  então se n = 0 então devolva { } senão devolva {1}
//3  senão X ← SDM-Recursivo (s, f, n−1)
//4  i ← n
//5  faça i ← i−1
//6  até que i = 0  ou  fi < sn
//7  X′ ← SDM-Recursivo (s, f, i)
//8  devolva max (X , X′ ∪ {n})

}
