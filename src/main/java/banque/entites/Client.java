package banque.entites;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Client")

public class Client {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "date_naissance")
	private LocalDate dateNaissance;

	@ManyToOne
	@JoinColumn(name = "id_banque")
	private Banque banque;
	
	@Embedded
	private Adresse adresse;

	@ManyToMany
	@JoinTable(name = "Compte_Client", 
	joinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"))

	private List<Compte> listeCompte;

	public Client() {

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
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**Getter
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**Setter
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**Getter
	 * @return the listeCompte
	 */
	public List<Compte> getListeCompte() {
		return listeCompte;
	}

	/**Setter
	 * @param listeCompte the listeCompte to set
	 */
	public void setListeCompte(List<Compte> listeCompte) {
		this.listeCompte = listeCompte;
	}

}
