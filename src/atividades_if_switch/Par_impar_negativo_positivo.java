package atividades_if_switch;

import java.util.Scanner;

public class Par_impar_negativo_positivo {

	public static void main(String[] args) {
		
		int numero;
		boolean posNeg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- MOSTRA SE UM NÚMERO É PAR OU ÍMPAR E NEGATIVOU OU POSITIVO ---\n");
				
		System.out.printf("Digite o número: ");
		numero = scanner.nextInt();
		
			
		
		if(numero > 0 && numero % 2 == 0) {
			System.out.printf("\nO número %d é positivo e par\n", numero);
		}
		
		else if(numero > 0 && numero % 2 == 1) {
			System.out.printf("\nO número %d é positivo e ímpar\n", numero);
		}
		
		else if(numero < 0 && numero % 2 == 0) {
			System.out.printf("\nO número %d é negativo e par\n", numero);
		}
		
		else if(numero < 0 && numero % 2 == -1) {
			System.out.printf("\nO número %d é negativo e ímpar\n", numero);
		}
		
		else {
			System.out.printf("\nO número %d é par, mas não é negativo e nem positivo.\n", numero);
		}
			
			
				
		
		scanner.close();

	}

}
