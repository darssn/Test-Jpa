package entites;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="CLIENT")
public class ClientBiblio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NOM",nullable = false)
	private String nom;
	
	@Column(name="PRENOM",nullable = false)
	private String prenom;
	
	
	@OneToMany(mappedBy="client")
	private List<Emprunt> listeEmprunt;
	
	
	
	public ClientBiblio(){
		
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**Getter
	 * @return the listeEmprunt
	 */
	public List<Emprunt> getListeEmprunt() {
		return listeEmprunt;
	}



	/**Setter
	 * @param listeEmprunt the listeEmprunt to set
	 */
	public void setListeEmprunt(List<Emprunt> listeEmprunt) {
		this.listeEmprunt = listeEmprunt;
	}

}
