package Address;

public class Address {
	String country,province,city,street,postalCode;
	public Address() {
		this.country="China";
		this.province="hubei";
		this.city="wuhan";
		this.street="sun";
		this.postalCode="123456";
	}
	public Address(String country,String province,String city,String street,String postalCode) {
		this.country=country;
		this.province=province;
		this.city=city;
		this.street=street;
		this.postalCode=postalCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", province=" + province + ", city=" + city + ", street=" + street
				+ ", postalCode=" + postalCode + "]";
	}
	

}
