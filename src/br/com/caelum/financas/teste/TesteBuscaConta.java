package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.model.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 1);
		
		System.out.println("O titular da conta e: " + conta.getTitular());
		
		conta.setTitular("Eduardo");
		
		em.getTransaction().commit();
		
		System.out.println("O titular da conta e: " + conta.getTitular());
		
		em.close();
		
	}

}
