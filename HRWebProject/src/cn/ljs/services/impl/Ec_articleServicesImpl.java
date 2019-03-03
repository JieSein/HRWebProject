package cn.ljs.services.impl;

import java.util.List;

import cn.ljs.dao.Ec_articleDao;
import cn.ljs.dao.impl.Ec_articleDaoImpl;
import cn.ljs.javabean.Ec_article;
import cn.ljs.services.Ec_articleServices;

public class Ec_articleServicesImpl implements Ec_articleServices {
	
	private Ec_articleDao articleDao = new Ec_articleDaoImpl();

	/**
	 * 查询符合条件的商品
	 */
	@Override
	public List<Ec_article> findByArticle(String keyWord, String typeCode) {
		
		
		return articleDao.findByArticle(keyWord, typeCode);
	}

	@Override
	public Ec_article findById(String id) {
		
		return articleDao.findById(id);
	}

}
