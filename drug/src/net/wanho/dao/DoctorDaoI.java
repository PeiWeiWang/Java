package net.wanho.dao;

import net.wanho.pojo.Doctor;

public interface DoctorDaoI {
        Doctor login(String doctorName,String password);
}
