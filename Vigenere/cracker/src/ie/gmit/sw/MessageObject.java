package ie.gmit.sw;

public class MessageObject {
	
	private long jobNumber;
	private String cyperText;
	private int maxKeyLength;
	
	public MessageObject(long jobNumber, String cyperText, int maxKeyLength) {
		super();
		this.jobNumber = jobNumber;
		this.cyperText = cyperText;
		this.maxKeyLength = maxKeyLength;
	}

	public long getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(long jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getCyperText() {
		return cyperText;
	}

	public void setCyperText(String cyperText) {
		this.cyperText = cyperText;
	}

	public int getMaxKeyLength() {
		return maxKeyLength;
	}

	public void setMaxKeyLength(int maxKeyLength) {
		this.maxKeyLength = maxKeyLength;
	}
	
	
}
