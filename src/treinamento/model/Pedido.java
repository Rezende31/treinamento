package treinamento.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Integer id;
	private Date data;
	private Double soma;
	List<Produto> produtos = new ArrayList<>();
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer id, Date data, Double soma, List<Produto> produtos) {
		super();
		this.id = id;
		this.data = data;
		this.soma = soma;
		this.produtos = produtos;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getSoma() {
		return soma;
	}
	public void setSoma(Double soma) {
		this.soma = soma;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", soma=" + soma + ", produtos=" + produtos + "]";
	}
	
}
