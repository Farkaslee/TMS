/**
 * @version $Id$
 * Create date: Oct 16, 2013
 * Create by: enixjin
 */
package com.tms.workflow;

/**
 * Class description goes here
 * 
 * @author enixjin
 * 
 */
public interface Template<T extends Definition<?>> {

    public T toDefinition();

}
