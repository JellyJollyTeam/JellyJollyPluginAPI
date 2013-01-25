/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.cose.jellyjolly.plugin.hook.exception;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class AbortException extends Exception {

    public AbortException() {
        super("An abort occurred.");
    }
}
