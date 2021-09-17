package phoneBook;

public class Addresses {
	
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Addresses(String entry) {
		String[] main = entry.split(",");
		if(main[1].startsWith(" ")) {
			main[1] = main[1].substring(1);
		}
		if(main[2].startsWith(" ")) {
			main[2] = main[2].substring(1);
		}
		if(main[3].startsWith(" ")) {
			main[3] = main[3].substring(1);
		}
		if(main[4].startsWith(" ")) {
			main[4] = main[4].substring(1);
		}
		
		this.street = main[1];
		this.city = main[2];
		this.state = main[3];
		this.zipCode = main[4];
		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
}
