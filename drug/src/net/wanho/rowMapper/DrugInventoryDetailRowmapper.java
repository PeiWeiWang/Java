package net.wanho.rowMapper;

import java.sql.ResultSet;

import net.wanho.pojo.DrugInventoryDetail;

public class DrugInventoryDetailRowmapper implements RowMapper<DrugInventoryDetail>{

	@Override
	public DrugInventoryDetail mapRow(ResultSet rs) throws Exception {
		return new DrugInventoryDetail(rs.getInt("id"), rs.getString("drugName"), rs.getInt("drugNum"));
	}
	
	
	

}
