package av1;

import java.util.ArrayList;

public class CoronaBeneficiarios {

	@SuppressWarnings("unused")
	private String nomeBeneficio;
	private ArrayList<CoronaEmpregado> empregados;
	private ArrayList<CoronaEmpregador> empregadores;
	private ArrayList<CoronaDesempregado> desempregados;
	
	public CoronaBeneficiarios(String nomeBeneficio) {
		super();
		this.nomeBeneficio = nomeBeneficio;
		this.empregados = new ArrayList<>();
		this.empregadores = new ArrayList<>();
		this.desempregados = new ArrayList<>();
	}
	
	public void addEmpregado(CoronaEmpregado empregado) {
		empregados.add(empregado);
	}
	
	public void addEmpregador(CoronaEmpregador empregador) {
		empregadores.add(empregador);
	}
	
	public void addDesempregado(CoronaDesempregado desempregado) {
		desempregados.add(desempregado);
	}
	
	public void listEmpregados() {
		for (CoronaEmpregado coronaEmpregado : empregados) {
			System.out.println(coronaEmpregado);
		}
	}
	
	public void listEmpregador() {
		for (CoronaEmpregador coronaEmpregador : empregadores) {
			System.out.println(coronaEmpregador);
		}
	}
	
	public void listDesempregados() {
		for (CoronaDesempregado coronaDesempregados : desempregados) {
			System.out.println(coronaDesempregados);
		}
	}
		
}
