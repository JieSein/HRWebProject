package cn.ljs.javabean;

public class Ec_user {
	
	private int id;
	private String login_name;
	private String password;
	private String name;
	private int sex;
	private String email;
	private String phone;
	private String address;
	private int role;
	private String create_date;
	private String disabled;
	private String active;
	
	public Ec_user() {
		// TODO Auto-generated constructor stub
	}

	public Ec_user(int id, String login_name, String password, String name, int sex, String email, String phone,
			String address, int role, String create_date, String disabled, String active) {
		super();
		this.id = id;
		this.login_name = login_name;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.create_date = create_date;
		this.disabled = disabled;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Ec_user [id=" + id + ", login_name=" + login_name + ", password=" + password + ", name=" + name
				+ ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", address=" + address + ", role=" + role
				+ ", create_date=" + create_date + ", disabled=" + disabled + ", active=" + active + "]";
	}
	

}
