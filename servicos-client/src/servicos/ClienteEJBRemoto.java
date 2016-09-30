package servicos;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClienteEJBRemoto {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		InitialContext ctx = new InitialContext();
		Servico servico = (Servico) ctx.lookup("ejb:/servicos/ServicoBean!servicos.Servico");
	
		servico.executa();
		
	}

}
