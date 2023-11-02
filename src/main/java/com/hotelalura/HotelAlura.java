package com.hotelalura;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import persistencia.ConnectionFactory;
import views.MenuPrincipal;
/**
 *
 * @author Elián
 */
public class HotelAlura {

    public static void main(String[] args) {
        MenuPrincipal run  = new MenuPrincipal();
        run.setLocationRelativeTo(null);
        run.setVisible(true);
        // Inicializar el DataSource y el EntityManager
        DataSource dataSource = ConnectionFactory.configureDataSource();
        EntityManager em = ConnectionFactory.createEntityManager("hotel_alura");
        
    }
}
