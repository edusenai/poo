package av1;

import java.util.ArrayList;

public class CoronaDesempregado extends CoronaPessoa {

	private ArrayList<CoronaDesempregado> desempregados;
	
	public CoronaDesempregado(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria);
		this.desempregados = new ArrayList<>();
	}

	
	
}
