package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class Teste {

	public static void main(String[] args) throws RemoteException {

		
		LivrariaWS cliente = new LivrariaWSProxy();
		Livro[] livros = cliente.getLivrosPorTitulo("livro");
		for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
            System.out.println(livro.getAutor().getNome());
        }
	}

}
