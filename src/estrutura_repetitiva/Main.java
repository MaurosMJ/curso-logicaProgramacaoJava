package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ex30();
	}

	public static void ex1() {

		// URI 1051 - Imposto de Renda

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}

	public static void ex2() {

		// URI 1113 - Crescente e decrescente

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = -1;
		int y = 1;

		while (x != y) {

			x = sc.nextInt();
			y = sc.nextInt();

			if (x > y) {
				System.out.println("Decrescente");
			} else if (x == y) {
				break;
			} else {
				System.out.println("Crescente");
			}

		}
		sc.close();
	}

	public static void ex3() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		int sum = 0;
		double count = 0;
		if (x < 0) {
			System.out.println("Impossivel calcular");
			return;
		}
		while (x > 0) {
			sum += x;
			count++;
			x = sc.nextInt();
		}
		System.out.println(String.format("%.2f", sum / count));
		sc.close();
	}

	public static void ex4() {

		// URI 1114 - Senha Fixa

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();
	}

	public static void ex5() {

		// URI 1115 - Quadrante

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

	public static void ex6() {

		// URI 1117 - Validação de Nota

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}

		double nota2 = sc.nextDouble();
		while (nota2 < 0.0 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}

		double media = (nota1 + nota2) / 2.0;
		System.out.printf("media = %.2f%n", media);

		sc.close();
	}

	public static void ex7() {

		// URI 1134 - Tipo de Combustível

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

	public static void ex8() {

		// URI 1154 - Idades

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;

		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}

		double media = (double) soma / cont;
		System.out.printf("%.2f%n", media);

		sc.close();
	}

	public static void ex9() {

		// URI 1159 - Soma de Pares Consecutivos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {

			// se for impar, some mais 1
			if (x % 2 != 0) {
				x = x + 1;
			}

			// expressao simplificada: 5 * x + 20
			int soma = x + x + 2 + x + 4 + x + 6 + x + 8;
			System.out.println(soma);

			x = sc.nextInt();
		}

		sc.close();
	}

	public static void ex10() {

		// URI 1118 - Várias Notas Com Validação

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int novoCalculo = 1;

		while (novoCalculo == 1) {
			double nota1 = sc.nextDouble();
			while (nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}

			double nota2 = sc.nextDouble();
			while (nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}

			double media = (nota1 + nota2) / 2.0;
			System.out.printf("media = %.2f%n", media);

			System.out.println("novo calculo (1-sim 2-nao)");
			novoCalculo = sc.nextInt();
			while (novoCalculo != 1 && novoCalculo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				novoCalculo = sc.nextInt();
			}
		}

		sc.close();
	}

	public static void ex11() {

		// URI 1131 - Grenais

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int novoGrenal = 1;

		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				vitoriasInter = vitoriasInter + 1;
			} else if (golsGremio > golsInter) {
				vitoriasGremio = vitoriasGremio + 1;
			} else {
				empates = empates + 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}

		int total = vitoriasGremio + vitoriasInter + empates;

		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();
	}

	public static void ex12() {

		// URI 1078 - Tabuada

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		if (input > 1 && input < 1000) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " x " + input + " = " + (i * input));
			}
		}

		sc.close();
	}

	public static void ex13() {

		// URI 1071 - Soma de Impares Consecutivos I

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;

		for (y = y + 1; y < x; y++) {
			if (y % 2 != 0) {
				sum += y;
			}
		}

		System.out.println(sum);
		sc.close();
	}

	public static void ex14() {

		// URI - 1067: Números Ímpares

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

	public static void ex15() {

		// URI - 1072: Intervalo 2

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

	public static void ex16() {

		// URI - 1074: Par ou Ímpar

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();

			if (x == 0) {
				System.out.println("NULL");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else {
				System.out.println("ODD NEGATIVE");
			}
		}

		sc.close();
	}

	public static void ex17() {

		// URI - 1079: Médias Ponderadas

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

	public static void ex18() {

		// URI - 1116: Dividindo X por Y

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();
	}

	public static void ex19() {

		// URI - 1132: Múltiplos de 13

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int menor = x;
		int maior = y;

		if (x > y) {
			menor = y;
			maior = x;
		}

		int soma = 0;
		for (int i = menor; i <= maior; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}

		System.out.println(soma);

		sc.close();
	}

	public static void ex20() {

		// URI - 1153: Fatorial Simples

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		sc.close();
	}

	public static void ex21() {

		// URI - 1157: Divisores I

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

	public static void ex22() {

		// URI - 1080: Maior e Posição

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int maior = sc.nextInt();
		int posicao = 1;

		for (int i = 2; i <= 100; i++) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = i;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);

		sc.close();
	}

	public static void ex23() {

		// URI - 1094: Experiências

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;

		for (int i = 0; i < n; i++) {

			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);

			if (tipo == 'C') {
				coelhos = coelhos + quantia;
			} else if (tipo == 'R') {
				ratos = ratos + quantia;
			} else {
				sapos = sapos + quantia;
			}
		}

		int total = coelhos + ratos + sapos;
		double porcentagemCoelhos = (double) coelhos / total * 100.0;
		double porcentagemRatos = (double) ratos / total * 100.0;
		double porcentagemSapos = (double) sapos / total * 100.0;

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapos);

		sc.close();
	}

	public static void ex24() {

		// URI - 1142: PUM

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int inicio = 1;

		for (int i = 1; i <= n; i++) {

			int segundo = inicio + 1;
			int terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);

			inicio = inicio + 4;
		}

		sc.close();
	}

	public static void ex25() {

		// URI - 1143: Quadrado e ao Cubo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
		}

		sc.close();
	}

	public static void ex26() {

		// URI - 1144: Sequência Lógica

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
			System.out.printf("%d %d %d%n", i, segundo + 1, terceiro + 1);
		}

		sc.close();
	}

	public static void ex27() {

		// URI - 1145: Sequência Lógica 2

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 1; i <= y; i++) {
			System.out.print(i);
			if (i % x == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}

		sc.close();
	}

	public static void ex28() {

		// URI - 1146: Sequências Crescentes

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {

			for (int i = 1; i < x; i++) {
				System.out.print(i + " ");
			}
			System.out.println(x);

			x = sc.nextInt();
		}

		sc.close();
	}

	public static void ex29() {

		// URI - 1101: Sequência de Números e Soma

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		while (m > 0 && n > 0) {

			int menor = m;
			int maior = n;

			if (m > n) {
				menor = n;
				maior = m;
			}

			int soma = 0;
			for (int i = menor; i <= maior; i++) {
				soma = soma + i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + soma);

			m = sc.nextInt();
			n = sc.nextInt();
		}

		sc.close();
	}

	public static void ex30() {

		// URI - 1158: Soma de Ímpares Consecutivos III

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			int soma = 0;
			int cont = 0;
			for (int j = x; cont < y; j++) {
				if (j % 2 != 0) {
					soma = soma + j;
					cont = cont + 1;
				}
			}

			System.out.println(soma);
		}

		sc.close();
	}
}
