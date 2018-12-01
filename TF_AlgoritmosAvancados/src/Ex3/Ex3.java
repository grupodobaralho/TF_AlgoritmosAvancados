package Ex3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Trabalho Final da disciplina de Algoritmos Avançados
 * PUCRS - 2018/2 
 * @authors Bruna Prauchner, Israel Deorce e Mayara Oliveira.
 *
 */
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
}