package banque.entites;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Banque")
public class Banque {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nom")
	private String nom ;
	
	@OneToMany(mappedBy="banque")
	private List<Client> listeClient;
	
	
	public Banque(){
		
	}


	/**Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**Getter
	 * @return the listeClient
	 */
	public List<Client> getListeClient() {
		return listeClient;
	}


	/**Setter
	 * @param listeClient the listeClient to set
	 */
	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}
	
	

}
