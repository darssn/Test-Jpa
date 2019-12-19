package banque.entites;
import javax.persistence.*;

@Entity
@Table(name="Livret_A")

public class LivretA extends Compte {

	@Column(name="taux")
	private double taux;
	
	
	public LivretA(){
	
		
	}

	/**Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
