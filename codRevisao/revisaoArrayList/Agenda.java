package revisaoArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Agenda {

	private String nomeAgenda;
	private ArrayList<Contato> Contatos;
	
	public Agenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
		this.Contatos = new ArrayList<>();
	}
	
	//cadastrar
	public void cadastrar(Contato contato) {
		Contatos.add(contato);
	}
	
	//excluir
	public void excluir(Contato contato) {
		Contatos.remove(contato);
	}
	
	//atualizar
	public void atualizar() {
		for (Contato contato : Contatos) {
			contato.getCodigo();
		}
	}
	
	//listar
	public void listar() {
		for (Contato contato : Contatos) {
			System.out.println(contato);
		}
	}	
}
