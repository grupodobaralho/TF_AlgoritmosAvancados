package Ex1;

public class DivisaoEConquista {

	static int count = 0;

	public static void main(String[] args) {
		DivisaoEConquista ex1 = new DivisaoEConquista();

		System.out.println("pow1 -> n=2 : " + ex1.pow1(2, 2) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("pow1 -> n=4 : " + ex1.pow1(2, 4) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("pow1 -> n=8 : " + ex1.pow1(2, 8) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("pow1 -> n=16 : " + ex1.pow1(2, 16) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("A Complexidade eh: O(n)");

		System.out.println("--------------------------------------------------------");

		System.out.println("pow2 -> n=2 : " + ex1.pow2(2, 2) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("pow2 -> n=4 : " + ex1.pow2(2, 4) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("pow2 -> n=8 : " + ex1.pow2(2, 8) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("pow2 -> n=16 : " + ex1.pow2(2, 16) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("A Complexidade eh: O(n log n)");
		
		System.out.println("--------------------------------------------------------");

		System.out.println("fiboRec -> n=2 : " + ex1.fibonacci(2) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("fiboRec -> n=4 : " + ex1.fibonacci(4) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("fiboRec -> n=8 : " + ex1.fibonacci(8) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("fiboRec -> n=16 : " + ex1.fibonacci(16) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("A Complexidade eh: O(2^n)");

		System.out.println("--------------------------------------------------------");

		System.out.println("memoized_fibo -> n=2 : " + ex1.memoized_fibo(new int[3], 2) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("memoized_fibo -> n=4 : " + ex1.memoized_fibo(new int[5], 4) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("memoized_fibo -> n=8 : " + ex1.memoized_fibo(new int[9], 8) + "; N Iteracoes: " + count);
		count = 0;
		System.out
				.println("memoized_fibo -> n=16 : " + ex1.memoized_fibo(new int[17], 16) + "; N Iteracoes: " + count);
		count = 0;
		System.out.println("A Complexidade eh: O(2n)");
	}

	// 1) Exponenciação 1 - testar para n = 2, 4, 8, 16
	public int pow1(int a, int n) {
		int p = 1;
		for (int i = 0; i < n; i++) {
			count++;
			p = p * a;
		}
		return p;
	}

	// 2) Exponenciação 2 - testar para n = 2, 4, 8, 16
	public int pow2(int a, int n) {
		count++;
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return pow2(a, n / 2) * pow2(a, n / 2);
		else
			return pow2(a, (n - 1) / 2) * pow2(a, (n - 1) / 2) * a;
	}

	// 3) Fibonacci recursivo, para os valores 2,4,8,e 16
	public int fibonacci(int n) {
		count++;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// 4) Fibonacci com Memoização, para os valores 2, 4, 8, e 16
	public int memoized_fibo(int[] f, int n) {
		for (int i = 0; i < f.length; i++) {
			f[i] = -1;
		}
		return lookup_fibo(f, n);
	}

	public int lookup_fibo(int[] f, int n) {
		count++;
		if (f[n] >= 0)
			return f[n];
		if (n <= 1)
			f[n] = n;
		else
			f[n] = lookup_fibo(f, n - 1) + lookup_fibo(f, n - 2);
		return f[n];
	}
}
