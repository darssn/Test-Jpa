package banque;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import banque.entites.Adresse;
import banque.entites.Banque;
import banque.entites.Client;
import banque.entites.Compte;
import banque.entites.Operation;


public class TestJpaBanque {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Banque bank = new Banque();
		bank.setNom("bank1");
		em.persist(bank);	
		
	
		Compte compte = new Compte();
		
		compte.setNumero("1122");
		compte.setSolde(1213);
		em.persist(compte);
		

		Operation op = new Operation();
		
		op.setDate(LocalDateTime.now());
		op.setMontant(10000);
		op.setMotif("virement");
		op.setCompte(compte);
				
		em.persist(op);
		
			
		List<Compte> comptL = new ArrayList<>();
		comptL.add(compte);
		
		
		Adresse adr =new Adresse();
		adr.setCodePostal(34000);
		adr.setRue("Gambetta");
		adr.setVille("Montpellier");
		adr.setNumero(12);
		
		Client c = new Client();
		
		c.setBanque(bank);
		c.setAdresse(adr);
		c.setDateNaissance(LocalDate.now());
		c.setNom("BBBBBBBB");
		c.setPrenom("aaaaa");
		c.setListeCompte(comptL);
				
		em.persist(c);
	
		
		
		
		et.commit();
		
		em.close();
		emf.close();
	}

}
