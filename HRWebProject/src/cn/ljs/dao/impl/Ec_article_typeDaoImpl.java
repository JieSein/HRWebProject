package cn.ljs.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ljs.utils.JDBCUtil;

import cn.ljs.dao.Ec_article_typeDao;
import cn.ljs.javabean.Ec_article_type;

public class Ec_article_typeDaoImpl implements Ec_article_typeDao {

	@Override
	public Ec_article_type findByTypeCode(String typeCode) {
		String sql = null;
		ResultSet rs = null;
		
		sql = "select * from ec_article_type where code = ?";
		String[] info = {typeCode};
		rs = JDBCUtil.executeQuery(sql, info);
		
		if (rs != null) {
			try {
				Ec_article_type aType = new Ec_article_type();
				while(rs.next()) {	
					aType.setCode(rs.getString("code"));
					aType.setName(rs.getString("name"));
					aType.setRemark(rs.getString("remark"));
					
				}
				return aType;
				
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
