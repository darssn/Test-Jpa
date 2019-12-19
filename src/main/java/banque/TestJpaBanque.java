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
import banque.entites.AssuranceVie;
import banque.entites.Banque;
import banque.entites.Client;
import banque.entites.Compte;
import banque.entites.LivretA;
import banque.entites.Operation;
import banque.entites.Virement;


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
		

		Virement vir = new Virement();
		
		vir.setDate(LocalDateTime.now());
		vir.setMontant(10000);
		vir.setMotif("virement");
		vir.setCompte(compte);
				
		em.persist(vir);
		
		
		
		
		
		LivretA lA = new LivretA();
		lA.setNumero("324");
		lA.setSolde(3333);
		lA.setTaux(12);
		em.persist(lA);
		
		AssuranceVie aV = new AssuranceVie();
		aV.setTaux(13);
		aV.setNumero("98898");
		aV.setSolde(65656);
		aV.setDateFin(LocalDate.now());
		em.persist(aV);
		
		
		Operation op = new Operation();
		op.setDate(LocalDateTime.now());
		op.setMontant(100);
		op.setMotif("retrait");
		op.setCompte(aV);
		em.persist(op);
			
		List<Compte> comptL = new ArrayList<>();
		comptL.add(compte);
		
		List<Compte>comptL2 = new ArrayList<>();
		comptL2.add(lA);
		comptL2.add(aV);
		
		Adresse adr = new Adresse();
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
		
		
		Adresse adr2 =new Adresse();
		adr2.setCodePostal(34200);
		adr2.setRue("Verdun");
		adr2.setVille("Sete");
		adr2.setNumero(12);
		
		Client c2 = new Client();
		
		c2.setBanque(bank);
		c2.setAdresse(adr2);
		c2.setDateNaissance(LocalDate.now());
		c2.setNom("CCCCCCCCCCC");
		c2.setPrenom("ddddddddd");
		c2.setListeCompte(comptL);
				
		em.persist(c2);
		
		
		Client c3 = new Client();
		
		c3.setBanque(bank);
		c3.setAdresse(adr2);
		c3.setDateNaissance(LocalDate.now());
		c3.setNom("XXXXXXXXX");
		c3.setPrenom("zzzzzzzzzzzzz");
		c3.setListeCompte(comptL2);
				
		em.persist(c3);
		
		
	
		
		
		
		et.commit();
		
		em.close();
		emf.close();
	}

}
