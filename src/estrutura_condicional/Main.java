package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ex48();
	}

	public static void ex1() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double media = n1 + n2;
		System.out.println("NOTA FINAL = " + media);
		if (media < 60f) {
			System.out.println("REPROVADO");
		}
		sc.close();
	}

	public static void ex2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2.0) - (4.0 * a * c);

		if (a <= 0 || delta <= 0) {
			System.out.println("Impossivel calcular");
			return;
		}

		double resultR1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double resultR2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("R1 = " + String.format("%.5f", resultR1));
		System.out.println("R2 = " + String.format("%.5f", resultR2));
		sc.close();
	}

	public static void ex3() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int menor = a;
		if (menor > b) {
			menor = b;
		} else if (menor > c) {
			menor = c;
		}
		System.out.println("Menor = " + menor);
		sc.close();
	}

	public static void ex4() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		double valor = 50.0;

		if (a < 100) {
			System.out.println("Valor a pagar: " + String.format("%.2f", valor));
		} else {
			valor += (a - 100.0) * 2f;
			System.out.println("Valor a pagar: " + String.format("%.2f", valor));
		}
		sc.close();
	}

	public static void ex5() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		switch (x) {
		case 1:
			System.out.println("Dia da semana: domingo");
			break;
		case 2:
			System.out.println("Dia da semana: segunda");
			break;
		case 3:
			System.out.println("Dia da semana: terça");
			break;
		case 4:
			System.out.println("Dia da semana: quarta");
			break;
		case 5:
			System.out.println("Dia da semana: quinta");
			break;
		case 6:
			System.out.println("Dia da semana: sexta");
			break;
		case 7:
			System.out.println("Dia da semana: sabado");
			break;
		default:
			System.out.println("Dia da semana: valor invalido");
		}
		sc.close();
	}

	public static void ex6() {

		// URI 1035 - Teste de Seleção 1

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && d % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores não aceitos");
		}
		sc.close();
	}

	public static void ex8() {

		// URI 1037 - Intervalo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a >= 0 && a <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (a > 25 && a <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if (a > 50 && a <= 75) {
			System.out.println("Intervalo [50,75]");
		} else if (a > 75 && a <= 100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

	}

	public static void ex9() {

		// URI 1038 - Lanche

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		int qtd = sc.nextInt();

		switch (id) {
		case 1:
			System.out.println("Total: R$ " + String.format("%.2f", qtd * 4.00));
			break;
		case 2:
			System.out.println("Total: R$ " + String.format("%.2f", qtd * 4.50));
			break;
		case 3:
			System.out.println("Total: R$ " + String.format("%.2f", qtd * 5.00));
			break;
		case 4:
			System.out.println("Total: R$ " + String.format("%.2f", qtd * 2.00));
			break;
		case 5:
			System.out.println("Total: R$ " + String.format("%.2f", qtd * 1.50));
			break;
		}

	}

	public static void ex10() {

		// URI 1040 - Média 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();

		float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;
		System.out.printf("Media: %.1f%n", media);

		if (media >= 7f) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5f) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float mediaFinal = (notaExame + media) / 2f;
			if (mediaFinal >= 5f) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}

		sc.close();

	}

	public static void ex11() {

		// URI 1041 - Coordenadas de um Ponto
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		sc.close();

	}

	public static void ex12() {
		// URI 1044 - Múltiplos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}

	public static void ex13() {
		// URI 1045 - Tipos de Triângulos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double A, B, C;
		if (n1 > n2 && n1 > n3) {
			A = n1;
			if (n2 > n3) {
				B = n2;
				C = n3;
			} else {
				B = n3;
				C = n2;
			}
		} else if (n2 > n3) {
			A = n2;
			if (n1 > n3) {
				B = n1;
				C = n3;
			} else {
				B = n3;
				C = n1;
			}
		} else {
			A = n3;
			if (n1 > n2) {
				B = n1;
				C = n2;
			} else {
				B = n2;
				C = n1;
			}
		}

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (A * A == B * B + C * C) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (A * A > B * B + C * C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		sc.close();

	}

	public static void ex14() {
		// URI 1046 - Tempo de Jogo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

	public static void ex15() {
		// URI 1047 - Tempo de Jogo com Minutos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();

		int instanteInicial = horaInicial * 60 + minutoInicial;
		int instanteFinal = horaFinal * 60 + minutoFinal;

		int duracao;
		if (instanteInicial < instanteFinal) {
			duracao = instanteFinal - instanteInicial;
		} else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}

		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;

		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

		sc.close();
	}

	public static void ex16() {
		// URI 1048 - Aumento de Salário

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double percentual;
		if (salario <= 400.0) {
			percentual = 15.0;
		} else if (salario <= 800.0) {
			percentual = 12.0;
		} else if (salario <= 1200.0) {
			percentual = 10.0;
		} else if (salario <= 2000.0) {
			percentual = 7.0;
		} else {
			percentual = 4.0;
		}

		double reajuste = salario * percentual / 100.0;
		double novoSalario = salario + reajuste;

		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);

		sc.close();
	}

	public static void ex17() {

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

	public static void ex18() {

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

	public static void ex19() {

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

	public static void ex20() {

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

	public static void ex21() {

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

	public static void ex22() {

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

	public static void ex23() {

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

	public static void ex24() {

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

	public static void ex25() {

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

	public static void ex26() {

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

	public static void ex27() {

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

	public static void ex28() {

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

	public static void ex29() {

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

	public static void ex31() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	public static void ex32() {

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

	public static void ex33() {

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

	public static void ex34() {

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

	public static void ex35() {

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

	public static void ex36() {

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

	public static void ex7() {

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

	public static void ex38() {

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

	public static void ex39() {

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

	public static void ex40() {

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

	public static void ex41() {

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

	public static void ex42() {

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

	public static void ex43() {

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

	public static void ex44() {

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

	public static void ex45() {

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

	public static void ex46() {

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

	public static void ex47() {

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

	public static void ex48() {

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
