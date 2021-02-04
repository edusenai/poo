package revisaoArray;

public class AgendaMain {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("Agenda");
		
		Contato contato1 = new Contato(1, "Eduardo", "aa@aa.com", "AAA", "11223344", "111223344");
		Contato contato2 = new Contato(2, "Eduardo", "aa@aa.com", "AAA", "11223344", "111223344");
		Contato contato3 = new Contato(3, "Eduardo", "aa@aa.com", "AAA", "11223344", "111223344");
		
		agenda.cadastrar(contato1);
		agenda.cadastrar(contato2);
		agenda.cadastrar(contato3);
		
		agenda.listar();
		
		System.out.println("\nLista após exclusão");
		
		agenda.excluir(contato1);
		
		agenda.listar();
		
		contato2.setEmail("bb@bb.com");
		
		System.out.println("\nLista após set de e-mail no objeto da classe Contato");
		
		agenda.listar();
		
	}

}
