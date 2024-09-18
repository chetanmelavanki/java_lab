public class Aadhar {
	private long uidId;
	private String uidname;
	private String adress;
	
	public Aadhar() {
	
	}

	public long getUidId() {
		return uidId;
	}

	public void setUidId(long uidId) {
		this.uidId = uidId;
	}

	public String getUidname() {
		return uidname;
	}

	public void setUidname(String uidname) {
		this.uidname = uidname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String toString()
	{
		return "adhar card- [uid id="+uidId+", uid name="+uidname+",adress="+adress+"]";
	}

}