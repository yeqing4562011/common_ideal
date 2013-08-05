package com.ideal.common.service.interf;

import com.ideal.utility.service.ServiceInterface;

/**
 * @ClassName: IFirstIdealCommonInterface
 * @Description: TODO
 * @author yq
 * @date 2013年8月4日 下午9:23:25
 * 
 */

public interface IFirstIdealCommonService extends ServiceInterface{
	
	/**
	 * This is first hessian object method to Web project.
	* @Title: firstHessianServicesRMI 
	* @Description: TODO
	* @return
	* @throws Exception
	* @return String
	* @throws
	 */
	public String firstHessianServicesRMI() throws Exception;
	
	
	/**
	* @Title: rmiObject 
	* @Description: TODO
	* @param rmiObject
	* @return
	* @throws Exception
	* @return RMIObject
	* @throws
	 */
	public RMIObject rmiObject(RMIObject rmiObject) throws Exception;

}
