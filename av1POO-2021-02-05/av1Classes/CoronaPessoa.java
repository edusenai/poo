package av1;

import java.util.Scanner;

public class CoronaPessoa {
	
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

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoUF() {
		return estadoUF;
	}

	public void setEstadoUF(String estadoUF) {
		this.estadoUF = estadoUF;
	}

	public CoronaCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(CoronaCategoria categoria) {
		this.categoria = categoria;
	}	
	
	private void setCategoriaAposentado(String categoriaAposentado) {
		this.categoriaAposentado = categoriaAposentado;
	}
	
	public String getCategoriaAposentado() {
		return categoriaAposentado;
	}
	
	private void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}
	
	public int getNumFunc() {
		return numFunc;
	}
	
	private void setMesDesempregado(int mesDesempregado) {
		this.mesDesempregado = mesDesempregado;
	}
	
	public int getMesDesempregado() {
		return mesDesempregado;
	}
	
	public void defineTipoCategoria() {
		
		Scanner keyboard = new Scanner(System.in);
		
		if (getCategoria() == CoronaCategoria.EMPREGADO) {
			//EMPREGADO
			System.out.println("É aposentado? (true ou false)");
			boolean isAposentado = keyboard.nextBoolean();
			
			if (isAposentado == true) {
				String aposentado = "Aposentado";
				setCategoriaAposentado(aposentado);
			}
			
		} else if (getCategoria() == CoronaCategoria.EMPREGADOR) {
			//EMPREGADOR
			System.out.println("Número de funcionários: ");
			int numFunc = keyboard.nextInt();
			setNumFunc(numFunc);
			
		} else {
			//DESEMPREGADO
			System.out.println("Meses desempregado: ");
			int mesDesempregado = keyboard.nextInt();
			setMesDesempregado(mesDesempregado);
		}
	}
	
}











