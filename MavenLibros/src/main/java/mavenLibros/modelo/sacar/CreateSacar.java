package mavenLibros.modelo.sacar;

import javax.persistence.EntityManager;

import mavenLibros.negocio.SacarBean;
import mavenLibros.util.ConnectionEntityManager;

public class CreateSacar {

	public void create(SacarBean sacar) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(sacar);
		entityManager.getTransaction().commit();
	}
}
