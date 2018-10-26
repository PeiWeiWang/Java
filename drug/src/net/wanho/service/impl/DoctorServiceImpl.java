package net.wanho.service.impl;

import net.wanho.dao.DoctorDaoI;
import net.wanho.dao.impl.DoctorDaoImpl;
import net.wanho.pojo.Doctor;
import net.wanho.service.DoctorServiceI;

public class DoctorServiceImpl implements DoctorServiceI {

	@Override
	public Doctor login(String doctorName, String password) {
		DoctorDaoI doctorDaoI=new DoctorDaoImpl();
		Doctor doctor = doctorDaoI.login(doctorName, password);
		
		return doctor;
	}

}
