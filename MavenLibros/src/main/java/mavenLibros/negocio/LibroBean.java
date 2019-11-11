package mavenLibros.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="libro")
public class LibroBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_libro;
	
	@Column
	private String titulo;
	
	@Column
	private String isbn;
	
	@Column 
	private String editorial;
	
	@Column 
	private int paginas;

	
	@ManyToMany
	private List<AutorBean> autores = new ArrayList<AutorBean>();
	
	
	@OneToMany(mappedBy="libro")
	private List<EjemplarBean> ejemplares = new ArrayList<EjemplarBean>();
	
	
	public void addEjemplares(EjemplarBean ejemplar) {
		
		if(!ejemplares.contains(ejemplar)) {
			
			ejemplares.add(ejemplar);
			ejemplar.setLibro(this);
		}
	}
	
	
	
	public List<EjemplarBean> getEjemplares() {
		return ejemplares;
	}



	public void setEjemplares(List<EjemplarBean> ejemplares) {
		this.ejemplares = ejemplares;
	}



	public List<AutorBean> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorBean> autores) {
		this.autores = autores;
	}

	public long getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(long cod_libro) {
		this.cod_libro = cod_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
}
