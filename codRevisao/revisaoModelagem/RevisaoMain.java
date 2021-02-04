package revisao;

public class RevisaoMain {

	public static void main(String[] args) {
		
		RevisaoAnimal animal = new RevisaoAnimal(1, "Cachorro", "Pastor Alemão", 32, 0.80, 1, "Preto", "A+", "Ração", "Masculino");
		
		RevisaoPessoa pessoa = new RevisaoPessoa(1, "João", 00000011144, 70, 1.67, 25, 5478060, "B+", "Frango e batata doce", "Masculino");
		
		RevisaoCarro carro = new RevisaoCarro(1, 5, 4, "Popular", "FIAT", "Branco", "Gasolina", 20, 100, true);
		
		RevisaoConta conta = new RevisaoConta(123, 999, "João", "09876543212", "7654345", "R. João da Silva, n 115, São Paulo", "011999999999", "Corrente", 10000, 5000);
		
		RevisaoProduto produto = new RevisaoProduto(1, "Bola Quadrada", "Brinquedo", "3 meses", "Colorida", 10, 30, 1, 1.2, 20.0);
		
		System.out.println("Meu animal: " + animal.getCodAnimal() + " " + animal.getNomeAnimal());
		animal.setNomeAnimal("Gato");
		System.out.println("Meu animal: " + animal.getCodAnimal() + " " + animal.getNomeAnimal());
		animal.animalAndar();
		animal.animalAndar();
		animal.animalAlimentar();
		animal.animalAlimentar();
		animal.animalCorrer();
		animal.animalCorrer();
		animal.animalDormir();
		animal.animalDormir();
		animal.animalPular();
		animal.animalPular();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Pessoa: " + pessoa.getCodPessoa() + " " + pessoa.getNomePessoa());
		pessoa.setNomePessoa("Maria");
		System.out.println("Pessoa: " + pessoa.getCodPessoa() + " " + pessoa.getNomePessoa());
		pessoa.pessoaAndar();
		pessoa.pessoaAndar();
		pessoa.pessoaAlimentar();
		pessoa.pessoaAlimentar();
		pessoa.pessoaCorrer();
		pessoa.pessoaCorrer();
		pessoa.pessoaDormir();
		pessoa.pessoaDormir();
		pessoa.pessoaFalar();
		pessoa.pessoaFalar();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Carro: " + carro.getCodCarro() + " " + carro.getMarcaCarro());
		carro.setMarcaCarro("Ford");
		System.out.println("Carro: " + carro.getCodCarro() + " " + carro.getMarcaCarro());
		carro.ligarDesligar();
		carro.ligarDesligar();
		carro.abastecer();
		carro.abastecer();
		carro.abrirPortas();
		carro.abrirPortas();
		carro.acelerar();
		carro.acelerar();
		carro.frear();
		carro.frear();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Conta: " + conta.getCodConta() + " " + conta.getAgenciaConta() + " " + conta.getNomeConta());
		conta.setNomeConta("Maria");
		System.out.println("Conta: " + conta.getCodConta() + " " + conta.getAgenciaConta() + " " + conta.getNomeConta());
		conta.ajustarLimite(8000);
		conta.depositar(7888);
		conta.sacar(122);
		conta.transferir(999, 111, 7000);
		conta.pagarBoleto(899);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Produto: " + produto.getNomeProduto());
		produto.setNomeProduto("Bola Redonda");
		System.out.println("Produto: " + produto.getNomeProduto());
		produto.vender();
		produto.vender();
		produto.estoque();
		produto.entregar();
		produto.suporte();
		
	}

}
