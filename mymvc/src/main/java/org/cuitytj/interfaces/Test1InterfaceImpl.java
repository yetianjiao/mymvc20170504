package org.cuitytj.interfaces;

import java.util.Date;

import org.cuitytj.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 
* @author 作者 yetianjiao 
* @version 2017年4月25日 下午2:22:22 
* 类说明 
*/
@Service
public class Test1InterfaceImpl implements Test1Interface {
	
	@Autowired(required=false)
	private UserMapper userMapper;
	
	@Override
	public Date getCurrentTime() {
		System.out.println(userMapper.selectByPrimaryKey(1).getUsername());
		return new Date();
	}
}
