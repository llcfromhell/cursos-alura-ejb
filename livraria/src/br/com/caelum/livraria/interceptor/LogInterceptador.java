package br.com.caelum.livraria.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext contex) throws Exception {

		long millis = System.currentTimeMillis();

	    Object o = contex.proceed();

	    System.out.println("[INFO] Tempo gasto no acesso ao BD: "
	    		+ contex.getTarget().getClass().getSimpleName() + " - " 
	    		+ contex.getMethod().getName() + " = "
	         + (System.currentTimeMillis() - millis) + "ms");

	    return o;

		
	}
	
}
