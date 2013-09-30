package br.com.hro.sessionbeans;

import java.util.Random;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(LancadorDados.class)
public class LancadorDadosBean implements LancadorDados {

	private Random gerador = new Random();

	@Override
	public int lanca() {
		return this.gerador.nextInt(6) + 1;
	}
}
