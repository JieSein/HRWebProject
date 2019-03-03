package com.ljs.utils;

import java.util.List;

import cn.ljs.dao.ShopCarOfUserDao;
import cn.ljs.dao.impl.ShopCarOfUserDaoImpl;
import cn.ljs.javabean.ShopCarOfUser;

public class Text {
	public static void main(String[] args) {
		ShopCarOfUserDao userDao = new ShopCarOfUserDaoImpl();
		
		List<ShopCarOfUser> list = userDao.findByLoginName("admin");
		
		for(ShopCarOfUser temp:list) {
			System.out.println(temp);
		}
		
	}
	
}
