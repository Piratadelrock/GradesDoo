package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.SessionBusiness;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.SessionDTO;

public class SessionBusinessImpl implements SessionBusiness {


	private DAOFactory daoFactory;

	public SessionBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a SessionBusinessImpl when the DAOFactory is null");
		}

		this.daoFactory = daoFactory;
	}

	@Override
	public void create(SessionDTO dto) {
		daoFactory.getSessionDAO().create(dto);
	}

	@Override
	public void update(SessionDTO dto) {
		daoFactory.getSessionDAO().update(dto);
	}

	@Override
	public void delete(int id) {
		daoFactory.getSessionDAO().delete(id);
	}

	@Override
	public List<SessionDTO> find(SessionDTO dto) {
		return daoFactory.getSessionDAO().find(dto);
	}

}
