
package persistencia;

import javax.persistence.EntityManager;
/**
 *
 * @author Elián
 * @param <T>
 */
public abstract class DAO<T> {

    protected EntityManager em;

    public DAO() {
        this.em = ConnectionFactory.createEntityManager("hotel_alura");
    }
    
    public DAO(EntityManager em){
        this.em = em;
    }

    protected void persistirEntidad(T object) {
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    protected void actualizarEntidad(T object) {
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    protected void borrarEntidad(T object) {
        try {
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }
    
    }
