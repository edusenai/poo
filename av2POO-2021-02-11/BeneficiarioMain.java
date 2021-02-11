package av2v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BeneficiarioMain {

	public static void main(String[] args) throws SQLException {
		
		//Tratamentos banco
		
		criaBanco();
		criaTabela();
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int opcao = 1;
		
		//CoronaBeneficiarios beneficio = new CoronaBeneficiarios("Corona Voucher");
			
		while (opcao == 1) {
			
			String isAposentado = "false";
			String numFunc = ""; 
			String mesDesempregado = "";
			
			System.out.println("Cadastrar novo beneficiário");
			
			System.out.print("Nome Completo: ");
			String nomeCompleto = keyboard.nextLine();
			
			System.out.print("Data nascimento (DD-MM-AAAA): ");
			String dataNascimento = keyboard.nextLine();
			
			System.out.print("Categoria (EMPREGADO, EMPREGADOR, DESEMPREGADO): ");
			String categoria = keyboard.nextLine();
			
			categoria = categoria.toUpperCase();
			
			BeneficiarioCategoria categoriaFormatada = BeneficiarioCategoria.valueOf(categoria);
									
			if (categoriaFormatada == BeneficiarioCategoria.EMPREGADO) {
				//EMPREGADO
				System.out.print("É aposentado? (SIM ou NÃO): ");
				String tecladoAposentado = keyboard.nextLine();
				
				tecladoAposentado = tecladoAposentado.toLowerCase();
				
				switch (tecladoAposentado) {
				case ("sim"):
					isAposentado = "true";
					break;
				}
				
			} else if (categoriaFormatada == BeneficiarioCategoria.EMPREGADOR) {
				//EMPREGADOR
				System.out.print("Número de funcionários: ");
				numFunc = keyboard.nextLine();
	
			} else {
				//DESEMPREGADO
				System.out.print("Meses desempregado: ");
				mesDesempregado = keyboard.nextLine();
			}
						
			System.out.print("UF: ");
			String estado = keyboard.nextLine();
			
			if (categoriaFormatada == BeneficiarioCategoria.EMPREGADO) {
				int meses = getRandomInt();
				double valorBeneficio = getRandomDouble();
				inserirUsuario(nomeCompleto, dataNascimento, estado, categoria, isAposentado, valorBeneficio, meses);
			}
			
			if (categoriaFormatada == BeneficiarioCategoria.EMPREGADOR) {
				int meses = getRandomInt();
				double valorBeneficio = getRandomDouble();
				inserirUsuario(nomeCompleto, dataNascimento, estado, categoria, numFunc, valorBeneficio, meses);
			}
			
			if (categoriaFormatada == BeneficiarioCategoria.DESEMPREGADO) {
				int meses = getRandomInt();
				double valorBeneficio = getRandomDouble();
				inserirUsuario(nomeCompleto, dataNascimento, estado, categoria, mesDesempregado, valorBeneficio, meses);
			}
			
			System.out.print("Deseja criar outro beneficiário? 1 - SIM / 2 - NÃO: ");
			opcao = keyboard.nextInt();
			
			keyboard.nextLine();
		
		}

		//Impressão
		
		//Total de usuários
		getTotalUsuarios();
		
		
		//Total valor
		//Nome 2 + valor
		//Nome 2 + tempo
		//Delete
		
	}
	
	public static int getRandomInt() {
		int mes = 0;
		Random rand = new Random();
		return mes = rand.nextInt(12) + 1;
	}
	
	public static double getRandomDouble() {
		double valor;
		return valor = ThreadLocalRandom.current().nextInt(1000, 1800 + 1);
	}
	
	public static void criaBanco() throws SQLException {
		Connection conexao = Conexao.getConnectionFirst();
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS beneficiario");
		
		conexao.close();
	}
	
	public static void criaTabela() throws SQLException {
		Connection conexao = Conexao.getConnection();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nomeCompleto VARCHAR(80) NOT NULL,"
				+ "dataNascimento VARCHAR(80) NOT NULL,"
				+ "estadoUF VARCHAR(2),"
				+ "categoria VARCHAR(20),"
				+ "dadoBeneficiario VARCHAR(12),"
				+ "valorRecebido DECIMAL(10,2),"
				+ "mesBeneficio INT"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		conexao.close();
	}
	
		
	public static void inserirUsuario(String nomeCompleto, String dataNascimento, String estadoUF, String categoria, String dadoBeneficiario, double valorRecebido, int mesBeneficio) throws SQLException {
		Connection conexao = Conexao.getConnection();
	
		String sql = "INSERT INTO pessoas (nomeCompleto, dataNascimento, estadoUF, categoria, dadoBeneficiario, valorRecebido, mesBeneficio) "
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, nomeCompleto);
		stmt.setString(2, dataNascimento);
		stmt.setString(3, estadoUF);
		stmt.setString(4, categoria);
		stmt.setString(5, dadoBeneficiario);
		stmt.setDouble(6, valorRecebido);
		stmt.setInt(7, mesBeneficio);
		
		stmt.execute();
		
		conexao.close();
	}
	
	public static void getTotalUsuarios() throws SQLException {
		Connection conexao = Conexao.getConnection();
		
		//String sql = "SELECT COUNT(codigo) FROM pessoas";

		ResultSet rs = conexao.prepareStatement("SELECT * FROM pessoas").executeQuery();

        ResultSetMetaData metaData = rs.getMetaData();
        int numeroDeColunas = metaData.getColumnCount();
		
		
		//Statement stmt = conexao.createStatement();
		//ResultSet saida = stmt.executeQuery(sql);
		
		//int resultado = saida;
		
		System.out.println("O total de usuários é: " + numeroDeColunas);
		
		conexao.close();
	}

}








