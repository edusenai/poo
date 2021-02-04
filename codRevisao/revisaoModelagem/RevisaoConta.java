package revisao;

public class RevisaoConta {

	private int codConta, agenciaConta;
	private String nomeConta, cpfConta, rgConta, enderecoConta, telefoneConta, tipoConta; 
	private double saldoConta, limiteCreditoConta;
	
	public RevisaoConta(int codConta, int agenciaConta, String nomeConta, String cpfConta, String rgConta,
			String enderecoConta, String telefoneConta, String tipoConta, double saldoConta,
			double limiteCreditoConta) {
		this.codConta = codConta;
		this.agenciaConta = agenciaConta;
		this.nomeConta = nomeConta;
		this.cpfConta = cpfConta;
		this.rgConta = rgConta;
		this.enderecoConta = enderecoConta;
		this.telefoneConta = telefoneConta;
		this.tipoConta = tipoConta;
		this.saldoConta = saldoConta;
		this.limiteCreditoConta = limiteCreditoConta;
	}

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public int getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(int agenciaConta) {
		this.agenciaConta = agenciaConta;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public String getCpfConta() {
		return cpfConta;
	}

	public void setCpfConta(String cpfConta) {
		this.cpfConta = cpfConta;
	}

	public String getRgConta() {
		return rgConta;
	}

	public void setRgConta(String rgConta) {
		this.rgConta = rgConta;
	}

	public String getEnderecoConta() {
		return enderecoConta;
	}

	public void setEnderecoConta(String enderecoConta) {
		this.enderecoConta = enderecoConta;
	}

	public String getTelefoneConta() {
		return telefoneConta;
	}

	public void setTelefoneConta(String telefoneConta) {
		this.telefoneConta = telefoneConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getLimiteCreditoConta() {
		return limiteCreditoConta;
	}

	public void setLimiteCreditoConta(double limiteCreditoConta) {
		this.limiteCreditoConta = limiteCreditoConta;
	}
	
	public void depositar() {
		
	}
	
	public void sacar() {
		
	}
	
	public void ajustarLimite() {
		
	}
	
	public void transferir() {
		
	}
	
	public void pagarBoleto() {
		
	}
	
}
