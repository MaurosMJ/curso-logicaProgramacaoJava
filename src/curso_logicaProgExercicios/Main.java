package curso_logicaProgExercicios;

import java.util.Locale;
import java.util.Scanner;

import Utils.StrUtil;

public class Main {

	public static void main(String[] args) {
		ex25();

	}

	public static void ex1() {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100f;
		double price2 = 650.50;
		double measure = 53.234567;

		StringBuilder str = new StringBuilder();
		str.append("Products:");
		StrUtil.nextLine(str);
		str.append(product1 + ", which price is $ " + String.format("%.2f", price1));
		StrUtil.nextLine(str);
		str.append(product2 + ", which price is $ " + String.format("%.2f", price2));
		StrUtil.nextLine(str);
		StrUtil.nextLine(str);
		str.append("Record: " + age + " years old, code " + code + " and gender: " + gender);
		StrUtil.nextLine(str);
		StrUtil.nextLine(str);
		str.append("Measue with eight decimal places: " + String.format("%.8f", measure));
		StrUtil.nextLine(str);
		str.append("Rouded (three decimal places): " + String.format("%.3f", measure));
		StrUtil.nextLine(str);
		Locale.setDefault(Locale.US);
		str.append("US decimal point: " + String.format("%.3f", measure));
		System.out.println(str.toString());
		
	}

	public static void ex2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double l = sc.nextDouble();
		double h = sc.nextDouble();
		double metroq = sc.nextDouble();
		double area = l * h;
		double price = area * metroq;

		System.out.println("AREA = " + String.format("%.2f", area));
		System.out.println("PRECO = " + String.format("%.2f", price));
		sc.close();
	}

	public static void ex3() {
		// URI - Problem 1001 - Solution
		// Problema 1001 - Extremamente Básico

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = a + b;

		System.out.println("X = " + x);
		sc.close();
	}

	public static void ex4() {
		// URI - Problem 1002 - Solution
		// Problema 1002 - Área do Círculo

		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("A=" + String.format("%.4f", area));
		sc.close();
	}

	public static void ex5() {
		// URI - Problem 1003 - Solution
		// Problema 1003 - Soma Simples

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("SOMA = " + sum);
		sc.close();
	}

	public static void ex6() {
		// URI - Problem 1004 - Solution
		// Problema 1004 - Produto Simples

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int prod = a * b;
		System.out.println("Prod = " + prod);
		sc.close();
	}

	public static void ex7() {
		// URI - Problem 1005 - Solution
		// Problema 1005 - Média 1

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double media = (a + b) / 2.0;
		System.out.println("MEDIA = " + media);
		sc.close();
	}

	public static void ex8() {
		// URI - Problem 1006 - Solution
		// Problema 1006 - Média 2

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double media = (a + b + c) / 3.0;
		System.out.println("MEDIA = " + String.format("%.1f", media));
		sc.close();
	}

	public static void ex9() {
		// URI - Problem 1007 - Solution
		// Problema 1007 - Diferença

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int diferenca = (-a - b - c - d);
		System.out.println("DIFERENCA = " + diferenca);
		sc.close();
	}

	public static void ex10() {
		// URI - Problem 1008 - Solution
		// Problema 1008 - Salário

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int workHours = sc.nextInt();
		double salHour = sc.nextDouble();
		double salMonth = workHours * salHour;
		System.out.println("NUMBER = " + num);
		System.out.println("SALARY = U$ " + String.format("%.2f", salMonth));
		sc.close();
	}

	public static void ex11() {
		// URI - Problem 1009 - Solution
		// Problema 1009 - Salário com Bônus

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		double baseSalary = sc.nextDouble();
		double sales = sc.nextDouble();
		double total = baseSalary + (sales * 0.15f);
		System.out.println("TOTAL = R$ " + String.format("%.2f", total));
		sc.close();
	}

	public static void ex12() {
		// URI - Problem 1010 - Solution
		// Problema 1010 - Cálculo Simples

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id1 = sc.nextInt();
		int a1 = sc.nextInt();
		double b1 = sc.nextDouble();

		int id2 = sc.nextInt();
		int a2 = sc.nextInt();
		double b2 = sc.nextDouble();

		double payValue = (a1 * b1) + (a2 * b2);
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", payValue));
		sc.close();
	}

	public static void ex13() {
		// URI - Problem 1011 - Solution
		// Problema 1011 - Esfera

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double volume = (4f / 3f) * Math.PI * Math.pow(raio, 3f);
		System.out.println("VOLUME = " + String.format("%.2f", volume));
		sc.close();
	}

	public static void ex14() {
		// URI - Problem 1012 - Solution
		// Problema 1012 - Área

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double triangleArea = (a * c) / 2;
		double circleArea = Math.PI * Math.pow(c, 2);
		double trapezeArea = ((a + b) * c) / 2;
		double squereArea = Math.pow(b, 2);
		double rectangleArea = a * b;

		System.out.println("TRIANGULO: " + String.format("%.3f", triangleArea));
		System.out.println("CIRCULO: " + String.format("%.3f", circleArea));
		System.out.println("TRAPEZIO: " + String.format("%.3f", trapezeArea));
		System.out.println("QUADRADO: " + String.format("%.3f", squereArea));
		System.out.println("RETANGULO: " + String.format("%.3f", rectangleArea));
		sc.close();
	}

	public static void ex15() {
		// URI - Problem 1013 - Solution
		// Problema 1013 - O Maior

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int higher = 0;
		int count = 0;
		int a = 0;
		while (count < 3) {
			a = sc.nextInt();
			if (a > higher) {
				higher = a;
			}
			count++;
		}
		System.out.println(a + " eh o maior");
		sc.close();
	}

	public static void ex16() {
		// URI - Problem 1014 - Solution
		// Problema 1014 - Consumo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int distInKm = sc.nextInt();
		double liters = sc.nextDouble();
		double carLitersPerKm = distInKm / liters;

		System.out.println(String.format("%.3f", carLitersPerKm) + " km/l");
		sc.close();
	}

	public static void ex17() {
		// URI - Problem 1015 - Solution
		// Problema 1015 - Distância Entre Dois Pontos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xa = sc.nextDouble();
		double ya = sc.nextDouble();
		double xb = sc.nextDouble();
		double yb = sc.nextDouble();

		double result = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
		System.out.println(String.format("%.4f", result));
		sc.close();
	}

	public static void ex18() {
		// URI - Problem 1016 - Solution
		// Problema 1016 - Distância

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int result = (in * 60) / 30;
		System.out.println(result + " minutos");
		sc.close();
	}

	public static void ex19() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double b = sc.nextDouble();
		double h = sc.nextDouble();

		double area = b * h;
		double perimeter = 2 * b + 2 * h;
		double diagonal = Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));

		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimeter));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		sc.close();
	}

	public static void ex20() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name1 = sc.next();
		int age1 = sc.nextInt();
		String name2 = sc.next();
		int age2 = sc.nextInt();
		double media = (age1 + age2) / 2f;

		System.out.println(
				"A idade média de " + name1 + " e " + name2 + " é de " + String.format("%.1f", media) + " anos");
		sc.close();
	}

	public static void ex21() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int seconds = input % 60;
		int hours = input / 3600;
		int minutes = (input % 3600) / 60;

		System.out.println(hours + ":" + minutes + ":" + seconds);
		sc.close();
	}

	public static void ex22() {
		// URI - Problem 1018 - Solution
		// Problema 1018 - Cédulas

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		int cem = in / 100;
		int cinq = (in - (cem * 100)) / 50;
		int vinte = ((in - (cem * 100) - (cinq * 50)) / 20);
		int dez = ((in - (cem * 100) - (cinq * 50) - (vinte * 20)) / 10);
		int cinco = ((in - (cem * 100) - (cinq * 50) - (vinte * 20) - (dez * 10)) / 5);
		int dois = ((in - (cem * 100) - (cinq * 50) - (vinte * 20) - (dez * 10) - (cinco * 5)) / 2);
		int um = ((in - (cem * 100) - (cinq * 50) - (vinte * 20) - (dez * 10) - (cinco * 5) - (dois * 2)));

		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");
		sc.close();
	}

	public static void ex23() {
		// URI - Problem 1020 - Solution
		// Problema 1020 - Idade em Dias

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		int ano = in / 365;
		int mes = (in - ano * 365) / 30;
		int dia = in - (ano * 365) - (mes * 30);

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		sc.close();
	}

	public static void ex24() {
		// URI - Problem 1021 - Solution
		// Problema 1021 - Notas e Moedas

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double inputReal = sc.nextDouble();
		int in = (int) inputReal;
		double moedas = inputReal - in;

		int cem = in / 100;
		int cinq = (in - (cem * 100)) / 50;
		int vinte = ((in - (cem * 100) - (cinq * 50)) / 20);
		int dez = ((in - (cem * 100) - (cinq * 50) - (vinte * 20)) / 10);
		int cinco = ((in - (cem * 100) - (cinq * 50) - (vinte * 20) - (dez * 10)) / 5);
		int dois = ((in - (cem * 100) - (cinq * 50) - (vinte * 20) - (dez * 10) - (cinco * 5)) / 2);
		int um = ((in - (cem * 100) - (cinq * 50) - (vinte * 20) - (dez * 10) - (cinco * 5) - (dois * 2)));

		int moedaCinq = (int) (moedas / 0.50);
		int moedaVinteCinco = (int) ((moedas - (moedaCinq * 0.50)) / 0.25);
		int moedaDez = (int) ((moedas - (moedaCinq * 0.50) - (moedaVinteCinco * 0.25)) / 0.10);
		int moedaCinco = (int) ((moedas - (moedaCinq * 0.50) - (moedaVinteCinco * 0.25) - (moedaDez * 0.10)) / 0.05);
		int moedaUm = (int) ((moedas - (moedaCinq * 0.50) - (moedaVinteCinco * 0.25) - (moedaDez * 0.10)
				- (moedaCinco * 0.05)) / 0.01);

		System.out.println("NOTAS:");
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");

		System.out.println("MOEDAS:");
		System.out.println(moedaCinq + " moeda(s) de R$ 0,50");
		System.out.println(moedaVinteCinco + " moeda(s) de R$ 0,25");
		System.out.println(moedaDez + " moeda(s) de R$ 0,10");
		System.out.println(moedaCinco + " moeda(s) de R$ 0,05");
		System.out.println(moedaUm + " moeda(s) de R$ 0,01");

		sc.close();
	}

	public static void ex25() {
		
		// URI - Problem 1061 - Solution
		//Problema 1061 - Tempo de um Evento
		
		Scanner sc = new Scanner(System.in);

		sc.next();
		int diaInicio = sc.nextInt();
		int horaInicio = sc.nextInt();
		sc.next();
		int minutoInicio = sc.nextInt();
		sc.next();
		int segundoInicio = sc.nextInt();
		sc.next();
		int diaTermino = sc.nextInt();
		int horaTermino = sc.nextInt();
		sc.next();
		int minutoTermino = sc.nextInt();
		sc.next();
		int segundoTermino = sc.nextInt();

		int inicioSegundos = segundoInicio + minutoInicio * 60 + horaInicio * 3600 + diaInicio * 86400;
		int terminoSegundos = segundoTermino + minutoTermino * 60 + horaTermino * 3600 + diaTermino * 86400;

		int duracaoSegundos = terminoSegundos - inicioSegundos;

		int dias = duracaoSegundos / 86400;
		duracaoSegundos %= 86400;
		int horas = duracaoSegundos / 3600;
		duracaoSegundos %= 3600;
		int minutos = duracaoSegundos / 60;
		int segundos = duracaoSegundos % 60;

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

		sc.close();

	}

}
