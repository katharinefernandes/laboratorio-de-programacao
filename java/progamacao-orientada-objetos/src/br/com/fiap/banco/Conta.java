package br.com.fiap.banco;

public class Conta {

	// static para quando não quero instanciar um objeto

	// nível mais restritivo (só visto dentro da própria classe)
	private String numAgencia;
	private String numConta;
	private double saldo;
	// BigDecimal para cálculos financeiros (arredondamento mais bem definido)
	private Cliente cliente;

	// encapsulamento para acessar os atributos, para implementar o JavaBean é
	// necessário criar os getters e setters

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void deposito(double valor) {
		// referência o atributo da própria classe (como se fosse o global)
		// é uma boa prática
		this.saldo += valor;
	}

	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferencia(String numConta, String numAgencia, double valor) {

		if (!this.numConta.equals(numConta) || !this.numAgencia.equals(numAgencia)) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}

		return false;

	}

}
