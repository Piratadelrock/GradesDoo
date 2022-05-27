package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.CourseBusiness;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.CourseDTO;

public class CourseBusinessImpl implements CourseBusiness {

	private DAOFactory daoFactory;

	public CourseBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a CourseBusinessImpl when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}
	
	@Override
	public void create(CourseDTO dto) {
		daoFactory.getCourseDAO().create(dto);
		
	}

	@Override
	public void update(CourseDTO dto) {
		
		daoFactory.getCourseDAO().update(dto);
	}

	@Override
	public void delete(int id) {
	
		daoFactory.getCourseDAO().delete(id);
	}

	@Override
	public List<CourseDTO> find(CourseDTO dto) {
		return daoFactory.getCourseDAO().find(dto);
	}

}
