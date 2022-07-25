package Users;

import Gateways.AdaptorClass;
import Gateways.AdaptorInterface;

import java.sql.Date;


public class Professor extends Observer implements User{
	String name;
	String department;
	Date hirringDate;
	String PhDTopic;
	String email;
	String phoneNumber;
	

	public Professor() {}

	public String getEmail() {
		return email;
	}

	public void notifyProfessor(String message) {
		// do some stuff
	}


	@Override
	public void makeUser(UserData data) {

		this.name = data.getName();
		this.department = data.getDepartment();
		this.hirringDate = data.getHirringDate();
		PhDTopic = data.getPhDTopic();
		this.email = data.getEmail();
		this.phoneNumber = data.getPhoneNumber();

	}

	@Override
	public void update(Object user, String notify) {
		AdaptorClass Ac=new AdaptorClass();
		AdaptorInterface Ai=Ac;
		Professor prof= (Professor) user;
		prof.notifyProfessor(notify);
		Ai.receiveMessage(notify, prof.getEmail());

	}
}
