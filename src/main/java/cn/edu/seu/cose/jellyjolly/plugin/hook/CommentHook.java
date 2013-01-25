/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.cose.jellyjolly.plugin.hook;

import cn.edu.seu.cose.jellyjolly.plugin.event.CommentEvent;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.AbortException;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.HookException;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface CommentHook {

    public void commentAdded(CommentEvent e)
            throws AbortException, HookException;

    public void commentRemoved(CommentEvent e)
            throws AbortException, HookException;
}
