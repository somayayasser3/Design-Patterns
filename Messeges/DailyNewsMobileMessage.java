package Messages;

public class DailyNewsMobileMessage {
	private String type;

	public void setType(String type) {
		this.type = "DailyNewsMobileMessage";
	}

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "DailyNewsMobileMessage#";
	}
}
