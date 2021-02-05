package av1;

public enum CoronaCategoria {
	
	EMPREGADO("Empregado"),
	EMPREGADOR("Empregador"),
	DESEMPREGADO("Desempregado");

	private String categoria;
	
	CoronaCategoria(String categoria) {
		this.categoria = categoria;
	}
}
