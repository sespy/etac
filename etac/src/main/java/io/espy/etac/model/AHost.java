package io.espy.etac.model;

public class AHost {

	private long id;
	private String cName;
	private String ipString;

	// cName;
	// fqCName;
	// ip;
	// dzFlag;
	// physcalFlag;
	// os category
	// vmFlag;
	// vmFarm;
	// hostRole; eg. CERT?

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public String getIpString() {
		return ipString;
	}

	public void setIpString(String ipString) {
		this.ipString = ipString;
	}

	// AHostAlias ref {id, aliasSring, keyFlag}

	// AHostElementType e.g app server, mq server, db

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id=" + getId());
		sb.append(", cName=" + getCName());
		sb.append(", ip=" + getIpString());
		return sb.toString();
	}
}
