package ecomm.model;

public class Completo extends Produto {

	private int aniversario;
	
	public Completo(String nomeperfume, String marca, float valor, int estoque, int tipo) {
		super(nomeperfume, marca, valor, estoque, tipo);
		
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);

}
}
