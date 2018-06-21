/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.jee010.azar.persistence;

import javax.ejb.ApplicationException;

/**
 *
 * @author Nacho
 */
@ApplicationException(rollback = true)
public class ControladorException extends Exception {

    
    public ControladorException(String msg) {
        super(msg);
    }

}
