package Ex45;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private Cliente cliente;
	private ArrayList<ItemComprado> produto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<ItemComprado> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<ItemComprado> produto) {
		this.produto = produto;
	}
	
	public void AdicionarProduto(p: Produto , qtd: int) {	
	}
	
	public void RemoverProduto(p:Produto) {
		
	}
}
