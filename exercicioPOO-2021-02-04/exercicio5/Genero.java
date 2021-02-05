package revisaoQuestao5;

public enum Genero {

	ACAO("ACAO"),
	FICCAO("FICACAO"),
	DRAMA("DRAMA"),
	AVENTURA("AVENTURA");
	
	private final String genero;

	private Genero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return genero;
	}
	
}
