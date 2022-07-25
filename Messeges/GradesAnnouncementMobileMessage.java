package Messages;

public class GradesAnnouncementMobileMessage {
	private String type;

	public void setType(String type) {
		this.type = "GradesAnnouncementMobileMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "GradesAnnouncementMobileMessage#";
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
