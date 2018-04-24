/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucianeaguiar;

import com.lucianeaguiar.dao.EmpresaDAO;
import com.lucianeaguiar.model.Empresa;

/**
 *
 * @author jvagu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa e = new Empresa("teste", "teste", "teste", "teste", "teste", 0, 0, 0);
        EmpresaDAO ed = new EmpresaDAO();
        ed.add(e);
    }
    
}
