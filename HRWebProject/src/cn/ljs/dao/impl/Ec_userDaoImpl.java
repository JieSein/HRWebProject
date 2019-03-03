package cn.ljs.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ljs.utils.JDBCUtil;

import cn.ljs.dao.Ec_userDao;
import cn.ljs.javabean.Ec_user;

public class Ec_userDaoImpl implements Ec_userDao {

	/**
	 * 完成用户注册的功能
	 */
	@Override
	public int reg_user(Ec_user user) {
		String sql = "insert into ec_user(login_name,password,name,sex,email,phone,address,role,create_date,disabled)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		String[] info = {user.getLogin_name(),user.getPassword(),user.getName(),user.getSex()+"",user.getEmail(),
				user.getPhone(),user.getAddress(),user.getRole()+"",user.getCreate_date(),user.getDisabled()};
		
		int rs = JDBCUtil.executeUpdate(sql, info);
		return rs;
	}

	/**
	 * 完成用户登录的功能
	 */
	@Override
	public Ec_user findByUserName(Ec_user user) {
		String sql = "select * from ec_user where LOGIN_NAME = ?";
		String[] info = {user.getLogin_name()};
		
		ResultSet rs = JDBCUtil.executeQuery(sql, info);
		Ec_user ec_user = new Ec_user();
		try {
			if(rs!=null) {
				if (rs.next()) {
					String loginName = rs.getString("login_name");
					String loginPwd = rs.getString("password");
					
					ec_user.setLogin_name(loginName);
					ec_user.setPassword(loginPwd);
					
					return ec_user;
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
