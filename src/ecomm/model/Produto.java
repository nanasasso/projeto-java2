package ecomm.model;

public abstract class Produto {

	private String nomeperfume;
	private String marca;
	private float valor;
	private int estoque;
	private int tipo;
	
	public Produto(String nomeperfume, String marca, float valor, int estoque, int tipo) {
		this.nomeperfume = nomeperfume;
		this.marca = marca;
		this.valor = valor;
		this.estoque = estoque;
		this.tipo = tipo;
	}
	public String getNomeperfume() {
		return nomeperfume;
	}
	public void setNomeperfume(String nomeperfume) {
		this.nomeperfume = nomeperfume;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
public boolean sacarEstoque (int estoque) { 
		
		if(this.getEstoque() < estoque) {
			System.out.println("\n Sem estoque");
			return false;
		}
			
		this.setEstoque(this.getEstoque() - estoque);
		return true;
	}

public void depositarEstoque(int estoque) {

	this.setEstoque(this.getEstoque() + estoque);
	
}
public void visualizar() {

	String tipo = "";
	
	switch(this.tipo) {
	case 1:
		tipo = "Amostra";
	break;
	case 2:
		tipo = "Completo";
	break;
	}
	
	System.out.println("\n\n***********************************************************");
	System.out.println("Dados da Produto:");
	System.out.println("***********************************************************");
	System.out.println("Nome do perfume: " + this.nomeperfume);
	System.out.println("Marca: " + this.marca);
	System.out.println("Tipo da Produto: " + tipo);
	System.out.println("Valor: " + this.valor);
	System.out.println("Estoque: " + this.estoque);
}
	
}
