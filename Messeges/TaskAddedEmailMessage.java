package Messages;

public class TaskAddedEmailMessage {
    private String type;

	public void setType(String type) {
		this.type = "TaskAddedEmailMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		
		return "TaskAddedEmailMessage#";
	}
	
	
	public void addTeamDescription() {
		
	}
}
