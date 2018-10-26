package net.wanho.dao.impl;

import java.util.List;

import net.wanho.dao.DrugDaoI;
import net.wanho.pojo.DrugInventoryDetail;
import net.wanho.rowMapper.DrugInventoryDetailRowmapper;
import net.wanho.util.JDBCTemplate;

public class DrugDaoImpl implements DrugDaoI {

	@Override
	public List<DrugInventoryDetail> getAllDrugs() {
	
		String sql="SELECT * FROM drug_inventory_detail";
		List<DrugInventoryDetail> drugInventoryDetails = JDBCTemplate.query(sql, new DrugInventoryDetailRowmapper());
		return drugInventoryDetails;
	}

}
