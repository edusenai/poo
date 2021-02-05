package av1;

//import java.util.Scanner;

public class CoronaMain {

	public static void main(String[] args) {
		
		CoronaPessoa pessoa1 = new CoronaPessoa("João da Silva", "01-01-1990", "SC", CoronaCategoria.EMPREGADO);
		CoronaPessoa pessoa2 = new CoronaPessoa("João da Silva", "01-01-1990", "SC", CoronaCategoria.EMPREGADOR);
		CoronaPessoa pessoa3 = new CoronaPessoa("João da Silva", "01-01-1990", "SC", CoronaCategoria.DESEMPREGADO);
		
		pessoa1.defineTipoCategoria();
		pessoa2.defineTipoCategoria();
		pessoa3.defineTipoCategoria();
		
		System.out.println(pessoa1.getCategoriaAposentado());
		System.out.println(pessoa2.getNumFunc());
		System.out.println(pessoa3.getMesDesempregado());
		
	}

}
