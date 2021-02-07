package av1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CoronaDesempregado extends CoronaPessoa {

	private int mesDesempregado;
	
	public CoronaDesempregado(String nomeCompleto, String dataNascimento, String estadoUF, CoronaCategoria categoria, int mesDesempregado, double valorBeneficio, int mesBeneficio) {
		super(nomeCompleto, dataNascimento, estadoUF, categoria, valorBeneficio, mesBeneficio);
		this.mesDesempregado = mesDesempregado;
	}

	public int getMesDesempregado() {
		return mesDesempregado;
	}
	
	public void setValorBeneficio() {
		this.valorBeneficio = ThreadLocalRandom.current().nextInt(1500, 2300 + 1);
	}
	
	public void setMesBeneficio() {
		Random rand = new Random();
		this.mesBeneficio = rand.nextInt(12) + 1;
	}

	@Override
	public String toString() {
		return getNomeCompleto() + " " + getDataNascimento() + " " + getEstadoUF() + " " + getCategoria() + " " + getMesDesempregado() + " " + getValorBeneficio() + " " + getMesBeneficio();
	}
	
}
