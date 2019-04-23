/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelwa
 */
public class IdDigitsException extends Exception {
    String id;
    
    public IdDigitsException(String id)
    {
        super();
        this.id = id;
    }
    
    public String toString()
    {
        return id + " is more than 4 digits exception";
    }
    
    
}
