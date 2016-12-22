package com.lms.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.attendance.dao.AttendanceDao;
import com.lms.domain.Attendance;

@Service          
public class AttendanceServiceImpl implements AttendanceService{
	@Autowired private AttendanceDao attendanceDao;
	
	@Override
	public int attendanceInsert(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceInsert(attendance);
	}

	@Override
	public int attendanceUpdate(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceUpdate(attendance);
	}

	@Override
	public int attendanceDelete(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceDelete(attendance);
	}

	@Override
	public List<Attendance> attendanceList() {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceList();
	}

	@Override
	public Attendance attendanceView(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceView(attendance);
	}

}
