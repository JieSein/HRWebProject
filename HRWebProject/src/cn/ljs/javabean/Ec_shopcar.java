package cn.ljs.javabean;

public class Ec_shopcar {
	
	private int id;
	private int articleId;
	private int buyNum;
	private String login_name;
	
	public Ec_shopcar() {
		// TODO Auto-generated constructor stub
	}

	public Ec_shopcar(int id, int articleId, int buyNum, String login_name) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.buyNum = buyNum;
		this.login_name = login_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	@Override
	public String toString() {
		return "Ec_shopcar [id=" + id + ", articleId=" + articleId + ", buyNum=" + buyNum + ", login_name=" + login_name
				+ "]";
	}
	
	
	
}
