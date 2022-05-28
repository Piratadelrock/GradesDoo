package co.edu.uco.grades.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.businesslogic.business.StudentBusiness;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.StudentDTO;

public class StudentBusinessImpl implements StudentBusiness{

	private DAOFactory daoFactory;

	public StudentBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a StudentBusinessImpl when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}

	@Override
	public void create(StudentDTO dto) {
		daoFactory.getStudentDAO().create(dto);
	}

	@Override
	public void update(StudentDTO dto) {
		daoFactory.getStudentDAO().update(dto);
	}

	@Override
	public void delete(int id) {
		daoFactory.getStudentDAO().delete(id);
	}

	@Override
	public List<StudentDTO> find(StudentDTO dto) {
		return daoFactory.getStudentDAO().find(dto);
	}

}
