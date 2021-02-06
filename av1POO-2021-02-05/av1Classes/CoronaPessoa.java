package av1;

import java.util.Scanner;

public abstract class CoronaPessoa {
	
	private String nomeCompleto, dataNascimento, estadoUF;
	private String categoriaAposentado = "";
	private int numFunc = 0;
	private int mesDesempregado = 0;
	private CoronaCategoria categoria;
	
	public CoronaPessoa(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.estadoUF = estadoUF;
		this.categoria = categoria;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getEstadoUF() {
		return estadoUF;
	}
	
}











