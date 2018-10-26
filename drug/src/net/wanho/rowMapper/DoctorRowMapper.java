package net.wanho.rowMapper;

import java.sql.ResultSet;

import net.wanho.pojo.Doctor;

public class DoctorRowMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs) throws Exception {
		return new Doctor(rs.getInt("id"),rs.getString("doctorName"),rs.getString("password"));
	}

}
