package av1;

public abstract class CoronaPessoa {
	
	private String nomeCompleto, dataNascimento, estadoUF;
	private CoronaCategoria categoria;
	protected double valorBeneficio;
	protected int mesBeneficio;
	
	public CoronaPessoa(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, double valorBeneficio, int mesBeneficio) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.estadoUF = estadoUF;
		this.categoria = categoria;
		this.valorBeneficio = valorBeneficio;
		this.setMesBeneficio(mesBeneficio);
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
	
	public CoronaCategoria getCategoria() {
		return categoria;
	}
	
	public double getValorBeneficio() {
		return valorBeneficio;
	}
	
	public int getMesBeneficio() {
		return mesBeneficio;
	}

	public void setMesBeneficio(int mesBeneficio) {
		this.mesBeneficio = mesBeneficio;
	}

}











