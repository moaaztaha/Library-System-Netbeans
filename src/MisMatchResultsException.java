/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelwa
 */
public class MisMatchResultsException extends Exception{
    String str;
        public MisMatchResultsException(){
            str = "No Related Results found";
    }
}
