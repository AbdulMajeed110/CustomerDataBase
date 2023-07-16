package com.CustomerDataBase.Entity;


public class CustomerEntity {


	private long Cust_Id;
	private String Cust_Name;
	private String Cust_AC_Title;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public long getCust_Id() {
		return Cust_Id;
	}

	public void setCust_Id(long cust_Id) {
		Cust_Id = cust_Id;
	}

	public String getCust_Name() {
		return Cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}

	public String getCust_AC_Title() {
		return Cust_AC_Title;
	}

	public void setCust_AC_Title(String cust_AC_Title) {
		Cust_AC_Title = cust_AC_Title;
	}

	@Override
	public String toString() {
		return "CustomerEntity [Cust_Id=" + Cust_Id + ", Cust_Name=" + Cust_Name + ", Cust_AC_Title=" + Cust_AC_Title
				+ "]";
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
