/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.cose.jellyjolly.plugin.hook;

import cn.edu.seu.cose.jellyjolly.plugin.event.BlogPageEvent;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.AbortException;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.HookException;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface BlogPageHook {

    public void blogPageAdded(BlogPageEvent e)
            throws AbortException, HookException;

    public void blogPageEdited(BlogPageEvent e)
            throws AbortException, HookException;

    public void blogPageRemoved(BlogPageEvent e)
            throws AbortException, HookException;

    public void blogPageViewed(BlogPageEvent e)
            throws AbortException, HookException;
}
