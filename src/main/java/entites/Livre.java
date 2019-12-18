package entites;

import javax.persistence.*;

@Entity
@Table(name = "LIVRE")
public class Livre {

	@Id
	private int id;
	
	@Column(name="TITRE",nullable =false)
	private String titre;
	
	@Column(name="AUTEUR",nullable =false)
	private String auteur;
	
	
	public Livre(){}


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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}


	/**Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}


	/**Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
}
