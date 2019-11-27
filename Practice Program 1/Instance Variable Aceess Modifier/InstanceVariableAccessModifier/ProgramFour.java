package InstanceVariableAccessModifier;

public class ProgramFour {
	private String fName;
	private String lName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
    void getName()
	{
		ProgramFour test = new ProgramFour();
		test.setfName("GANESH");
		test.setlName("SALUNKHE");
		System.out.println(test.getfName() +" "+test.getlName());
	}

}

