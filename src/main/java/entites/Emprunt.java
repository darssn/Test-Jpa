package entites;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@Id
	private int id;
	
	@Column(name="DATE_DEBUT")

	private LocalDateTime dateDebut;
	
	@Column(name="DATE_FIN")

	private LocalDateTime dateFin;
	
	@Column(name="DELAI")
	private int delai;
	
	
	@ManyToMany
	@JoinTable(name="COMPO",
		joinColumns = @JoinColumn(name="ID_EMP",referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name="ID_LIV",referencedColumnName ="ID")
			
			)
	private List<Livre> listeLivre;
	
	
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private ClientBiblio client;
	
	public Emprunt(){
		
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
	 * @return the dateDebut
	 */
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	/**Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**Getter
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}

	/**Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	/**Getter
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**Setter
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**Getter
	 * @return the idClient
	 */
	public ClientBiblio getClient() {
		return client;
	}

	/**Setter
	 * @param idClient the idClient to set
	 */
	public void setClient(ClientBiblio client) {
		this.client = client;
	}

	/**Getter
	 * @return the listeLivre
	 */
	public List<Livre> getListeLivre() {
		return listeLivre;
	}

	/**Setter
	 * @param listeLivre the listeLivre to set
	 */
	public void setListeLivre(List<Livre> listeLivre) {
		this.listeLivre = listeLivre;
	}

}
