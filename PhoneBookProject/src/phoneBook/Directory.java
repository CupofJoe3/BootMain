package phoneBook;

public class Directory {

	public Addresses ad;
	public Person per;
	
	public Directory(String entry) {
		this.ad = new Addresses(entry);
		this.per = new Person(entry);
	}

	public Addresses getAd() {
		return ad;
	}

	public Person getPer() {
		return per;
	}
}
