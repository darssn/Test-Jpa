package banque.entites;

import javax.persistence.*;



@Entity
@Table(name="Virement")
@AttributeOverrides({
    @AttributeOverride(name = "id", column =@Column(name = "id_vir")),
    @AttributeOverride(name="name", column=@Column(name="FULLNAME"))
})
public class Virement extends Operation{

	
	@Column(name="id_vir")
	private int id;

	
	@Column(name="beneficiaire")
	private String beneficiaire;
	
	public Virement(){
		
	}

	/**Getter
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**Setter
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
}
