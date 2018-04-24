package com.lucianeaguiar.connectionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
/**
 * 
 * 
 *
 * @author João Vitor Aguiar da Silva
 */
public class Connection {

    private SessionFactory sessionFactory;
    
    public SessionFactory getConnection(){
        Configuration con = new Configuration().configure();
        StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        return con.buildSessionFactory(build.build());
    }
    
}
