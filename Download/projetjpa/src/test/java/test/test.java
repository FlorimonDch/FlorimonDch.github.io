package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class test {

	public static void main(String[] args) {
		
	}
	
	

	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		System.out.println("coucou");
		em.close();
		emf.close();
	}

}
