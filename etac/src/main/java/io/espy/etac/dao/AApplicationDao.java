package io.espy.etac.dao;

import io.espy.etac.model.AApplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class AApplicationDao {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private SimpleJdbcInsert aaInsert;
	private DataSource dataSource;

	public List<AApplication> findAll() {
		String sql = "select * from aapplication";
		return queryForList(sql, new HashMap<String, String>());
	}

	private List<AApplication> queryForList(String sql,
			Map<String, String> params) {
		List<AApplication> records = namedParameterJdbcTemplate.query(sql,
				params, new RowMapper<AApplication>() {
					public AApplication mapRow(ResultSet rs, int i)
							throws SQLException {
						return AApplication.dtoForRow(rs);
					}
				});
		return records;
	}

	public void setDataSource(DataSource newDataSource) {
		this.dataSource = newDataSource;
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
				dataSource);

		this.aaInsert = new SimpleJdbcInsert(dataSource).withTableName(
				"aapplication").usingGeneratedKeyColumns("id");
	}
}
