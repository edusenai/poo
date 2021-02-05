package revisaoQuestao5;

import java.util.ArrayList;
import java.util.Random;

public class Cinema {

	private int id, capacidaeLotacao, qntdSalas, qntdSalasDisponiveis;
	private String nomeFantasia, endereco, telefone;
	private ArrayList<Filmes> filmes;
	private int telespectadores = 0;
	
	public Cinema(int id, int capacidaeLotacao, int qntdSalas, int qntdSalasDisponiveis, String nomeFantasia,
			String endereco, String telefone) {
		this.id = id;
		this.capacidaeLotacao = capacidaeLotacao;
		this.qntdSalas = qntdSalas;
		this.qntdSalasDisponiveis = qntdSalasDisponiveis;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.telefone = telefone;
		this.filmes= new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidaeLotacao() {
		return capacidaeLotacao;
	}

	public void setCapacidaeLotacao(int capacidaeLotacao) {
		this.capacidaeLotacao = capacidaeLotacao;
	}

	public int getQntdSalas() {
		return qntdSalas;
	}

	public void setQntdSalas(int qntdSalas) {
		this.qntdSalas = qntdSalas;
	}

	public int getQntdSalasDisponiveis() {
		return qntdSalasDisponiveis;
	}

	public void setQntdSalasDisponiveis(int qntdSalasDisponiveis) {
		this.qntdSalasDisponiveis = qntdSalasDisponiveis;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Filmes> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filmes> filmes) {
		this.filmes = filmes;
	}
	
	public void incluirFilme(Filmes filme) {
		filmes.add(filme);
	}
	
	public void listarFilmes() {
		for (Filmes filmePrint : filmes) {
			System.out.println(filmePrint);
		}
	}
	
	public void listarSessoes() {
	
		//Horário início e fim das sessões
		
		int hrInicio = 10;
		int horario = hrInicio;
		int hrFim = 22;
		
		if (horario >= hrInicio && horario < 22) {
			while (getQntdSalasDisponiveis() != 0) {
	        	System.out.println("SALAS: " + getQntdSalas());
				System.out.println("SALAS DISPONIVEIS: " + getQntdSalasDisponiveis());
				qntdSalasDisponiveis = qntdSalasDisponiveis - 1;
			} 
		}
				
		getQntdSalasDisponiveis();
		
		for (Filmes filmePrint : filmes) {
			filmePrint.getDuracao();
		}
		

	}
	
	public void addTelespectador() {
		telespectadores++;
	}
	
	public void qntdTelespectadores() {
		System.out.println("Já passaram " + telespectadores + " telespectadores.");
	}
	
}













