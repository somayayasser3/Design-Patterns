package Users;

import Gateways.AdaptorClass;
import Gateways.AdaptorInterface;

public class TA extends Observer implements User{
	String name;
	String department;
	String email;
	String phoneNumber;

	public TA() {}

	public String getEmail() {
		return email;
	}

	public void notifyTA(String message) {
		// do some stuff
		
	}

	@Override
	public void makeUser(UserData data) {
		this.name = data.getName();
		this.department = data.getDepartment();
		this.email =data.getEmail();
		this.phoneNumber = data.getPhoneNumber();

	}

	@Override
	public void update(Object user, String notify) {
		AdaptorClass Ac=new AdaptorClass();
		AdaptorInterface Ai=Ac;
		TA ta= (TA) user;
		ta.notifyTA(notify);
		Ai.receiveMessage(notify, ta.getEmail());
	}
}
