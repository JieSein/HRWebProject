package cn.ljs.dao;

import java.util.List;

import cn.ljs.javabean.Ec_article;

public interface Ec_articleDao {
	
	public List<Ec_article> findByArticle(String keyWord, String typeCode);
	
	//根据id查找商品
	public Ec_article findById(String id);
	
	
}
