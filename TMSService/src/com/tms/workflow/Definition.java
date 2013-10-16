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
public interface Definition<T extends Instance> {

    public T createInstance();

}
