package atividades_if_switch;

import java.util.Scanner;

public class SomaMaior {

	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- MOSTRA SE A SOMA DE 'A' + 'B' É MAIOR, MENOR OU IGUAL A 'C' ---\n");
				
		System.out.printf("Digite o valor de A: ");
		a = scanner.nextInt();
		
		System.out.printf("Digite o valor de B: ");
		b = scanner.nextInt();
		
		System.out.printf("Digite o valor de C: ");
		c = scanner.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.printf("\n%d + %d = %d > %d", a, b, soma, c);
			System.out.printf("\nA soma de A + B é maior que C");
		}
		else if(soma < c) {
			System.out.printf("\n%d + %d = %d < %d", a, b, soma, c);
			System.out.printf("\nA soma de A + B é menor que C");
		}
		else {
			System.out.printf("\n%d + %d = %d = %d", a, b, soma, c);
			System.out.printf("\nA soma de A + B é igual que C");
		}
				
		
		scanner.close();

	}

}
