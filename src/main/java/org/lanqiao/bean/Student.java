package org.lanqiao.bean;

public class Student {
	private int id;
	private String name;
	private String pwd;
	private String sex;
	private int tel;
	private String address;
	private String img;
	private int classid;

	private Classes cinfo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Classes getCinfo() {
		return cinfo;
	}
	public void setCinfo(Classes cinfo) {
		this.cinfo = cinfo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String pwd, String sex, int tel, String address,String img, int classid,Classes cinfo) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.tel = tel;
		this.address = address;
		this.img=img;
		this.classid = classid;
		this.cinfo=cinfo;
	}
	public Student(int id, String name, String pwd, String sex, int tel, String address,String img, int classid) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.tel = tel;
		this.address = address;
		this.img=img;
		this.classid = classid;
	
	}
	
	public Student( String name, String pwd, String sex, int tel, String address,String img, int classid) {
		super();
		
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.tel = tel;
		this.address = address;
		this.img=img;
		this.classid = classid;
	
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pwd=" + pwd + ", sex=" + sex + ", tel=" + tel + ", address="
				+ address + ", img=" + img + ", classid=" + classid + ", cinfo=" + cinfo + "]";
	}
	
	
	
	
	
}
