package av1;

import java.util.Scanner;

public class CoronaMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int opcao = 1;
			
		while (opcao == 1) {
			
			boolean isAposentado = false;
			int numFunc = 0;
			int mesDesempregado = 0;
			
			System.out.println("Cadastrar novo beneficiário");
			
			System.out.print("Nome Completo: ");
			String nomeCompleto = keyboard.nextLine();
			
			System.out.print("Data nascimento (DD-MM-AAAA): ");
			String dataNascimento = keyboard.nextLine();
			
			System.out.print("Categoria (EMPREGADO, EMPREGADOR, DESEMPREGADO): ");
			String categoria = keyboard.nextLine();
			
			categoria = categoria.toUpperCase();
			
			CoronaCategoria categoriaFormatada = CoronaCategoria.valueOf(categoria);
						
			if (categoriaFormatada == CoronaCategoria.EMPREGADO) {
				//EMPREGADO
				System.out.print("É aposentado? (SIM ou NÃO): ");
				String tecladoAposentado = keyboard.nextLine();
				
				tecladoAposentado = tecladoAposentado.toLowerCase();
				
				switch (tecladoAposentado) {
				case ("sim"):
					isAposentado = true;
					break;
				}
				
			} else if (categoriaFormatada == CoronaCategoria.EMPREGADOR) {
				//EMPREGADOR
				System.out.print("Número de funcionários: ");
				numFunc = keyboard.nextInt();
	
			} else {
				//DESEMPREGADO
				System.out.print("Meses desempregado: ");
				mesDesempregado = keyboard.nextInt();
			}
						
			System.out.print("UF: ");
			String estado = keyboard.nextLine();
			
			if (categoriaFormatada == CoronaCategoria.EMPREGADO) {
				CoronaEmpregado pessoa = new CoronaEmpregado(nomeCompleto, dataNascimento, estado, categoriaFormatada, isAposentado);
			}
			
			if (categoriaFormatada == CoronaCategoria.EMPREGADOR) {
				CoronaEmpregador pessoa = new CoronaEmpregador(nomeCompleto, dataNascimento, estado, categoriaFormatada, numFunc);
			}
			
			if (categoriaFormatada == CoronaCategoria.DESEMPREGADO) {
				CoronaDesempregado pessoa = new CoronaDesempregado(nomeCompleto, dataNascimento, estado, categoriaFormatada, mesDesempregado);
			}
			
			System.out.print("Deseja criar outro beneficiário? 1 - SIM / 2 - NÃO: ");
			opcao = keyboard.nextInt();
			
			keyboard.nextLine();
		
		}

		/*
		System.out.println("Total de usuários lidos: " );
		System.out.println("Total de beneficiários: ");
		System.out.println("Total de valor concedido: ");
		System.out.println("2 maiores beneficiários: ");
		System.out.println("2 beneficiários por mais tempo: ");
		*/

		
		/*
		CoronaPessoa pessoa1 = new CoronaPessoa("João da Silva", "01-01-1990", "SC", CoronaCategoria.EMPREGADO);
		CoronaPessoa pessoa2 = new CoronaPessoa("João da Silva", "01-01-1990", "SC", CoronaCategoria.EMPREGADOR);
		CoronaPessoa pessoa3 = new CoronaPessoa("João da Silva", "01-01-1990", "SC", CoronaCategoria.DESEMPREGADO);
		
		pessoa1.defineTipoCategoria();
		pessoa2.defineTipoCategoria();
		pessoa3.defineTipoCategoria();
		
		System.out.println(pessoa1.getCategoriaAposentado());
		System.out.println(pessoa2.getNumFunc());
		System.out.println(pessoa3.getMesDesempregado());
		*/
	}
	
}
