package website;

public class Website {

	protected boolean authenticated;
	
	public Website() {
		this.authenticated = false;
	}
	
	public final void authenticate(String password) {
		if (password.equals("password")) {
			this.authenticated = true;
			System.out.println("Success: You have been authenticated");
		} else {
			this.authenticated = false;
			System.out.println("Error: Try again");			
		}
	}
	
	
}
