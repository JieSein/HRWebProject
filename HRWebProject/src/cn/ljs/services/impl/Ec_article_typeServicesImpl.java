package cn.ljs.services.impl;

import cn.ljs.dao.Ec_article_typeDao;
import cn.ljs.dao.impl.Ec_article_typeDaoImpl;
import cn.ljs.javabean.Ec_article_type;
import cn.ljs.services.Ec_article_typeServices;

public class Ec_article_typeServicesImpl implements Ec_article_typeServices {
	
	private Ec_article_typeDao typeDao = new Ec_article_typeDaoImpl();

	@Override
	public String findByTypeCode(String typeCode) {
		if(typeCode != null) {
			return typeDao.findByTypeCode(typeCode).getName();
		}
		return "Ê×Ò³";
	}

}
