package database;

public class Tip {
	private int tipId;
	private String tipTitle;
	private String tipContext;
	private String tipTime;	
	private int replyCount;
	private int userid;
	public Tip(int tipId, String tipTitle, String tipContext, String tipTime,
			int replyCount, int userid) {
		super();
		this.tipId = tipId;
		this.tipTitle = tipTitle;
		this.tipContext = tipContext;
		this.tipTime = tipTime;
		this.replyCount = replyCount;
		this.userid = userid;
	}
	public int getTipId() {
		return tipId;
	}
	public void setTipId(int tipId) {
		this.tipId = tipId;
	}
	public String getTipTitle() {
		return tipTitle;
	}
	public void setTipTitle(String tipTitle) {
		this.tipTitle = tipTitle;
	}
	public String getTipContext() {
		return tipContext;
	}
	public void setTipContext(String tipContext) {
		this.tipContext = tipContext;
	}
	public String getTipTime() {
		return tipTime;
	}
	public void setTipTime(String tipTime) {
		this.tipTime = tipTime;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}