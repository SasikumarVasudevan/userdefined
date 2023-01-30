package Task2;

public class Students {
	private String stdname;
	private char initial;
	private char gen;
	private int stdid;
	private long phone;
	private String address;
	private String dob;
	private String doj;
	private String email;

	public String getStdname() {
		return stdname;
	}
	
	public char getInitial() {
		return initial;
	}
	
	public char getGen() {
		return gen;
	}
	
	public int getStdid() {
		return stdid;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDob() {
		return dob;
	}
	
	public String getDoj() {
		return doj;
	}
	
	public String getEmail() {
		return email;
	}

	public Students(String stdname, char initial, char gen, int stdid, long phone, String address, String dob,
			String doj, String email) {
		super();
		this.stdname = stdname;
		this.initial = initial;
		this.gen = gen;
		this.stdid = stdid;
		this.phone = phone;
		this.address = address;
		this.dob = dob;
		this.doj = doj;
		this.email = email;
	}
	
	
	
	

}
