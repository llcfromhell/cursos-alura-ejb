package servicos;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(Servico.class)
public class ServicoBean implements Servico {

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		System.out.println("recebendo chamada remota");
		
	}
	
	

}
