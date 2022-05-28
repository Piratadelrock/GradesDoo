package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.StudentCourseStateBusiness;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.StudentCourseStateDTO;

public class StudentCourseStateBusinessImpl implements StudentCourseStateBusiness {
	
	private DAOFactory daoFactory;

	public StudentCourseStateBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a StudentCourseStateBusinessImpl when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}
	
	
	@Override
	public void create(StudentCourseStateDTO dto) {
		daoFactory.getStudentCourseStateDAO().create(dto);
	}

	@Override
	public void update(StudentCourseStateDTO dto) {
		daoFactory.getStudentCourseStateDAO().update(dto);
	}

	@Override
	public void delete(int id) {
		daoFactory.getStudentCourseStateDAO().delete(id);

	}

	@Override
	public List<StudentCourseStateDTO> find(StudentCourseStateDTO dto) {
		return daoFactory.getStudentCourseStateDAO().find(dto);
	}

}
