package revisaoQuestao5;

import java.util.ArrayList;

public class Atores {
	
	private int id, idade;
	private String nome, nacionalidade;
	private double cache;
	
	public Atores(int id, int idade, String nome, String nacionalidade, double cache) {	
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.cache = cache;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascionalidade() {
		return nacionalidade;
	}

	public void setNascionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getCache() {
		return cache;
	}

	public void setCache(double cache) {
		this.cache = cache;
	}

	@Override
	public String toString() {
		return "Atores [id=" + id + ", idade=" + idade + ", nome=" + nome + ", nascionalidade=" + nacionalidade
				+ ", cache=" + cache + "]";
	}
	
}
