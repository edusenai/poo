package revisaoQuestao4;

public class SalaApelido extends Sala {

	private String apelido;

	public SalaApelido(String idSala, int numPessoas, SalaTipo tipo, String apelido) {
		super(idSala, numPessoas, tipo);
		this.apelido = apelido;
	}


	
}
