package atividades_if_switch;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		float numero1, numero2, resultado;
		int operacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------------------------------------------");		
		System.out.println("| CALCULA DOIS NÚMEROS COM A OPERAÇÃO DESEJADA |");
		System.out.println("------------------------------------------------");
		
		System.out.printf("\nDigite o primeiro número: ");
		numero1 = scanner.nextFloat();
		
		System.out.printf("Digite o segundo número: ");
		numero2 = scanner.nextFloat();
				
		System.out.printf("\nQual operação você deseja realizar?\n\n");
		
		System.out.println("------------------------------");		
		System.out.println("| CÓDIGO |      OPERAÇÃO     |");
		System.out.println("------------------------------");		
		System.out.println("|   1    |     Soma (+)      |");
		System.out.println("|   2    |   Subtração (-)   |");
		System.out.println("|   3    | Multiplicação (*) |");
		System.out.println("|   4    |   Divisão (/)     |");
		System.out.println("------------------------------");
		
		System.out.printf("\nCódigo da operação: ");
		operacao = scanner.nextInt();
		
		switch(operacao){
	    case 1:
	    	resultado =  numero1 + numero2;
	    	System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, resultado);
	        break;
	    case 2:
	    	resultado =  numero1 - numero2;
	    	System.out.printf("\n%.2f - %.2f = %.2f", numero1, numero2, resultado);
	        break;
	    case 3:
	    	resultado =  numero1 * numero2;
	    	System.out.printf("\n%.2f * %.2f = %.2f", numero1, numero2, resultado);
	        break;
	    case 4:
	    	resultado =  numero1 / numero2;
	    	
	    	System.out.printf("\n%.2f / %.2f = %.2f", numero1, numero2, resultado);
	        break;
		
		}
		
		
		scanner.close();

	}

}
