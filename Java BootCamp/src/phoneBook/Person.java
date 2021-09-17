package phoneBook;

public class Person{

	private String fName;
	private String mName;
	private String lName;
	private String fullName;
	private String pNumber;	
	
	
	public Person(String entry) {
		String[] main = entry.split(",");
		String[] fullName = main[0].split(" ");
		String tempmName = "";
		
		if (fullName.length < 3) {
			this.fName = fullName[0];
			this.lName = fullName[1];
			this.mName = "";
		}
		else if (fullName.length > 2) {
			this.fName = fullName[0];
			this.lName = fullName[fullName.length - 1];
			for(int i = 1; i < fullName.length - 1; i++) {
				tempmName += fullName[i] + " ";
			}
			this.mName = tempmName;
		}
		
		String tempNum = main[main.length - 1].trim();
		String numFormat = String.valueOf(tempNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
		
		this.pNumber = numFormat;
		this.fullName = this.fName + " " + this.mName + this.lName;
	}

	public String getfName() {
		return fName;
	}

	public String getmName() {
		return mName;
	}

	public String getlName() {
		return lName;
	}

	public String getpNumber() {
		return pNumber;
	}

	public String getFullName() {
		return fullName;
	}

	
	
}
