package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.model.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Guilherme Neres");
		conta.setBanco("Banco do Brasil");
		conta.setAgencia("2727-8");
		conta.setNumero("98827-3");
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
	
		em.close();
	}
	
}
