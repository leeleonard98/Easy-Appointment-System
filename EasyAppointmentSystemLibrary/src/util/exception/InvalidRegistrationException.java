/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author meleenoob
 */
public class InvalidRegistrationException extends Exception {

    public InvalidRegistrationException() {
    }

    public InvalidRegistrationException(String msg) {
        super(msg);
    }

}
