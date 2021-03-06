/*
 * Copyright (C) 2012 College of Software Engineering, Southeast University
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.edu.seu.cose.jellyjolly.plugin.hook;

import cn.edu.seu.cose.jellyjolly.plugin.event.BlogPostEvent;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.AbortException;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.HookException;

/**
 *
 * @author rAy
 */
public interface BlogPostHook {

    public void blogPostAdded(BlogPostEvent e)
            throws HookException;

    public void blogPostEdited(BlogPostEvent e)
            throws AbortException, HookException;

    public void blogPostRemoved(BlogPostEvent e)
            throws AbortException, HookException;

    public void blogPostViewed(BlogPostEvent e)
            throws HookException;
}
