/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.persistenceLayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 
 */
public class PersistenceLayer {
    
    private static final EntityManagerFactory emFactoryObj;
    private static final String PERSITENCE_UNIT_NAME = "it.spring_examplespringExample_jar_0.0.1-SNAPSHOTPU";
    
    static {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSITENCE_UNIT_NAME);
    }
    
    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }
}
