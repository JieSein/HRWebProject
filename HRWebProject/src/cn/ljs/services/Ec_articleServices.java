package cn.ljs.services;

import java.util.List;

import cn.ljs.javabean.Ec_article;

public interface Ec_articleServices {

	//��ѯ������������Ʒ
	public List<Ec_article> findByArticle(String keyWord, String typeCode);
	
	//����id������Ʒ
	public Ec_article findById(String id);
}
