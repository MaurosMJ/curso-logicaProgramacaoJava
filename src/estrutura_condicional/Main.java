package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ex16();
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

}
