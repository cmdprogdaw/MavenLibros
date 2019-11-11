package mavenLibros.modelo.ejemplar;

import javax.persistence.EntityManager;

import mavenLibros.negocio.EjemplarBean;
import mavenLibros.util.ConnectionEntityManager;

public class CreateEjemplar {

	public void create(EjemplarBean ejemplar) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(ejemplar);
		entityManager.getTransaction().commit();
	}
}
