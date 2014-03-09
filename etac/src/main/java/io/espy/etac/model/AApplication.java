package io.espy.etac.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AApplication {

	private long id;
	private String shortName;
	// private String longName;
	// private String appProjectKey;
	// private String department;
	// private String jiraUri;
	// private String scmUri;
	// private boolean phiFlag;
	// private String businessAnalyst;
	// private String techLead;
	private String businessOwner;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getBusinessOwner() {
		return businessOwner;
	}

	public void setBusinessOwner(String businessOwner) {
		this.businessOwner = businessOwner;
	}

	// xproject hosts

	// app attirbutes
	// x app service account

	public static AApplication dtoForRow(ResultSet rs) throws SQLException {
		AApplication a = new AApplication();
		a.setId(rs.getLong("id"));
		a.setShortName(rs.getString("short_name"));
		a.setBusinessOwner(rs.getString("business_owner"));
		return a;
	}

	public static Map<String, Object> parameterMapForDto(AApplication a) {
		Map<String, Object> parameters = new HashMap<String, Object>(10);
		parameters.put("id", a.getId());
		parameters.put("short_name", a.getShortName());
		parameters.put("business_owner", a.getBusinessOwner());
		return parameters;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id=" + getId());
		sb.append(", shortName=" + getShortName());
		return sb.toString();
	}

}
