package org.cuitytj.interfaces;

import java.util.Date;

import org.springframework.stereotype.Service;

/** 
* @author 作者 yetianjiao 
* @version 2017年4月25日 下午2:22:22 
* 类说明 
*/
@Service
public class Test1InterfaceImpl implements Test1Interface {

	@Override
	public Date getCurrentTime() {
		
		return new Date();
	}

}
