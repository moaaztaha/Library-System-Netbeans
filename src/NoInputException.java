/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class NoInputException extends Exception {
     String srch;
     String noDate;

    public NoInputException() {
       srch = "Please write what you are searching for.";
       noDate = "Please write the start of the borrow date.";
    }
    
}
