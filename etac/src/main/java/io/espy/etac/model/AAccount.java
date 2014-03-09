package io.espy.etac.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AAccount {

	private long id;
	private String adUserName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdUserName() {
		return adUserName;
	}

	public void setAdUserName(String adUserName) {
		this.adUserName = adUserName;
	}

	public static AAccount dtoForRow(ResultSet rs) throws SQLException {
		AAccount a = new AAccount();
		a.setId(rs.getLong("id"));
		a.setAdUserName(rs.getString("ad_user"));
		return a;
	}
	
	public static Map<String, Object> parameterMapForDto(AAccount a) {
		Map<String, Object> parameters = new HashMap<String, Object>(10);
		parameters.put("id", a.getId());
		parameters.put("ad_user", a.getAdUserName());
		return parameters;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id=" + getId());
		sb.append(", adUserName=" + getAdUserName());
		return sb.toString();
	}
}
