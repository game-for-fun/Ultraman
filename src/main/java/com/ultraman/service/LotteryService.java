package com.ultraman.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ultraman.dao.LotteryDao;
import com.ultraman.entity.Lottery;
import com.ultraman.exception.Result;
import com.ultraman.util.LotteryUtil;

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

	@POST
	@Path(value = "/lotterys")
	@Produces("application/json;charset=UTF-8")
	public Result<Integer> lottery() throws Exception {
		List<Lottery> list = lotteryDao.getAll();
		List<Double> orignalRates = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			orignalRates.add(i, list.get(i).getRate());
		}
		int orignalIndex = LotteryUtil.lottery(orignalRates);
		return Result.successResult(orignalIndex);
	}

	@GET
	@Path(value = "/ifEnough/{paramNum}")
	@Produces("application/json;charset=UTF-8")
	public Result<Integer> ifEnough(@PathParam("paramNum") Integer paramNum) throws Exception {
//		User user = (User) request.getSession().getAttribute("user");
		if (50000 < paramNum) {
			return Result.failResult("-1", "龙石不足,请充值");
		} else {
			return Result.failResult("0", "" + 10000);
		}
	}

	public List<Lottery> getList() {
		List<Lottery> list = lotteryDao.getAll();
		return list;
	}

}
