package net.wanho.service;

import net.wanho.util.JsonResult;

public interface AdviceServiceI {

	JsonResult addAdvice(String json,int doctorId);
	
}
