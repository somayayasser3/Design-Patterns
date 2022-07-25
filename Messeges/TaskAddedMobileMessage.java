package Messages;

public class TaskAddedMobileMessage {
    private String type;

	public void setType(String type) {
		this.type = "TaskAddedMobileMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "TaskAddedMobileMessage#";
	}
	
	
	public void addTeamDescription() {
		
	}
}
