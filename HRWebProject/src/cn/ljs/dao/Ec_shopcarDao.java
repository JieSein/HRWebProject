package cn.ljs.dao;

import cn.ljs.javabean.Ec_shopcar;

public interface Ec_shopcarDao {

	public int insertShopCarRecord(Ec_shopcar shopcar);
	
	public Ec_shopcar findById(String id, String login_name);
	
	public Ec_shopcar findByIdAndLoginName(String id, String login_name);
	
	public int updateShopCarRecord(String buyNum, String id, String login_name);
	
	public int updateShopCarRecord2(String buyNum, String id, String login_name);
	
	public int deleteShopCarRecord(String id, String login_name);
	
}
