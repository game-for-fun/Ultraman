package com.ultraman.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LotteryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM lottery");
		System.err.println(list);
		return list;
	}

}
