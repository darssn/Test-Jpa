package banque.entites;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="Assurance_vie")
public class AssuranceVie extends Compte{

	@Column(name="date_fin")
	private LocalDate dateFin;
	
	@Column(name="taux")
	private double taux;
	
	
	public AssuranceVie(){
		
	}


	/**Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}


	/**Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
