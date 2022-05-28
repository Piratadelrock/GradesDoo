package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.ProfessorBusiness;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.ProfessorDTO;

public class ProfessorBusinessImpl implements ProfessorBusiness{
	
	private DAOFactory daoFactory;

	public ProfessorBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a ProfessorBusinessImpl when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}

	@Override
	public void create(ProfessorDTO dto) {
		daoFactory.getProfessorDAO().create(dto);
	}

	@Override
	public void update(ProfessorDTO dto) {
		daoFactory.getProfessorDAO().update(dto);
	}

	@Override
	public void delete(int id) {
		daoFactory.getProfessorDAO().delete(id);
	}

	@Override
	public List<ProfessorDTO> find(ProfessorDTO dto) {
		
		return daoFactory.getProfessorDAO().find(dto);
	}

}
