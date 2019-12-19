package banque.entites;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Compte")
@Inheritance(strategy = InheritanceType.JOINED)

public class Compte {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="solde")
	private double solde;
	
	@ManyToMany
	@JoinTable(name="Compte_Client",
		joinColumns = @JoinColumn(name="id_compte",referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name="id_client",referencedColumnName ="id")
					
			)	
	private List<Client> listeClient;
	
	
	@OneToMany(mappedBy="compte")
	private List<Operation>listeOperation;
	
	
	public Compte(){
		
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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}


	/**Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}


	/**Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}


	/**Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
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


	/**Getter
	 * @return the listeOperation
	 */
	public List<Operation> getListeOperation() {
		return listeOperation;
	}


	/**Setter
	 * @param listeOperation the listeOperation to set
	 */
	public void setListeOperation(List<Operation> listeOperation) {
		this.listeOperation = listeOperation;
	}
	
	
	
}
