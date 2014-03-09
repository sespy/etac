package io.espy.etac.model;

public class ANote {

	private long id;
	private String keyString;

	// private String valueString;

	// better done with a chunck of text?

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id=" + getId());
		sb.append(", keyString=" + getKeyString());
		return sb.toString();
	}
}
