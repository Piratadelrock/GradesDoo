package co.edu.uco.grades.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.businesslogic.business.SubjectBusiness;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.SubjectDTO;

public class SubjectBusinessImp implements SubjectBusiness {

	private DAOFactory daoFactory;

	public SubjectBusinessImp(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a SubjectBusinessImp when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}
	
	@Override
	public void create(SubjectDTO dto) {
		daoFactory.getSubjectDAO().create(dto);
	}

	@Override
	public void update(SubjectDTO dto) {
		daoFactory.getSubjectDAO().update(dto);
	}

	@Override
	public void delete(int id) {
		daoFactory.getSubjectDAO().delete(id);
	}

	@Override
	public List<SubjectDTO> find(SubjectDTO dto) {
		return daoFactory.getSubjectDAO().find(dto);
	}

}
