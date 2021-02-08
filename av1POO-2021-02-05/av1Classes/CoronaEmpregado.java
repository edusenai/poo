package av1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CoronaEmpregado extends CoronaPessoa {
	
	boolean isAposentado;
	
	public CoronaEmpregado(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, boolean isAposentado, double valorBeneficio, int mesBeneficio) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria, valorBeneficio, mesBeneficio);
		this.isAposentado = isAposentado;
	}
	
	public boolean getIsAposentado() {
		return isAposentado;
	}
	
	public void setValorBeneficio() {
		this.valorBeneficio = ThreadLocalRandom.current().nextInt(1000, 1800 + 1);
	}
	
	public void setMesBeneficio() {
		Random rand = new Random();
		this.mesBeneficio = rand.nextInt(12) + 1;
	}
	
	// letra U
	
	public void getBeneficioEmpregado() {
		double beneficioEmpregado = valorBeneficio;
		if (valorBeneficio > 1000) {
			beneficioEmpregado = valorBeneficio * mesBeneficio;
		}
	}
	
	// letra E
	public void getBeneficioAposentado() {
		double beneficioAposentado = 0;
		if (isAposentado) {
			beneficioAposentado = valorBeneficio * mesBeneficio;
		}
	}
	@Override
	public String toString() {
		return getNomeCompleto() + " " + getDataNascimento() + " " + getEstadoUF() + " " + getCategoria() + " " + getIsAposentado() + " " + getValorBeneficio() + " " + getMesBeneficio();
	}

}
