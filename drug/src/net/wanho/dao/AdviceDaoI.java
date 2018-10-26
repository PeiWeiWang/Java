package net.wanho.dao;

import net.wanho.dto.AdviceDto;

public interface AdviceDaoI {
	
//	查询药品的数量是否足够
	int getDrugNumById(int drugId);

//	预占扣除药品数量
	void deleteDrugNum(AdviceDto adviceDto );
//	添加医嘱
	void addAdvice(AdviceDto adviceDto,int doctorId) throws Exception;
	
	
	
	

}
