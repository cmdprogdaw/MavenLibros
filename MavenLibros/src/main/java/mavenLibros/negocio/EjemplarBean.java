package mavenLibros.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ejemplar")
public class EjemplarBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_ejemplar;
	
	@Column
	private String localizacion;

	
	@ManyToOne
	@JoinColumn(name="FK_libro")
	private LibroBean libro;
	
	
	
	@OneToMany(mappedBy="ejemplar")
	private List<SacarBean> sacar_ejemplares = new ArrayList<SacarBean>();
	
	
	public void addSacarEjemplar(SacarBean sacar) {
		
		if(!sacar_ejemplares.contains(sacar)) {
			
			sacar_ejemplares.add(sacar);
			sacar.setEjemplar(this);
		}
	}
	
	
	
	

	public List<SacarBean> getSacar_ejemplares() {
		return sacar_ejemplares;
	}


	public void setSacar_ejemplares(List<SacarBean> sacar_ejemplares) {
		this.sacar_ejemplares = sacar_ejemplares;
	}


	public LibroBean getLibro() {
		return libro;
	}

	public void setLibro(LibroBean libro) {
		this.libro = libro;
	}

	public long getCod_ejemplar() {
		return cod_ejemplar;
	}

	public void setCod_ejemplar(long cod_ejemplar) {
		this.cod_ejemplar = cod_ejemplar;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
}
