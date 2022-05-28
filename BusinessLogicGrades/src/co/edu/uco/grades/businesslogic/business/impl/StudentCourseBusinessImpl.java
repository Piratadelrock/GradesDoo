package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.StudentCourseBusiness;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.StudentCourseDTO;

public class StudentCourseBusinessImpl implements StudentCourseBusiness {
	
	private DAOFactory daoFactory;

	public StudentCourseBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a StudentCourseBusinessImpl when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}
	@Override
	public void create(StudentCourseDTO dto) {
		daoFactory.getStudentCourseDAO().create(dto);
	}

	@Override
	public void update(StudentCourseDTO dto) {
		daoFactory.getStudentCourseDAO().update(dto);
	}

	@Override
	public void delete(int id) {
		daoFactory.getStudentCourseDAO().delete(id);
	}

	@Override
	public List<StudentCourseDTO> find(StudentCourseDTO dto) {
		return daoFactory.getStudentCourseDAO().find(dto);
	}

}
