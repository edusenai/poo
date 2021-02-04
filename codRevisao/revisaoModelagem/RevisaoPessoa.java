package revisao;

public class RevisaoPessoa {
	
	int codPessoa, idadePessoa;
	double pesoPessoa, alturaPessoa, cpfPessoa, rgPessoa;
	String nomePessoa, tipoSanguineoPessoa, alimentacaoPessoa, sexoPessoa;
	boolean andando, correr, falar, alimentar, dormir;
	
	public RevisaoPessoa(int codPessoa, String nomePessoa, double cpfPessoa, double pesoPessoa, double alturaPessoa, int idadePessoa, 
			double rgPessoa, String tipoSanguineoPessoa, String alimentacaoPessoa, String sexoPessoa) {
		this.codPessoa = codPessoa;
		this.nomePessoa = nomePessoa;
		this.cpfPessoa = cpfPessoa;
		this.pesoPessoa = pesoPessoa;
		this.alturaPessoa = alturaPessoa;
		this.idadePessoa = idadePessoa;
		this.rgPessoa = rgPessoa;
		this.tipoSanguineoPessoa = tipoSanguineoPessoa;
		this.alimentacaoPessoa = alimentacaoPessoa;
		this.sexoPessoa = sexoPessoa;		
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

	public double getPesoPessoa() {
		return pesoPessoa;
	}

	public void setPesoPessoa(double pesoPessoa) {
		this.pesoPessoa = pesoPessoa;
	}

	public double getAlturaPessoa() {
		return alturaPessoa;
	}

	public void setAlturaPessoa(double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public double getCpfPessoa() {
		return cpfPessoa;
	}

	public void setCpfPessoa(double cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}

	public double getRgPessoa() {
		return rgPessoa;
	}

	public void setRfPessoa(double rgPessoa) {
		this.rgPessoa = rgPessoa;
	}

	public String getTipoSanguineoPessoa() {
		return tipoSanguineoPessoa;
	}

	public void setTipoSanguineoPessoa(String tipoSanguineoPessoa) {
		this.tipoSanguineoPessoa = tipoSanguineoPessoa;
	}

	public String getAlimentacaoPessoa() {
		return alimentacaoPessoa;
	}

	public void setAlimentacaoPessoa(String alimentacaoPessoa) {
		this.alimentacaoPessoa = alimentacaoPessoa;
	}

	public String getSexoPessoa() {
		return sexoPessoa;
	}

	public void setSexoPessoa(String sexoPessoa) {
		this.sexoPessoa = sexoPessoa;
	}
	
	public boolean pessoaAndar() {
		if (andando == false) {
			System.out.println("A pessoa " + getNomePessoa() + " está andando.");
			return andando = true;
		} else {
			System.out.println("A pessoa " + getNomePessoa() + " está parado.");
			return andando = false;
		}
	}
	
	public boolean pessoaCorrer() {
		if (andando == false) {
			System.out.println("A pessoa " + getNomePessoa() + " está correndo.");
			return andando = true;
		} else {
			System.out.println("A pessoa " + getNomePessoa() + " parou de correr.");
			return andando = false;
		}
	}
	
	public boolean pessoaFalar() {
		if (andando == false) {
			System.out.println("A pessoa " + getNomePessoa() + " está falando.");
			return andando = true;
		} else {
			System.out.println("A pessoa " + getNomePessoa() + " parou de falar.");
			return andando = false;
		}
	}
	
	public boolean pessoaAlimentar() {
		if (andando == false) {
			System.out.println("A pessoa " + getNomePessoa() + " está se alimentando.");
			return andando = true;
		} else {
			System.out.println("A pessoa " + getNomePessoa() + " parou de se alimentar.");
			return andando = false;
		}
	}
	
	public boolean pessoaDormir() {
		if (andando == false) {
			System.out.println("A pessoa " + getNomePessoa() + " está dormindo.");
			return andando = true;
		} else {
			System.out.println("A pessoa " + getNomePessoa() + " está acordado.");
			return andando = false;
		}
	}

}
