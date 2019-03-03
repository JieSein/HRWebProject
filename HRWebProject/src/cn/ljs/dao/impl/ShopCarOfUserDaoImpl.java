package cn.ljs.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ljs.utils.JDBCUtil;

import cn.ljs.dao.ShopCarOfUserDao;
import cn.ljs.javabean.ShopCarOfUser;

public class ShopCarOfUserDaoImpl implements ShopCarOfUserDao {

	@Override
	public List<ShopCarOfUser> findByLoginName(String login_name) {
		
		String sql = "select * from ec_shopcar join ec_article on ec_article.id = ec_shopcar.articleId where login_name=?";
		String[] info = {login_name};
		
		ResultSet rs = JDBCUtil.executeQuery(sql, info);
		
		if (rs != null) {
			List<ShopCarOfUser> list = new ArrayList<ShopCarOfUser>();
			try {
				while(rs.next()) {
					ShopCarOfUser shopCarOfUser = new ShopCarOfUser();
					shopCarOfUser.setId(rs.getInt("id"));
					shopCarOfUser.setType_code(rs.getString("type_code"));
					shopCarOfUser.setTitle(rs.getString("title"));
					shopCarOfUser.setSupplier(rs.getString("supplier"));
					shopCarOfUser.setPrice(rs.getDouble("price"));
					shopCarOfUser.setDiscount(rs.getDouble("discount"));
					shopCarOfUser.setLocality(rs.getString("locality"));
					shopCarOfUser.setPutaway_date(rs.getString("putaway_date"));
					shopCarOfUser.setStorage(rs.getInt("storage"));
					shopCarOfUser.setImage(rs.getString("image"));
					shopCarOfUser.setDescription(rs.getString("description"));
					shopCarOfUser.setCreate_date(rs.getString("create_date"));
					shopCarOfUser.setDisabled(rs.getString("disabled"));
					shopCarOfUser.setArticleId(rs.getInt("articleId"));
					shopCarOfUser.setBuyNum(rs.getInt("buyNum"));
					shopCarOfUser.setLogin_name(rs.getString("login_name"));
					
					list.add(shopCarOfUser);
					
				}
				
				return list;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public ShopCarOfUser findByIdAndLoginName(String id, String login_name) {
		String sql = "select * from ec_shopcar join ec_article on ec_article.id = ec_shopcar.articleId where articleId=?and login_name=?";
		String[] info = {id, login_name};
		
		ResultSet rs = JDBCUtil.executeQuery(sql, info);
		ShopCarOfUser shopCarOfUser = new ShopCarOfUser();

		if(rs != null) {
			try {
				while(rs.next()) {
					shopCarOfUser.setId(rs.getInt("id"));
					shopCarOfUser.setType_code(rs.getString("type_code"));
					shopCarOfUser.setTitle(rs.getString("title"));
					shopCarOfUser.setSupplier(rs.getString("supplier"));
					shopCarOfUser.setPrice(rs.getDouble("price"));
					shopCarOfUser.setDiscount(rs.getDouble("discount"));
					shopCarOfUser.setLocality(rs.getString("locality"));
					shopCarOfUser.setPutaway_date(rs.getString("putaway_date"));
					shopCarOfUser.setStorage(rs.getInt("storage"));
					shopCarOfUser.setImage(rs.getString("image"));
					shopCarOfUser.setDescription(rs.getString("description"));
					shopCarOfUser.setCreate_date(rs.getString("create_date"));
					shopCarOfUser.setDisabled(rs.getString("disabled"));
					shopCarOfUser.setArticleId(rs.getInt("articleId"));
					shopCarOfUser.setBuyNum(rs.getInt("buyNum"));
					shopCarOfUser.setLogin_name(rs.getString("login_name"));
					
					return shopCarOfUser;

				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
