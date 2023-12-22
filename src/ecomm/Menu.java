package ecomm;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecomm.util.Cores;
import ecomm.model.Produto;
import ecomm.model.Amostra;
import ecomm.model.Completo;


public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Teste da Classe Amostra
			Amostra a1 = new Amostra("Chanel n5", "Chanel", 500.0f, 10, 1);
			
		// Teste da Classe Completo
			Completo c1 = new Completo("Olympea", "Paco Rabanne", 300.0f, 5, 2);
						
						
		int opcao = 0;

		while (true) {
			
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              PERFUMARIA SASSO                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Retirar Produto                      ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Listar Produtos                      ");
			System.out.println("            5 - Sacar Estoque                        ");
			System.out.println("            6 - Depositar Estoque                    ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
			opcao = leia.nextInt();
			} catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
				
			if (opcao == 7) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nVolte Sempre!");
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE +"Adicionar Produto\n\n");
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE +"Retirar Produto\n\n");
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE +"Buscar Produto por Numero\n\n");
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE +"Listar Produtos\n\n");
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE +"Sacar Estoque\n\n");
					keyPress();
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE +"Depositar Estoque\n\n");
					keyPress();
					break;
			default:
					System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}
    
	}

	private static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
		// TODO Auto-generated method stub
		
	}
}