package net.wanho.dao.impl;

import java.util.List;

import net.wanho.dao.AdviceDaoI;
import net.wanho.dto.AdviceDto;
import net.wanho.pojo.DrugInventoryDetail;
import net.wanho.rowMapper.DrugInventoryDetailRowmapper;
import net.wanho.util.JDBCTemplate;

public class AdviceDaoImpl implements AdviceDaoI {

	@Override
	public int getDrugNumById(int drugId) {
		String sql="SELECT * FROM drug_inventory_detail WHERE ID=?";
		List<DrugInventoryDetail> drugInventoryDetails = JDBCTemplate.query(sql, new DrugInventoryDetailRowmapper(), drugId);
		if (drugInventoryDetails!=null&&drugInventoryDetails.size()!=0) {
			return drugInventoryDetails.get(0).getDrugNum();
		}
	
		return 0;
	}

	@Override
	public void deleteDrugNum(AdviceDto adviceDto) {
		String sql="UPDATE drug_inventory_detail SET drugNum=drugNum-? WHERE ID=?";
		JDBCTemplate.update(sql, adviceDto.getDrugNum(),adviceDto.getDrugId());
	}

	@Override
	public void addAdvice(AdviceDto adviceDto, int doctorId) throws Exception {
		String sql="INSERT INTO use_drug_detail VALUES(NULL,?,?,?)";
		JDBCTemplate.insert(sql, doctorId,adviceDto.getDrugNum(),adviceDto.getDrugId());
	}

}
