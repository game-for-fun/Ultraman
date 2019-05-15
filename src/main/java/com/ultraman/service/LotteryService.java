package com.ultraman.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ultraman.dao.LotteryDao;
import com.ultraman.entity.Lottery;
import com.ultraman.exception.Result;

@Path("/lottery")
@Service("LotteryService")
public class LotteryService {

	@Autowired
	private LotteryDao lotteryDao;

	@GET
	@Path(value = "/getAll")
	@Produces("application/json;charset=UTF-8")
	public Result<List<Lottery>> getAll() throws Exception {
		List<Lottery> list = lotteryDao.getAll();
		return Result.successResult(list);
	}

}
