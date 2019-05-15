package com.ultraman.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ultraman.entity.Lottery;

@Repository
public class LotteryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Lottery> getAll() {
//		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM lottery");
		List<Lottery> list = null;
		return list;
	}

}
