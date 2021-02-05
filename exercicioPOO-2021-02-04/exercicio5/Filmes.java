package revisaoQuestao5;

import java.util.ArrayList;

public class Filmes {
	
	private String tituloOriginal, tituloPT, paisOrigem;
	private double duracao;
	private int faixaEtaria;
	private Tipo tipo;
	private Genero genero;
	private ArrayList<Atores> atores;
	private Diretor diretor;
	
	public Filmes(String tituloOriginal, String tituloPT, String paisOrigem, double duracao, int faixaEtaria, Tipo tipo,
			Genero genero, Diretor diretor) {
		this.tituloOriginal = tituloOriginal;
		this.tituloPT = tituloPT;
		this.paisOrigem = paisOrigem;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
		this.tipo = tipo;
		this.genero = genero;
		this.diretor = diretor;
		this.atores= new ArrayList<>();
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloPT() {
		return tituloPT;
	}

	public void setTituloPT(String tituloPT) {
		this.tituloPT = tituloPT;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public ArrayList<Atores> getAtores() {
		return atores;
	}

	public void setAtores(ArrayList<Atores> atores) {
		this.atores = atores;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}	
	
	public void addAtor(Atores ator) {
		atores.add(ator);
	}
	
	public void listarAtores() {
		for (Atores atoresPrint : atores) {
			System.out.println(atoresPrint);
		}
	}

	@Override
	public String toString() {
		return "Filmes [tituloOriginal=" + tituloOriginal + ", tituloPT=" + tituloPT + ", paisOrigem=" + paisOrigem
				+ ", duracao=" + duracao + ", faixaEtaria=" + faixaEtaria + ", tipo=" + tipo + ", genero=" + genero
				+ ", atores=" + atores + ", diretor=" + diretor + "]";
	}
	
	

}
