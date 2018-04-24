package com.lucianeaguiar.dao;

import com.lucianeaguiar.connectionFactory.Connection;
import com.lucianeaguiar.model.Empresa;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jvagu
 */
public class EmpresaDAO {

    private Transaction tx;
    private Session session;

    public EmpresaDAO() {
        session = new Connection().getConnection().openSession();
        tx = new Connection().getConnection().openSession().beginTransaction();
    }

    public boolean add(Empresa e) {

        try {
            session.save(e);
            tx.commit();
            return true;
        } catch (Exception ex) {
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean update(Empresa e) {

        try {
            session.update(e);
            tx.commit();
            return true;
        } catch (Exception ex) {
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean delete(Empresa e) {

        try {
            session.delete(e);
            tx.commit();
            return true;
        } catch (Exception ex) {
            return false;
        }finally{
            session.close();
        }
    }
}
