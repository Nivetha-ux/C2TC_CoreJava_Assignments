package day2.entiyl;

public class Customer {
	private int cid;
	private String cname;
	private String city;
	
	public void getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + ", getCid()=" + getCid()
				+ ", getCname()=" + getCname() + ", getCity()=" + getCity() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
