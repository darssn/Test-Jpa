import java.util.List;

import javax.persistence.*;

import entites.Livre;

public class TestJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		
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
		
		

	em.close();
	emf.close();
	
	
	
	
	}

}
