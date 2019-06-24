package database;

public class Users {
	private int usId;
	private String usNo;
	private String usPwd;
	private String usName;
	private String usTime;
	private String usState;
	private int usScore;
	public Users(int usId, String usNo, String usPwd, String usName,
			String usTime, String usState, int usScore) {
		super();
		this.usId = usId;
		this.usNo = usNo;
		this.usPwd = usPwd;
		this.usName = usName;
		this.usTime = usTime;
		this.usState = usState;
		this.usScore = usScore;
	}
	public int getUsId() {
		return usId;
	}
	public void setUsId(int usId) {
		this.usId = usId;
	}
	public String getUsNo() {
		return usNo;
	}
	public void setUsNo(String usNo) {
		this.usNo = usNo;
	}
	public String getUsPwd() {
		return usPwd;
	}
	public void setUsPwd(String usPwd) {
		this.usPwd = usPwd;
	}
	public String getUsName() {
		return usName;
	}
	public void setUsName(String usName) {
		this.usName = usName;
	}
	public String getUsTime() {
		return usTime;
	}
	public void setUsTime(String usTime) {
		this.usTime = usTime;
	}
	public String getUsState() {
		return usState;
	}
	public void setUsState(String usState) {
		this.usState = usState;
	}
	public int getUsScore() {
		return usScore;
	}
	public void setUsScore(int usScore) {
		this.usScore = usScore;
	}
	
}
