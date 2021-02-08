package av1;

import java.util.Random;

public class CoronaEmpregador extends CoronaPessoa {

	private int numFunc;
	
	public CoronaEmpregador(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, int numFunc, double valorBeneficio, int mesBeneficio) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria, valorBeneficio, mesBeneficio);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}
	
	public void setValorBeneficio() {
		if (numFunc > 1 && numFunc <= 40) {
			int totalBruto = numFunc * 200;
			int totalAcrescimo = (int) (totalBruto * 0.11);
			valorBeneficio = totalBruto + totalAcrescimo;
		} else {
			valorBeneficio = numFunc * 200;
		}
	}
	
	public void setMesBeneficio() {
		Random rand = new Random();
		this.mesBeneficio = rand.nextInt(12) + 1;
	}
	
	//
	// letra R
	//
	
		public void getBeneficioEmpregador() {
			if (numFunc < 10) {
				double beneficioEmpregador = 0;
				beneficioEmpregador = valorBeneficio * mesBeneficio;
			}
		}

	@Override
	public String toString() {
		return getNomeCompleto() + " " + getDataNascimento() + " " + getEstadoUF() + " " + getCategoria() + " " + getNumFunc() + " " + getValorBeneficio() + " " + getMesBeneficio();
	}
	
}
