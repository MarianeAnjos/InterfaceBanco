package Conta_Controller;

import Conta.model.Conta;
import Conta.repository.ContaRepository;
import java.util.ArrayList;
import Conta.model.Conta;


public class ContaController implements ContaRepository {

	int numero = 0;
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	
	@Override
	
	public void listarTodas() {
		for(var conta: listaContas) {
			conta.visualizar();
		}
	}
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\n A Conta número: "+ conta.getNumero()+" foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
		
	}

	public int gerarNumero() {
		return ++ numero;
	}
	
}
