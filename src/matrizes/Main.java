package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ex2();
	}

	public static void ex1() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tam = sc.nextInt();
		int[][] vet = new int[tam][tam];
		int count = 0;

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				vet[i][j] = sc.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if (j == i) {
					System.out.print(vet[i][j] + " ");
				}
				if (vet[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("\nQUANTIDADE DE NEGATIVOS = " + count);
		sc.close();
	}

	public static void ex2() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		double[][] vet = new double[M][N];
		double sum = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				vet[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				sum += vet[i][j];
			}
			System.out.println(sum);
			sum = 0;
		}
		sc.close();
	}

	public static void ex3() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}

		sc.close();

	}

	public static void ex4() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			int soma = 0;
			for (int j = 0; j < N; j++) {
				soma = soma + mat[i][j];
			}
			System.out.println(soma);
		}

		sc.close();

	}

	public static void ex5() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			int maior = mat[i][0];
			for (int j = 1; j < N; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}

		sc.close();
	}

	public static void ex6() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) { // j inicia com i+1
				soma = soma + mat[i][j];
			}
		}
		System.out.println(soma);

		sc.close();

	}

	public static void ex7() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] A = new int[M][N];
		int[][] B = new int[M][N];
		int[][] C = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

	public static void ex8() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[][] mat = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0.0) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

		System.out.print("LINHA ESCOLHIDA: ");
		for (int j = 0; j < N; j++) {
			System.out.printf("%.1f ", mat[linha][j]);
		}
		System.out.println();

		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		}
		System.out.println();

		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();

	}

	public static void ex9() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int fila = sc.nextInt();

		fila = fila - 1;

		int ultimoDaFila = mat[fila][N - 1];

		for (int j = N - 1; j > 0; j--) {
			mat[fila][j] = mat[fila][j - 1];
		}

		mat[fila][0] = ultimoDaFila;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
