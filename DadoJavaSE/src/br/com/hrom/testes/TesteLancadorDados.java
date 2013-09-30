package br.com.hrom.testes;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.hro.sessionbeans.LancadorDados;

public class TesteLancadorDados {

	public static void main(String[] args) throws NamingException {

		final Properties propriedades = new Properties();
		propriedades.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");

		InitialContext ic = new InitialContext(propriedades);

		LancadorDados lancadorDados = 
				(LancadorDados) ic.lookup("ejb:DadoEAR/Dado/LancadorDadosBean!br.com.hro.sessionbeans.LancadorDados");			
		
		System.out.println(lancadorDados.lanca());
	}
}
