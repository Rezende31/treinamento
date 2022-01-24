package treinamento.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import treinamento.model.Pedido;
import treinamento.model.Produto;

public class PedidoRepository {

	Conexao conexao = new Conexao();
	PreparedStatement ps;

	public ArrayList<Pedido> read() {
		Connection con = null;
		ArrayList<Pedido> listaPedido = new ArrayList<>();
		try {
			con = conexao.abrirConexao();
			ps = con.prepareStatement(
					"SELECT * FROM PEDIDO PED INNER JOIN PRODUTO PRO ON PED.id_Pedido = pro.id_pedido order by ped.id_pedido");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Double soma = 0.0;
				Boolean achou = true;
				if (listaPedido.isEmpty()) {
					Pedido pedido = new Pedido();
					Produto produto = new Produto();
					produto.setNome(rs.getString("nome"));
					produto.setPreco(rs.getDouble("preco"));
					pedido.setData(rs.getDate("data"));
					pedido.setId(rs.getInt("id_pedido"));
					pedido.setSoma(rs.getDouble("preco"));
					pedido.getProdutos().add(produto);
					listaPedido.add(pedido);
				} else {
					for (int i = 0; i < listaPedido.size(); i++) {
						achou = false;
						Produto produto = new Produto();
						produto.setNome(rs.getString("nome"));
						produto.setPreco(rs.getDouble("preco"));
						// soma = listaPedido.get(i).getSoma() + produto.getPreco();
						listaPedido.get(i).setSoma(listaPedido.get(i).getSoma() + produto.getPreco());
						listaPedido.get(i).getProdutos().add(produto);
					}
					if (achou) {
						Pedido pedido = new Pedido();
						Produto produto = new Produto();
						produto.setNome(rs.getString("nome"));
						produto.setPreco(rs.getDouble("preco"));
						pedido.setData(rs.getDate("data"));
						pedido.setId(rs.getInt("id_pedido"));
						pedido.setSoma(rs.getDouble("preco"));
						pedido.getProdutos().add(produto);
						listaPedido.add(pedido);
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		return listaPedido;
	}
	
	public void delete(Integer dellPedido) {
		Connection con = null;
		Boolean a = true;
		try {
			con = conexao.abrirConexao();
			PreparedStatement ps = con.prepareStatement("DELETE * FROM PEDIDO WHERE id_pedido = ?");
			a = ps.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e ) {
				e.printStackTrace();
			}
		}
	}

}
