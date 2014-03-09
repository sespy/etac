package io.espy.etac.dao;

import io.espy.etac.model.AAccount;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class AAccountDao {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private SimpleJdbcInsert aaInsert;
	private DataSource dataSource;

	public List<AAccount> findAll() {
		String sql = "select * from aaccount";
		return queryForList(sql, new HashMap<String, String>());
	}

	public AAccount insert(AAccount a) {
		Map<String, Object> parameters = AAccount.parameterMapForDto(a);
		long id = (aaInsert.executeAndReturnKey(parameters)).longValue();
		a.setId(id);
		return a;
	}

	private List<AAccount> queryForList(String sql, Map<String, String> params) {
		List<AAccount> records = namedParameterJdbcTemplate.query(sql, params,
				new RowMapper<AAccount>() {
					public AAccount mapRow(ResultSet rs, int i)
							throws SQLException {
						return AAccount.dtoForRow(rs);
					}
				});
		return records;
	}

	public void setDataSource(DataSource newDataSource) {
		this.dataSource = newDataSource;
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
				dataSource);

		this.aaInsert = new SimpleJdbcInsert(dataSource).withTableName(
				"aaccount").usingGeneratedKeyColumns("id");
	}
}
