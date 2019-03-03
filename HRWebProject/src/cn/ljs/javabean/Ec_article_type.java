package cn.ljs.javabean;

public class Ec_article_type {
	
	private String code;
	private String name;
	private String remark;
	
	public Ec_article_type() {
		// TODO Auto-generated constructor stub
	}

	public Ec_article_type(String code, String name, String remark) {
		super();
		this.code = code;
		this.name = name;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Ec_article_type [code=" + code + ", name=" + name + ", remark=" + remark + "]";
	}
	

}
