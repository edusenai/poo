package revisaoQuestao5;

public enum Tipo {

	TE2D("2D"),
	TE3D("3D"),
	TE4D("4D");
	
	private final String tipo;

	private Tipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return tipo;
	}
	
}
