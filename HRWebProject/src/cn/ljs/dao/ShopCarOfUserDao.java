package cn.ljs.dao;

import java.util.List;

import cn.ljs.javabean.ShopCarOfUser;

public interface ShopCarOfUserDao {
	
	public List<ShopCarOfUser> findByLoginName(String login_name);
	
	public ShopCarOfUser findByIdAndLoginName(String id, String login_name);

}
