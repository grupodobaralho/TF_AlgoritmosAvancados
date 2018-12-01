package Ex3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.youtube.com/watch?v=HzeK7g8cD0Y
// Idianos sao top
// Subcolecao Disjunta Maxima

public class Ex3 {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		List<Integer> f = new ArrayList<>();
		s.addAll(Arrays.asList(2, 4, 1, 6, 4, 6,  7,  9,  9,  3, 13));
		f.addAll(Arrays.asList(4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));

		Ex3 ex3 = new Ex3();
		List<Integer> x = ex3.sdmGuloso(s, f, s.size());
		System.out.println(x.toString());
	}

	public List<Integer> sdmGuloso(List<Integer> s, List<Integer> f, int n) {
		f.set(0, Integer.MIN_VALUE);
		List<Integer> X = new ArrayList<>();
		int i = 0;
		for (int k = 1; k < n; k++) {
			if (s.get(k) > f.get(i)) {
				X.add(k);
				i = k;
			}
		}
		return X;
	}
	
//	public List<Integer> sdm(List<Integer> s, List<Integer> f, int n) {
//		List<Integer> X = new ArrayList<>();
//		List<Integer> Y = new ArrayList<>();
//		int i;
//		if (n <= 1) {
//			List<Integer> r = new ArrayList<>();
//			if (n == 0) {
//				return r;
//			} else {
//				r.add(1);
//				return r;
//			}
//		} else {
//			X = sdm(s, f, n - 1);
//			i = n;
//			for (i = 0; i != 0 || f.get(i) < s.get(n); i++) {
//				Y = sdm(s, f, i);
//				// return Math.max(X, Y.add(n));
//				// devolva max (X , X′ ∪ {n})
//			}
//
//		}
//		return null;
//	}

// s.addAll(Arrays.asList(4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9));
// f.addAll(Arrays.asList(8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12));
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