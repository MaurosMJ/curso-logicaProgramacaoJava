package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ex12();

	}

	public static void ex1() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tam = sc.nextInt();
		int[] vet = new int[tam];

		for (int i = 0; i < tam; i++) {
			vet[i] = sc.nextInt();
		}

		for (int c : vet) {
			if (c < 0) {
				System.out.println(c);
			}
		}
		sc.close();
	}

	public static void ex2() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tam = sc.nextInt();
		double[] vet = new double[tam];
		double sum = 0;

		for (int i = 0; i < tam; i++) {
			vet[i] = sc.nextDouble();
		}

		for (double c : vet) {
			System.out.print(c + " ");
			sum += c;
		}

		System.out.println("\n" + String.format("%.2f", sum));
		System.out.println(String.format("%.2f", sum / tam));

		sc.close();
	}

	public static void ex3() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tam = sc.nextInt();
		String[] nome = new String[tam];
		int[] idade = new int[tam];
		double[] alt = new double[tam];
		int cont = 0;
		double altura = 0;

		for (int i = 0; i < tam; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			alt[i] = sc.nextDouble();
		}

		for (int i = 0; i < tam; i++) {

			if (idade[i] < 16) {
				cont++;
			}

			altura += alt[i];
		}

		System.out.println("Altura média: " + String.format("%.2f", altura / tam));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", (double) (100f * cont) / tam));

		sc.close();
	}

	public static void ex4() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double maior = vet[0];
		int posicaoMaior = 0;

		for (int i = 1; i < N; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}
		}

		System.out.printf("%.1f%n", maior);
		System.out.println(posicaoMaior);

		sc.close();
	}

	public static void ex5() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();

		int quantidadeDePares = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				quantidadeDePares++;
			}
		}
		System.out.println(quantidadeDePares);

		sc.close();
	}

	public static void ex6() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = A[i] + B[i];
		}

		for (int i = 0; i < N; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();

		sc.close();
	}

	public static void ex7() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		double media = soma / N;
		System.out.printf("%.3f%n", media);

		for (int i = 0; i < N; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}

		sc.close();
	}

	public static void ex8() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double somaDosPares = 0.0;
		int quantidadeDePares = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				somaDosPares = somaDosPares + vet[i];
				quantidadeDePares++;
			}
		}

		if (quantidadeDePares == 0) {
			System.out.println("Nao havia nenhum numero par");
		} else {
			double media = somaDosPares / quantidadeDePares;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

	public static void ex9() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}

		int maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;

		for (int i = 1; i < N; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}

		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);

		sc.close();
	}

	public static void ex10() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		double[] notasSemestre1 = new double[N];
		double[] notasSemestre2 = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			notasSemestre1[i] = sc.nextDouble();
			notasSemestre2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < N; i++) {
			double media = (notasSemestre1[i] + notasSemestre2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();
	}

	public static void ex11() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] alturas = new double[N];
		char[] sexos = new char[N];

		for (int i = 0; i < N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}

		double menorAltura = alturas[0];
		for (int i = 1; i < N; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);

		double maiorAltura = alturas[0];
		for (int i = 1; i < N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		double somaDasAlturasDasMulheres = 0.0;
		int contMulheres = 0;
		for (int i = 0; i < N; i++) {
			if (sexos[i] == 'F') {
				somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + alturas[i];
				contMulheres++;
			}
		}

		if (contMulheres == 0) {
			System.out.println("Nao ha nenhuma mulher dentre as pessoas");
		} else {
			double media = somaDasAlturasDasMulheres / contMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		}

		int contHomens = 0;
		for (int i = 0; i < N; i++) {
			if (sexos[i] == 'M') {
				contHomens++;
			}
		}
		System.out.println("Numero de homens = " + contHomens);

		sc.close();
	}

	public static void ex12() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}

		int contAbaixoDe10 = 0;
		int contEntre10E20 = 0;
		int contAcimaDe20 = 0;
		for (int i = 0; i < N; i++) {

			double lucro = venda[i] - compra[i];

			double porcentagemDeLucro = lucro / compra[i] * 100.0;

			if (porcentagemDeLucro < 10.0) {
				contAbaixoDe10++;
			} else if (porcentagemDeLucro <= 20.0) {
				contEntre10E20++;
			} else {
				contAcimaDe20++;
			}
		}
		System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
		System.out.println("Lucro acima de 20%: " + contAcimaDe20);

		double totalCompra = 0.0;
		double totalVenda = 0.0;
		for (int i = 0; i < N; i++) {
			totalCompra = totalCompra + compra[i];
			totalVenda = totalVenda + venda[i];
		}

		double totalLucro = totalVenda - totalCompra;

		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);

		sc.close();
	}

}
