package cn.ljs.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ljs.utils.JDBCUtil;

import cn.ljs.dao.Ec_articleDao;
import cn.ljs.javabean.Ec_article;

public class Ec_articleDaoImpl implements Ec_articleDao {

	@Override
	public List<Ec_article> findByArticle(String keyWord, String typeCode) {
		String sql = null;
		ResultSet rs = null;
		
		if (keyWord != null) {
			sql = "select * from ec_article where title like ?";
			String[] info = {"%"+keyWord+"%"};
			rs = JDBCUtil.executeQuery(sql, info);
		} else {
			if (typeCode != null) {
				sql = "select * from ec_article where type_code like ?";
				String[] info = {typeCode+"%"};
				rs = JDBCUtil.executeQuery(sql, info);
			} else {
				sql = "select * from ec_article";
				rs = JDBCUtil.executeQuery(sql, null);
			}
		}
		
		List<Ec_article> list = new ArrayList<Ec_article>();
		if (rs != null) {
			try {
				while(rs.next()) {
					Ec_article article = new Ec_article();
					
					article.setId(rs.getInt("id"));
					article.setType_code(rs.getString("type_code"));
					article.setTitle(rs.getString("title"));
					article.setSupplier(rs.getString("supplier"));
					article.setPrice(rs.getDouble("price"));
					article.setDiscount(rs.getDouble("discount"));
					article.setLocality(rs.getString("locality"));
					article.setPutaway_date(rs.getString("putaway_date"));
					article.setStorage(rs.getInt("storage"));
					article.setImage(rs.getString("image"));
					article.setDescription(rs.getString("description"));
					article.setCreate_date(rs.getString("create_date"));
					article.setDisabled(rs.getString("disabled"));
													
					list.add(article);
				}
				return list;
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}

	@Override
	public Ec_article findById(String id) {
		String sql = null;
		ResultSet rs = null;
		
		sql = "select * from ec_article where id = ?";
		String[] info = {id};
		rs = JDBCUtil.executeQuery(sql, info);
		
		if (rs != null) {
			try {
				Ec_article article = new Ec_article();
				while(rs.next()) {	
					article.setId(rs.getInt("id"));
					article.setType_code(rs.getString("type_code"));
					article.setTitle(rs.getString("title"));
					article.setSupplier(rs.getString("supplier"));
					article.setPrice(rs.getDouble("price"));
					article.setDiscount(rs.getDouble("discount"));
					article.setLocality(rs.getString("locality"));
					article.setPutaway_date(rs.getString("putaway_date"));
					article.setStorage(rs.getInt("storage"));
					article.setImage(rs.getString("image"));
					article.setDescription(rs.getString("description"));
					article.setCreate_date(rs.getString("create_date"));
					article.setDisabled(rs.getString("disabled"));
													
				}
				return article;
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}

}
