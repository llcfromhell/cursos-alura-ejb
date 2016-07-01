package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.interceptor.LogInterceptador;
import br.com.caelum.livraria.modelo.Livro;

@Stateless
//@Interceptors(LogInterceptador.class)
public class LivroDao {

	@PersistenceContext
    private EntityManager manager;
	
	public void salva(Livro livro) {
		manager.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		return manager.createQuery("select l from Livro l", Livro.class)
                .getResultList();
	}
	
}
