package com.ultraman.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ultraman.dao.LotteryDao;
import com.ultraman.exception.Result;

@Path("/lottery")
@Service("LotteryService")
public class LotteryService {

	@Autowired
	private LotteryDao lotteryDao;

	@GET
	@Path(value = "/getAll")
	@Produces("application/json;charset=UTF-8")
	public Result<List<Map<String, Object>>> getAll() throws Exception {
		List<Map<String, Object>> list = lotteryDao.getAll();
		return Result.successResult(list);
	}

}
