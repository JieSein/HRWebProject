package cn.ljs.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ljs.utils.JDBCUtil;

import cn.ljs.dao.Ec_shopcarDao;
import cn.ljs.javabean.Ec_shopcar;

public class Ec_shopcarDaoImpl implements Ec_shopcarDao {

	@Override
	public int insertShopCarRecord(Ec_shopcar shopcar) {
		String sql = "insert into ec_shopcar(articleId, buyNum, login_name) values(?,?,?)";
		String[] info = {shopcar.getArticleId()+"", shopcar.getBuyNum()+"", shopcar.getLogin_name()};
		
		int rs = JDBCUtil.executeUpdate(sql, info);
		return rs;
	}

	@Override
	public Ec_shopcar findById(String id, String login_name ) {
		String sql = "select * from ec_shopcar where articleId =?  and login_name=?";
		String[] info = {id,login_name};
		
		ResultSet rs = JDBCUtil.executeQuery2(sql, info);
		
		if (rs != null) {
			Ec_shopcar shopcar = new Ec_shopcar();
			try {
				while(rs.next()) {
					shopcar.setArticleId(rs.getInt("articleId"));
					shopcar.setBuyNum(rs.getInt("buyNum"));
					shopcar.setLogin_name(rs.getString("login_name"));
					
				}
				System.out.println(shopcar.getBuyNum());
				return shopcar;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return null;
	}

	@Override
	public Ec_shopcar findByIdAndLoginName(String id, String login_name) {
		String sql = "select * from ec_shopcar where articleId =?  and login_name=?";
		String[] info = {id,login_name};
		
		ResultSet rs = JDBCUtil.executeQuery(sql, info);
		
		if (rs != null) {
			Ec_shopcar shopcar = new Ec_shopcar();
			try {
				while(rs.next()) {
					shopcar.setArticleId(rs.getInt("articleId"));
					shopcar.setBuyNum(rs.getInt("buyNum"));
					shopcar.setLogin_name(rs.getString("login_name"));
					
				}
				System.out.println(shopcar.getBuyNum());
				return shopcar;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return null;
	}
	
	@Override
	public int updateShopCarRecord(String buyNum, String id, String login_name) {
		
		String sql = "update ec_shopcar set buyNum=buyNum+? where articleId=? and login_name=?";
		String[] info = {buyNum, id, login_name};
		
		int rs = JDBCUtil.executeUpdate(sql, info);
		
		return rs;
	}

	@Override
	public int updateShopCarRecord2(String buyNum, String id, String login_name) {
		String sql = "update ec_shopcar set buyNum=? where articleId=? and login_name=?";
		String[] info = {buyNum, id, login_name};
		
		int rs = JDBCUtil.executeUpdate(sql, info);
		
		return rs;
	}

	@Override
	public int deleteShopCarRecord(String id, String login_name) {
		String sql = "delete from ec_shopcar where articleId=? and login_name=?";
		String[] info = {id, login_name};
		
		int rs = JDBCUtil.executeUpdate(sql, info);
				
		return rs;
	}

}
