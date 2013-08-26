package com.ideal.common.service.interf;

import java.io.Serializable;

/**
 * @ClassName: RMIObject
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 下午4:17:06
 *
 */
public class RMIObject implements Serializable{

	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/

	private static final long serialVersionUID = 1L;
	private String name;

	/**
	* @return name
	*/


	public String getName() {
		return name;
	}

	/**
	* @param name 要设置的 name
	*/

	public void setName(String name) {
		this.name = name;
	}

}
