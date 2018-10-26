package net.wanho.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import net.wanho.dao.AdviceDaoI;
import net.wanho.dao.impl.AdviceDaoImpl;
import net.wanho.dto.AdviceDto;
import net.wanho.service.AdviceServiceI;
import net.wanho.util.JsonResult;

public class AdviceServiceImpl implements AdviceServiceI {

	@Override
	public JsonResult addAdvice(String json, int doctorId) {
		// json串解析
		JSONObject jsonObject = new JSONObject();
		JsonResult result = new JsonResult();
		List<AdviceDto> adviceDtos = jsonObject.parseArray(json, AdviceDto.class);
		AdviceDaoI adviceDaoI = new AdviceDaoImpl();
		// 判断药品数量是否足够
		if (adviceDtos == null) {
			result.setStatus(400);
			result.setMsg("传参有误");
			return result;
		}

		for (AdviceDto a : adviceDtos) {
			int num = adviceDaoI.getDrugNumById(a.getDrugId());
			if (a.getDrugNum() > num) {
				result.setStatus(400);
				result.setMsg("药品数量不足");
				return result;
			}
		}

		// 预占
		for (AdviceDto a : adviceDtos) {
			adviceDaoI.deleteDrugNum(a);
		}
		// 添加医嘱
		for (AdviceDto a : adviceDtos) {
			try {
				adviceDaoI.addAdvice(a, doctorId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		result.setStatus(200);
		result.setMsg("添加医嘱成功");

		return result;
	}

}
