package av2v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnectionFirst() {
		try {
			final String stringDeConexao = "jdbc:mysql://172.17.0.1/";
			final String stringUsuario = "root";
			final String stringSenha = "pass";
			
			return DriverManager.getConnection(stringDeConexao, stringUsuario, stringSenha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}

	public static Connection getConnection() {
		try {
			final String stringDeConexao = "jdbc:mysql://172.17.0.1/beneficiario";
			final String stringUsuario = "root";
			final String stringSenha = "pass";
			
			return DriverManager.getConnection(stringDeConexao, stringUsuario, stringSenha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
	
}
