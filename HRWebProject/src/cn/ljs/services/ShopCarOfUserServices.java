package cn.ljs.services;

import java.util.List;

import cn.ljs.javabean.ShopCarOfUser;

public interface ShopCarOfUserServices {
	
	public List<ShopCarOfUser> findByLoginName(String login_name);
	
	public ShopCarOfUser findByIdAndLoginName(String id, String login_name);

}
