package av1;

import java.util.ArrayList;

public class CoronaDesempregado extends CoronaPessoa {

	private int mesDesempregado;
	private ArrayList<CoronaDesempregado> desempregados;
	
	public CoronaDesempregado(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, int mesDesempregado) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria);
		this.mesDesempregado = mesDesempregado;
		this.desempregados = new ArrayList<>();
	}

	public int getMesDesempregado() {
		return mesDesempregado;
	}

	public ArrayList<CoronaDesempregado> getDesempregados() {
		return desempregados;
	}
	
	public void addDesempregado(CoronaDesempregado desempregado) {
		desempregados.add(desempregado);
	}

	@Override
	public String toString() {
		return "CoronaDesempregado [mesDesempregado=" + mesDesempregado + ", desempregados=" + desempregados + "]";
	}	
	
}
