package net.wanho.service.impl;

import java.util.List;

import net.wanho.dao.DrugDaoI;
import net.wanho.dao.impl.DrugDaoImpl;
import net.wanho.pojo.DrugInventoryDetail;
import net.wanho.service.DrugServiceI;

public class DrugServiceImpl implements DrugServiceI {

	@Override
	public List<DrugInventoryDetail> getAllDrugs() {
		DrugDaoI drugDaoI = new DrugDaoImpl();
		List<DrugInventoryDetail> allDrugs = drugDaoI.getAllDrugs();

		return allDrugs;
	}

}
