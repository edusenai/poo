package av2v2;

public enum BeneficiarioCategoria {

	EMPREGADO("Empregado"),
	EMPREGADOR("Empregador"),
	DESEMPREGADO("Desempregado");

	private String categoria;

	BeneficiarioCategoria(String categoria) {
		this.categoria = categoria;
	}	
}
