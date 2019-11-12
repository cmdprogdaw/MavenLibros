package mavenLibros.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="autor")
public class AutorBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_autor;
	
	@Column
	private String nombre;

	
	@ManyToMany(mappedBy="autores")
	private List<LibroBean> libros = new ArrayList<LibroBean>();
	
	
	public void addLibros(LibroBean libro) {
		
		if(!libros.contains(libro)) {
			
			libros.add(libro);
			libro.add(this); //al libro le metes el autor
			
			/*
			List<AutorBean> autores = libro.getAutores();
			if(!autores.contains(this)) {
				
				autores.add(this);
			}
			*/
		}
	}
	
	
		
	public List<LibroBean> getLibros() {
		return libros;
	}

	public void setLibros(List<LibroBean> libros) {
		this.libros = libros;
	}

	public long getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(long cod_autor) {
		this.cod_autor = cod_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
