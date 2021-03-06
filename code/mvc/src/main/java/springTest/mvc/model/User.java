/**
 * Project Name:mvc
 * File Name:User.java
 * Package Name:springTest.mvc.model
 * Date:2015年8月25日下午12:05:07
 * Copyright (c) 2015, sid Jenkins All Rights Reserved.
 * 
 *
*/

package springTest.mvc.model;

import java.io.Serializable;

/**
 * ClassName:User
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2015年8月25日 下午12:05:07 
 * @author   sid
 * @see 	 
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
