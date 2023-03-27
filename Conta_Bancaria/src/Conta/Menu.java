package Conta;

import java.util.Scanner;
import Conta.model.Conta;
import Conta.util.Cores;
import Conta.model.ContaCorrente;
import Conta.model.ContaPoupanca;

public class Menu {
	public static void main(String[] args) {

// Teste da Classe conta
		
		Conta cliente1 = new Conta (1, 123, 1, "Mariane", 9000.0f);
		cliente1.visualizar();
		cliente1.sacar(92000.0f);
		cliente1.visualizar();
		cliente1.depositar(5000.0f);
		cliente1.visualizar();
		
// teste da Classe Conta corrente 
		
		Conta cliCor = new ContaCorrente(2, 123, 1, "Mariane", 95000.0f, 1000.0f); 
		cliCor.visualizar();
		cliCor.sacar(12000.0f);
		cliCor.visualizar();
		cliCor.depositar(5000.0f);
		cliCor.visualizar();
		
// teste da classe conta poupança
		Conta CliPoup = new Conta(3, 123, 2, "Leona", 15);
		CliPoup.visualizar();
		CliPoup.sacar(12000.0f);
		CliPoup.visualizar();
		CliPoup.depositar(5000.0f);
		CliPoup.visualizar();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
				
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "╔***************************************************╗");
			System.out.println("*                                                   *");
			System.out.println("*               BANCO DO BRAZIL COM Ẓ               *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
				
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Banco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
				
                    break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
					
                    break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
	
                    break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
					
                    break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
		
                    break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

                    break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
					
                    break;
				case 8:
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					
                    break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\n Opção Inválida! \n" + Cores.TEXT_RESET);
                    break;
			}
		}	
	}

}
