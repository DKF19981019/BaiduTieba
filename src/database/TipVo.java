package database;

public class TipVo {
	private int repCount;
	private int tipId;
	private String tipTitle;
	private String tipContext;
	private int userId;
	private String tipUser;
	private String lastrepcontext;
	private String lastreptime;
	private String lastrepusid;
	private String tipTime;
	private String userNick;
	public TipVo(int repCount, int tipId, String tipTitle, String tipContext,
			int userId, String tipUser, String lastrepcontext,
			String lastreptime, String lastrepusid, String tipTime,
			String userNick) {
		super();
		this.repCount = repCount;
		this.tipId = tipId;
		this.tipTitle = tipTitle;
		this.tipContext = tipContext;
		this.userId = userId;
		this.tipUser = tipUser;
		this.lastrepcontext = lastrepcontext;
		this.lastreptime = lastreptime;
		this.lastrepusid = lastrepusid;
		this.tipTime = tipTime;
		this.userNick = userNick;
	}
	public int getRepCount() {
		return repCount;
	}
	public void setRepCount(int repCount) {
		this.repCount = repCount;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTipUser() {
		return tipUser;
	}
	public void setTipUser(String tipUser) {
		this.tipUser = tipUser;
	}
	public String getLastrepcontext() {
		return lastrepcontext;
	}
	public void setLastrepcontext(String lastrepcontext) {
		this.lastrepcontext = lastrepcontext;
	}
	public String getLastreptime() {
		return lastreptime;
	}
	public void setLastreptime(String lastreptime) {
		this.lastreptime = lastreptime;
	}
	public String getLastrepusid() {
		return lastrepusid;
	}
	public void setLastrepusid(String lastrepusid) {
		this.lastrepusid = lastrepusid;
	}
	public String getTipTime() {
		return tipTime;
	}
	public void setTipTime(String tipTime) {
		this.tipTime = tipTime;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	
}
