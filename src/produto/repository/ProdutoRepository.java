package produto.repository;

import ecomm.model.Produto;

public interface ProdutoRepository {

	// CRUD da Conta
	public void procurarPorPerfume(String nomeperfume);
	public void listarTodas();
	public void cadastrar(Produto conta);
	public void atualizar(Produto conta);
	public void deletar(int numero);

	// Métodos Bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
