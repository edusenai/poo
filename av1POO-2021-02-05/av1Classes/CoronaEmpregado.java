package av1;

import java.util.ArrayList;

public class CoronaEmpregado extends CoronaPessoa {
	
	private ArrayList<CoronaEmpregado> empregados;
	boolean isAposentado;
	
	public CoronaEmpregado(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, boolean isAposentado) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria);
		this.isAposentado = isAposentado;
		this.empregados = new ArrayList<>();
	}

	public ArrayList<CoronaEmpregado> getEmpregados() {
		return empregados;
	}
	
	public boolean getIsAposentado() {
		return isAposentado;
	}
	
	public void addEmpregado(CoronaEmpregado empregado) {
		empregados.add(empregado);
	}

	@Override
	public String toString() {
		return "CoronaEmpregado [empregados=" + empregados + ", isAposentado=" + isAposentado + "]";
	}
	
	

}
