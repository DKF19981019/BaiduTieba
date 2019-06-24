package database;

public class Replay {
	private int repid;
	private String repContent;
	private String repTime;
	private int tipId;
	private int usId;
	public int getRepid() {
		return repid;
	}
	public void setRepid(int repid) {
		this.repid = repid;
	}
	public String getRepContent() {
		return repContent;
	}
	public void setRepContent(String repContent) {
		this.repContent = repContent;
	}
	public String getRepTime() {
		return repTime;
	}
	public void setRepTime(String repTime) {
		this.repTime = repTime;
	}
	public int getTipId() {
		return tipId;
	}
	public void setTipId(int tipId) {
		this.tipId = tipId;
	}
	public int getUsId() {
		return usId;
	}
	public void setUsId(int usId) {
		this.usId = usId;
	}
	public Replay(int repid, String repContent, String repTime, int tipId,
			int usId) {
		super();
		this.repid = repid;
		this.repContent = repContent;
		this.repTime = repTime;
		this.tipId = tipId;
		this.usId = usId;
	}
}
