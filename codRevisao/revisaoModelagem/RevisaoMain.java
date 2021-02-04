package revisao;

public class RevisaoMain {

	public static void main(String[] args) {
		
		RevisaoAnimal animal = new RevisaoAnimal(1, "Cachorro", "Pastor Alemão", 32, 0.80, 1, "Preto", "A+", "Ração", "Masculino");
		
		RevisaoPessoa pessoa = new RevisaoPessoa(1, "João", 00000011144, 70, 1.67, 25, 5478060, "B+", "Frango e batata doce", "Masculino");
		
		RevisaoCarro carro = new RevisaoCarro(1, 5, 4, "Popular", "FIAT", "Branco", "Gasolina", 20, 100, true);
		
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
		
	}

}
