package revisaoQuestao5;

public class CinemaMain {

	public static void main(String[] args) {
		
		Diretor diretor1 = new Diretor(1, 45, "J.K. Rowling", "Britânica", 150000);
		
		Atores ator1 = new Atores(1, 25, "Harry Potter", "Britânica", 20000);
		Atores ator2 = new Atores(2, 24, "Ronald Weasley", "Britânica", 12000);
		Atores ator3 = new Atores(3, 21, "Hermione Granger", "Britânica", 15000);
				
		Filmes filme1 = new Filmes("Harry Potter 1", "Harry Potter 1", "Inglaterra", 2.15, 10, Tipo.TE2D, Genero.FICCAO, diretor1);
		Filmes filme2 = new Filmes("Harry Potter 2", "Harry Potter 2", "Inglaterra", 2.30, 12, Tipo.TE3D, Genero.FICCAO, diretor1);
		Filmes filme3 = new Filmes("Harry Potter 3", "Harry Potter 3", "Inglaterra", 2.23, 10, Tipo.TE4D, Genero.FICCAO, diretor1);
		
		filme1.addAtor(ator1);
		filme1.addAtor(ator2);
		filme1.addAtor(ator3);
		filme2.addAtor(ator1);
		filme2.addAtor(ator2);
		filme2.addAtor(ator3);
		filme3.addAtor(ator1);
		filme3.addAtor(ator2);
		filme3.addAtor(ator3);
		
		//filme1.listarAtores();
		
		//System.out.println(filme1.toString());
		
		Cinema cinema = new Cinema(1, 100, 5, 5, "Cinema em casa", "R. João da Silva, 999, Blumenau, SC", "47999999999");
		
		cinema.incluirFilme(filme1);
		cinema.incluirFilme(filme2);
		cinema.incluirFilme(filme3);
		
		//cinema.listarFilmes();
		
		cinema.addTelespectador();
		cinema.addTelespectador();
		cinema.addTelespectador();
		cinema.addTelespectador();
		
		cinema.qntdTelespectadores();
				
		cinema.listarSessoes();

	}

}
