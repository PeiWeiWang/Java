package net.wanho.service;

import net.wanho.pojo.Doctor;

public interface DoctorServiceI {
	Doctor login(String doctorName, String password);
}
