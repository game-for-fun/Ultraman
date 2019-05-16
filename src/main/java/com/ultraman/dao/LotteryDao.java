package com.ultraman.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ultraman.entity.Lottery;

@Repository
public class LotteryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Lottery> getAll() {
		String sql = "SELECT * FROM lottery";
		List<Lottery> list = jdbcTemplate.query(sql, new Object[] {},
				new BeanPropertyRowMapper<Lottery>(Lottery.class));
		return list;
	}

}
