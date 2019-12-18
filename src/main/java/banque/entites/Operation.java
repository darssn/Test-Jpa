package banque.entites;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="Operation")
public class Operation {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date")
	private LocalDateTime date;
	
	@Column(name="montant")
	private double montant;
	
	@Column(name="motif")
	private String motif;
	
	@ManyToOne()
	@JoinColumn(name="id_compte")
	private Compte compte;
	
	
	public Operation(){
		
		
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
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}


	/**Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	/**Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}


	/**Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}


	/**Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}


	/**Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}


	/**Getter
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}


	/**Setter
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
