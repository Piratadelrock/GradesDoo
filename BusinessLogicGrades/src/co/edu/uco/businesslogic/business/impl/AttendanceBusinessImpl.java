package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.AttendanceBusiness;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.AttendanceDTO;

public class AttendanceBusinessImpl implements AttendanceBusiness {
	
	private DAOFactory daoFactory;


	@Override
	public void create(AttendanceDTO dto) {
		
		daoFactory.getAttendanceDAO().create(dto);
		
	}

	@Override
	public void update(AttendanceDTO dto) {
		
		daoFactory.getAttendanceDAO().update(dto);
		
	}

	@Override
	public void delete(int id) {
		
		daoFactory.getAttendanceDAO().delete(id);
	}

	@Override
	public List<AttendanceDTO> find(AttendanceDTO dto) {
		return daoFactory.getAttendanceDAO().find(dto);
	}

}