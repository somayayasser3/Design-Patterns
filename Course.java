import java.util.ArrayList;

import Gateways.AdaptorClass;
import Gateways.AdaptorInterface;
import Gateways.EmailGateway;
import Users.Observer;

public class Course implements ManageTask  {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;

	ArrayList<Observer> professorsForEmailNotification;
	ArrayList<Observer> professorsForSMSNotification;

	ArrayList<Observer> TAsForEmailNotification;
	ArrayList<Observer> TAsForSMSNotification;

	ArrayList<Observer> studentsForEmailNotification;
	ArrayList<Observer> studentsForSMSNotification;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;

		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();

		professorsForEmailNotification = new ArrayList<Observer>();
		professorsForSMSNotification = new ArrayList<Observer>();

		TAsForEmailNotification = new ArrayList<Observer>();
		TAsForSMSNotification = new ArrayList<Observer>();

		studentsForEmailNotification = new ArrayList<Observer>();
		studentsForSMSNotification = new ArrayList<Observer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeProfessorForEmailNotification(Observer professor) {
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Observer professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(Observer ta) {
		TAsForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(Observer ta) {
		TAsForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Observer student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Observer student) {
		studentsForSMSNotification.add(student);
	}
	
	
	
	public void AddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam
	public void AddExam(String examName, String examBody) {
		this.exams.add(examName);
		String[] placeholders = new String[] {examName, examBody};
		// do some logic here

		notifyAllUsers(placeholders);
	}
	//PostGrades
	public void AddGrades(String name, String grade) {
		this.grades.add(grade);
		String[] placeholders = new String[]{this.name, grade};
		// do some logic here

		notifyAllUsers(placeholders);
	}
	// PostAnnouncement
	public void AddAnn(String AnnName, String AnnBody) {
		announcements.add(AnnName);
		String[] placeholders = new String[]{AnnName, AnnBody};
		// do some logic here

		notifyAllUsers(placeholders);
	}

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email
		//TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		String notification = placeholders[0]+placeholders[1];
		
		// open connection for Email gateway and do some configurations to the object

		
		for (Observer professor : professorsForEmailNotification) {
			professor.update(professor,notification);
			//emailGateway.sendMessage(notification, professor.getEmail());
			//Ai.receiveMessage(notification, professor.getEmail());
		}
		
		for (Observer ta : TAsForEmailNotification) {
			ta.update(ta,notification);
			//emailGateway.sendMessage(notification, ta.getEmail());
			//Ai.receiveMessage(notification, ta.getEmail());
		}
		
		for (Observer student : studentsForSMSNotification) {
			student.update(student,notification);
			//emailGateway.sendMessage(notification, student.getEmail());
			//Ai.receiveMessage(notification, student.getPhoneNumber());
		}
	}


	@Override
	public void makeTask(String task,String name,String body) {
		if(task.equalsIgnoreCase("exam")){
			AddExam(name,body);
		}
		if(task.equalsIgnoreCase("announcement")){
			AddAnn(name,body);
		}
		if(task.equalsIgnoreCase("grade")){
			AddGrades(name,body);
		}
		if(task.equalsIgnoreCase("assignment")){
			AddAssignment(name,body);
		}
	}
}
