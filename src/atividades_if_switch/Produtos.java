package atividades_if_switch;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		
		int codigo, quantidade, valorTotal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------------------------");		
		System.out.println("| MOSTRA PRODUTOS COMPRADOS E O PREÇO TOTAL |");
		System.out.println("---------------------------------------------");
				
		System.out.printf("\nQual produto você gostaria de comprar?\n\n");
		
		System.out.println("--------------------------------------------");		
		System.out.println("| CÓDIGO |     PRODUTO     | PREÇO UNIÁTIO |");
		System.out.println("--------------------------------------------");		
		System.out.println("|   1    | Cachorro Quente |    R$10,00    |");
		System.out.println("|   2    |    X-Salada     |    R$15,00    |");
		System.out.println("|   3    |     X-Bacon     |    R$18,00    |");
		System.out.println("|   4    |      Bauru      |    R$12,00    |");
		System.out.println("|   5    |   Refrigerante  |    R$ 8,00    |");
		System.out.println("|   6    | Suco de Laranja |    R$13,00    |");
		System.out.println("--------------------------------------------");
		
		System.out.printf("\nCódigo do produto: ");
		codigo = scanner.nextInt();
		
		System.out.printf("Digite a quantidade: ");
		quantidade = scanner.nextInt();
		
		switch(codigo){
	    case 1:
	    	valorTotal =  10 * quantidade;
	    	System.out.printf("\nProduto escolhido: Cachorro Quente");
	    	System.out.printf("\nValor Total: R$%d", valorTotal);	    	
	        break;
	    case 2:
	    	valorTotal =  15 * quantidade;
	    	System.out.printf("\nProduto escolhido: X-Salada");
	    	System.out.printf("\nValor Total: R$%d", valorTotal);
	        break;
	    case 3:
	    	valorTotal =  18 * quantidade;
	    	System.out.printf("\nProduto escolhido: X-Bacon");
	    	System.out.printf("\nValor Total: R$%d", valorTotal);
	        break;
	    case 4:
	    	valorTotal =  12 * quantidade;
	    	System.out.printf("\nProduto escolhido: Bauru");
	    	System.out.printf("\nValor Total: R$%d", valorTotal);	    	
	        break;
	    case 5:
	    	valorTotal =  8 * quantidade;
	    	System.out.printf("\nProduto escolhido: Refrigerante");
	    	System.out.printf("\nValor Total: R$%d", valorTotal);
	        break;
	    case 6:
	    	valorTotal =  13 * quantidade;
	    	System.out.printf("\nProduto escolhido: Suco de Laranja");
	    	System.out.printf("\nValor Total: R$%d", valorTotal);
	        break;
		
		}
		
		
		scanner.close();

	}

}
