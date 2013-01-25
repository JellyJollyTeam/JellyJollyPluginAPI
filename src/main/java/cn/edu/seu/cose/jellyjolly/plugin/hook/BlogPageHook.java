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

import cn.edu.seu.cose.jellyjolly.plugin.event.BlogPageEvent;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.AbortException;
import cn.edu.seu.cose.jellyjolly.plugin.hook.exception.HookException;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface BlogPageHook {

    public void blogPageAdded(BlogPageEvent e)
            throws HookException;

    public void blogPageEdited(BlogPageEvent e)
            throws AbortException, HookException;

    public void blogPageRemoved(BlogPageEvent e)
            throws AbortException, HookException;

    public void blogPageViewed(BlogPageEvent e)
            throws HookException;
}
