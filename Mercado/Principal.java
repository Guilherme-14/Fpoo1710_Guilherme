package Mercado;

public class Principal {

	public static void main(String[] args) {
		Produto prod1 = new Produto(1, "Guilherme" , 150);
		System.out.println("--Pessoa--");
		System.out.println("Id: " + prod1.getId());
		System.out.println("Nome: " + prod1.getNome());
		System.out.println("Preco: " + prod1.getPreco());
		
		Sorvete sorv1 = new Sorvete(2, "Joao Paulo" , 11.00 , -2);
		System.out.println("--Sorvete--");
		System.out.println("Id: " + sorv1.getId());
		System.out.println("Nome: " + sorv1.getNome());
		System.out.println("Preco: " + sorv1.getPreco());
		System.out.println("Temperatura: " + sorv1.getTempAdequada());
		
		Camisa cam1 = new Camisa(3, "David" , 90.99 , "azul" , "algodao" , "GG" );
		System.out.println("--Camisa--");
		System.out.println("Id: " + cam1.getId());
		System.out.println("Nome: " + cam1.getNome());
		System.out.println("Preco: " + cam1.getPreco());
		System.out.println("Cor: " + cam1.getCor());
		System.out.println("Tecido: " + cam1.getTecido());
		System.out.println("Tamanho: " + cam1.getTamanho());
	}

}
