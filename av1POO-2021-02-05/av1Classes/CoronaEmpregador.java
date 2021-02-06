package av1;

import java.util.ArrayList;

public class CoronaEmpregador extends CoronaPessoa {

	private ArrayList<CoronaEmpregador> empregadores;
	
	public CoronaEmpregador(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria);
		// TODO Auto-generated constructor stub
		this.empregadores = new ArrayList<>();
	}
}
