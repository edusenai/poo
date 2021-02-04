package revisao;

public class RevisaoAnimal {

	private int codAnimal, idadeAnimal;
	private double pesoAnimal, alturaAnimal;
	private String nomeAnimal, racaAnimal, corAnimal, tipoSanguineoAnimal, alimentacaoAnimal, sexoAnimal;
	private boolean andando, correr, pular, alimentar, dormir;
	
	public RevisaoAnimal(int codAnimal, String nomeAnimal, String racaAnimal, double pesoAnimal, double alturaAnimal, int idadeAnimal, 
			String corAnimal, String tipoSanguineoAnimal, String alimentacaoAnimal, String sexoAnimal) {
		this.codAnimal = codAnimal;
		this.nomeAnimal = nomeAnimal;
		this.racaAnimal = racaAnimal;
		this.pesoAnimal = pesoAnimal;
		this.alturaAnimal = alturaAnimal;
		this.idadeAnimal = idadeAnimal;
		this.corAnimal = corAnimal;
		this.tipoSanguineoAnimal = tipoSanguineoAnimal;
		this.alimentacaoAnimal = alimentacaoAnimal;
		this.sexoAnimal = sexoAnimal;		
	}

	public int getCodAnimal() {
		return codAnimal;
	}

	public void setCodAnimal(int codAnimal) {
		this.codAnimal = codAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public double getPesoAnimal() {
		return pesoAnimal;
	}

	public void setPesoAnimal(double pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}

	public double getAlturaAnimal() {
		return alturaAnimal;
	}

	public void setAlturaAnimal(double alturaAnimal) {
		this.alturaAnimal = alturaAnimal;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public String getCorAnimal() {
		return corAnimal;
	}

	public void setCorAnimal(String corAnimal) {
		this.corAnimal = corAnimal;
	}

	public String getTipoSanguineoAnimal() {
		return tipoSanguineoAnimal;
	}

	public void setTipoSanguineoAnimal(String tipoSanguineoAnimal) {
		this.tipoSanguineoAnimal = tipoSanguineoAnimal;
	}

	public String getAlimentacaoAnimal() {
		return alimentacaoAnimal;
	}

	public void setAlimentacaoAnimal(String alimentacaoAnimal) {
		this.alimentacaoAnimal = alimentacaoAnimal;
	}

	public String getSexoAnimal() {
		return sexoAnimal;
	}

	public void setSexoAnimal(String sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}
	
	//Sem regras de negócio avançadas, apenas para exemplificação de codificação.
	
	public boolean animalAndar() {
		if (andando == false) {
			System.out.println("O animal " + getNomeAnimal() + " está andando.");
			return andando = true;
		} else {
			System.out.println("O animal " + getNomeAnimal() + " está parado.");
			return andando = false;
		}
	}
	
	public boolean animalCorrer() {
		if (andando == false) {
			System.out.println("O animal " + getNomeAnimal() + " está correndo.");
			return andando = true;
		} else {
			System.out.println("O animal " + getNomeAnimal() + " parou de correr.");
			return andando = false;
		}
	}
	
	public boolean animalPular() {
		if (andando == false) {
			System.out.println("O animal " + getNomeAnimal() + " está pulando.");
			return andando = true;
		} else {
			System.out.println("O animal " + getNomeAnimal() + " parou de pular.");
			return andando = false;
		}
	}
	
	public boolean animalAlimentar() {
		if (andando == false) {
			System.out.println("O animal " + getNomeAnimal() + " está se alimentando.");
			return andando = true;
		} else {
			System.out.println("O animal " + getNomeAnimal() + " parou de se alimentar.");
			return andando = false;
		}
	}
	
	public boolean animalDormir() {
		if (andando == false) {
			System.out.println("O animal " + getNomeAnimal() + " está dormindo.");
			return andando = true;
		} else {
			System.out.println("O animal " + getNomeAnimal() + " está acordado.");
			return andando = false;
		}
	}
	
}
