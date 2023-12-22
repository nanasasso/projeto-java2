package ecomm.model;

public class Amostra extends Produto {

	private int quantidade;
	
	public Amostra(String nomeperfume, String marca, float valor, int estoque, int tipo) {
		super(nomeperfume, marca, valor, estoque, tipo);
		this.quantidade = quantidade;
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
 @Override	
public boolean sacarEstoque (int estoque) { 
		
		if(this.getEstoque() + this.getQuantidade() < estoque) {
			System.out.println("\n Indisponível");
			return false;
		}
			
		this.setEstoque(this.getEstoque() - estoque);
		return true;
	}
@Override
public void visualizar() {
	super.visualizar();
	System.out.println("Quantidade: " + this.quantidade);
}
}

