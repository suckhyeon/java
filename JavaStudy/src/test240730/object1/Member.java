package test240730.object1;

public class Member {
	private String password;
	private String name;
	
	public Member() {
		super();
	}

	public Member(String name, String password) {
		super();
		this.password = password;
		this.name = name;
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

	@Override
	public String toString() {
		return "Member [password=" + password + ", name=" + name + "]";
	}

//	@Override
//	public int hashCode() {
//		String str = this.name + this.password;
//		return str.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member mb = (Member)obj;
//			if(this.name.equals(mb.getName()) &&
//					this.password.equals(mb.getPassword())) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//		return false;
//	}
	
	
}
