package com.lucianeaguiar.dao;

import com.lucianeaguiar.connectionFactory.Connection;
import com.lucianeaguiar.model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jvagu
 */
public class ClienteDAO {

    private Transaction tx;
    private Session session;

    public ClienteDAO() {
        session = new Connection().getConnection().openSession();
        tx = new Connection().getConnection().openSession().beginTransaction();
    }

    public boolean add(Cliente c) {

        try {
            session.save(c);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean update(Cliente c) {

        try {
            session.update(c);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean delete(Cliente c) {

        try {
            session.delete(c);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }finally{
            session.close();
        }
    }
}
