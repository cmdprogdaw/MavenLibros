package mavenLibros.modelo.libro;

import javax.persistence.EntityManager;

import mavenLibros.negocio.LibroBean;
import mavenLibros.util.ConnectionEntityManager;

public class CreateLibro {

	public void create(LibroBean libro) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(libro);
		entityManager.getTransaction().commit();
	}
}
