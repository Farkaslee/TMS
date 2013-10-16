/**
 * @version $Id$
 * Create date: Oct 16, 2013
 * Create by: enixjin
 */
package com.tms.workflow.form;

import com.tms.workflow.RoleRelated;

/**
 * Class description goes here
 * @author enixjin
 *
 */
public interface Form extends RoleRelated{
    
    public <S extends Section> S[] getSections();

}
