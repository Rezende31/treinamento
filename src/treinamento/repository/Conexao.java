package treinamento.repository;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
	
	private String url = "jdbc:postgresql://localhost:5432/postgres";  // caminho no meu repos
	private String user = "*******";
	private String password = "********";
	
	public Connection abrirConexao() throws Exception{
		Connection conn = null;
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, user, password);
			
			return conn;
		} catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("Deu ruim na conexao!!");
		}
		
	}

}
