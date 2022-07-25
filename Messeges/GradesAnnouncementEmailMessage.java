package Messages;

public class GradesAnnouncementEmailMessage {
    private String type;

	public void setType(String type) {
		this.type = "GradesAnnouncementEmailMessageBuilder";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "GradesAnnouncementEmailMessage#";
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
