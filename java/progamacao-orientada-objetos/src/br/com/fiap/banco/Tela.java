package br.com.fiap.banco;

public class Tela {

	public static void main(String[] args) {
		
		// instanciar e criar o objeto na memória
		// gera o objeto na memória quando adicionamos o "new"
		// cria do menos específico para o mais específico (faz mais sentido quando tratamos de herança)
		Conta c1 = new Conta();
		
		// tipos de dados primitivos double/int o == funciona, no caso de String é uma classe, ou seja, um objeto no Java, portanto o que utilizamos é o equals para saber se o conteúdo é iqual
		c1.deposito(500);
		c1.setNumConta("123");
		c1.setNumAgencia("00023");
		
		// endereçamento da memória onde a JM guardou o objeto
		System.out.println(c1);
		c1.deposito(300);
		System.out.println("Saldo " + c1.getSaldo());
		System.out.println("Num Conta: " + c1.getNumConta());
		System.out.println("Num. Agencia " + c1.getNumAgencia());
		
		if(c1.transferencia("123", "00024", 800)) {
			System.out.println("Saldo apos transferencia: " + c1.getSaldo());
		} else {
			System.out.println("Nao foi possivel fazer a transferencia");			
		}
		
		Cliente cli1 = new Cliente();
		cli1.setIdCliente(1L);
		cli1.setNomeCliente("Cliente 1");
		cli1.setSexo("Feminino");
		cli1.setIdade(20l);
		cli1.setCpf("123.123.123-12");
		c1.setCliente(cli1);
		
		System.out.println(c1.getCliente());
		
		
		
	}

}
