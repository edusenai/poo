package av1;

import java.util.ArrayList;

public class CoronaEmpregador extends CoronaPessoa {

	private int numFunc;
	private ArrayList<CoronaEmpregador> empregadores;
	
	public CoronaEmpregador(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, int numFunc) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria);
		this.numFunc = numFunc;
		this.empregadores = new ArrayList<>();
	}

	public int getNumFunc() {
		return numFunc;
	}

	public ArrayList<CoronaEmpregador> getEmpregadores() {
		return empregadores;
	}
	
	public void addEmpregador(CoronaEmpregador empregador) {
		empregadores.add(empregador);
	}
	
	@Override
	public String toString() {
		return "CoronaEmpregador [numFunc=" + numFunc + ", empregadores=" + empregadores + "]";
	}
	
}
