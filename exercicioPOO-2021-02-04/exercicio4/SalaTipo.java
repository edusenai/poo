package revisaoQuestao4;

public enum SalaTipo {

	NORMAL("NORMAL"),
	INTELIGENTE("INTELIGENTE"),
	VIDEOCONFERENCIA("VIDECONFERENCIA");
	
	private final String tipo;
	
	private SalaTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return tipo;
	}
	
}