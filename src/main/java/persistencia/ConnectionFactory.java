package persistencia;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

/**
 *
 * @author Elián
 */
public class ConnectionFactory {

    
    //Creamos el pool de conexiones
    public static DataSource configureDataSource() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        try {
            pool.setDriverClass("com.mysql.cj.jdbc.Driver"); //loads the jdbc driver 
            pool.setJdbcUrl("jdbc:mysql://localhost:3306/hotel_alura?serverTimezone=UTC");
            pool.setUser("root");
            pool.setPassword("root");
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pool;
    }
    
    //Creamos el EntityManager
    public static EntityManager createEntityManager(String persistenceUnitName) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        return emf.createEntityManager();
    }
    
}
