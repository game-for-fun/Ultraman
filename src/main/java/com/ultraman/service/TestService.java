package com.ultraman.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.ultraman.exception.Result;

@Path("/test")
@Service("TestService")
public class TestService {

	@GET
	@Path(value = "/{customerType}/{schoolId}/projectList")
	@Produces("application/json;charset=UTF-8")
	public Result<String> getList(@PathParam("customerType") Integer customerType) {
		return Result.successResult();
	}

}