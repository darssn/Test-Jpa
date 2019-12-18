import java.util.List;

import javax.persistence.*;

import entites.ClientBiblio;
import entites.Emprunt;
import entites.Livre;

public class TestJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Livre l = em.find(Livre.class,1);
		
		if (l!= null){
			
			System.out.println("Id : "+l.getId()+" | Titre : "+l.getTitre() +" | Auteur : "+l.getAuteur());
			
		}
		String recherche ="Germinal";
		
		TypedQuery<Livre> qLivre =em.createQuery("select l from Livre l where l.titre ='"+recherche+"'",Livre.class);
		
		List<Livre> livreList = qLivre.getResultList();
		
		for(Livre livre : livreList){
			
			System.out.println(livre.getTitre());
			
			
		}
	
		/*
		Livre test = new Livre();
		test.setAuteur("Test1");
		test.setTitre("Test");
		test.setId(6);
		
		
		em.persist(test);
		
		
		
		
		Livre testModif = em.find(Livre.class,6);
		if(test != null ){
			
			testModif.setTitre("TestModif");
			
		}
		
		
		
		Livre testDel = em.find(Livre.class,6);
		
		if(testDel != null){
			em.remove(testDel);
			
			
			
		}*/
		
		
	Emprunt emp = em.find(Emprunt.class,1);
		
		if (emp!= null){
			
			for(Livre li : emp.getListeLivre()){
			
			System.out.println(li.getTitre());
			
			}
			
		}
		
		ClientBiblio c = em.find(ClientBiblio.class,1);
		
		if(c!= null){
			
			for(Emprunt e : c.getListeEmprunt()){
				
				System.out.println(e.getId() +" | delai : " +e.getDelai() + " | date debut : "+e.getDateDebut()+" | date fin : "+e.getDateFin());
				
				
			}
			
		}
		
		
	
		
		
		
	
	et.commit();
	
	em.close();
	emf.close();
	
	
	
	
	}

}
