package banque.entites;
import javax.persistence.*;

@Embeddable
public class Adresse{

	
	@Column(name="numero")
	private int numero;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="codePostal")
	private int codePostal;
	
	@Column(name="ville")
	private String ville;
	
	
	public Adresse(){
		
		
	}


	/**Getter
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**Setter
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**Getter
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}


	/**Setter
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}


	/**Getter
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}


	/**Setter
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	/**Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
}
