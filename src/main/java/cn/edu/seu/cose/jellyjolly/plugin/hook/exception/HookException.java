/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.cose.jellyjolly.plugin.hook.exception;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class HookException extends Exception {

    public HookException() {
        super();
    }

    public HookException(Throwable cause) {
        super(cause);
    }

    public HookException(String msg) {
        super(msg);
    }

    public HookException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
