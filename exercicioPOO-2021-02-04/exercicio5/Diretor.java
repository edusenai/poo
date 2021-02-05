package revisaoQuestao5;

public class Diretor {

	private int id, idade;
	private String nome, nascionalidade;
	private double cache;
	
	public Diretor(int id, int idade, String nome, String nacionalidade, double cache) {
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.nascionalidade = nascionalidade;
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
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public double getCache() {
		return cache;
	}

	public void setCache(double cache) {
		this.cache = cache;
	}

	@Override
	public String toString() {
		return "Diretor [id=" + id + ", idade=" + idade + ", nome=" + nome + ", nascionalidade=" + nascionalidade
				+ ", cache=" + cache + "]";
	}
		
}
