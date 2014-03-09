package io.espy.etac.model;

public class ADataStore {

	private long id;
	private String storeName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/*
	 * 
	 * id storeName jdbcUrl phiFlag
	 */

	// DStoreAttirbute kv etc

	// dbalias

	// x DH Host
	// DS SA

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id=" + getId());
		sb.append(", storeName=" + getStoreName());
		return sb.toString();
	}

}
