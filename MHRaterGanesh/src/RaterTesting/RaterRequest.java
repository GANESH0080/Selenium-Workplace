package RaterTesting;


public class RaterRequest {
	public RaterRequest() {
		SignIn = new RaterSignIn();
		RaterParameter = new RaterParameters();
	}

	public RaterParameters RaterParameter;
	public RaterSignIn SignIn;

}
