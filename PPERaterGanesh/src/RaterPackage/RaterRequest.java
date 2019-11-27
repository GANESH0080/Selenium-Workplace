package RaterPackage;

public class RaterRequest {

	public RaterRequest() {
		SignIn = new RaterSignIn();
		RaterParameter = new RaterParameter();
	}

	public RaterParameter RaterParameter;
	public RaterSignIn SignIn;

}
