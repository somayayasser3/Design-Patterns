package Users;

import Gateways.AdaptorClass;
import Gateways.AdaptorInterface;

public class Student extends Observer implements User{
	String name;
	int Id;
	String email;
	String phoneNumber;

	public Student() {}


	public String getEmail() {
		return email;
	}

	
	public void notifyStudent(String message) {
		// do some stuff
	}

	@Override
	public void makeUser(UserData data) {
		this.name = data.getName();
		Id = data.getId();
		this.email = data.getEmail();
		this.phoneNumber = data.getPhoneNumber();

	}

	@Override
	public void update(Object user, String notify) {
		AdaptorClass Ac=new AdaptorClass();
		AdaptorInterface Ai=Ac;
		Student stud= (Student) user;
		stud.notifyStudent(notify);
		Ai.receiveMessage(notify, stud.getEmail());

	}
}
