package co.edu.uco.grades.businesslogic.facade.impl;

import java.util.List;

import co.edu.uco.grades.businesslogic.business.IdTypeBusiness;
import co.edu.uco.grades.businesslogic.business.impl.IdTypeBusinessImpl;
import co.edu.uco.grades.businesslogic.facade.IdTypeFacade;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;

public class IdTypeFacadeImpl implements IdTypeFacade {

	private DAOFactory daoFactory= DAOFactory.getDaoFactory();
	
	@Override
	public void create(IdTypeDTO dto) {
		
		 DAOFactory daoFactory= DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.create(dto);
			daoFactory.commitTransaction();
		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "there was a problem tryign to create the new IdType on create method in IdTypeFacade Impl";
			throw GradesException.buildTechnicalBusinessLogicException(message);
			// Controlar exception
		} finally {
			daoFactory.closeConnection();
		}

	}

	@Override
	public void update(IdTypeDTO dto) {
		try {
			daoFactory.initTransaction();
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.update(dto);
			daoFactory.commitTransaction();
		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "there was a problem tryign to update the new IdType on update method in IdTypeFacade Impl";
			throw GradesException.buildTechnicalBusinessLogicException(message);
			// Controlar exception
		} finally {
			daoFactory.closeConnection();
		}

	}

	@Override
	public void delete(int id) {
		try {
			daoFactory.initTransaction();
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.delete(id);
			daoFactory.commitTransaction();
		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "there was a problem tryign to delete the new IdType on delete method in IdTypeFacade Impl";
			throw GradesException.buildTechnicalBusinessLogicException(message);
			// Controlar exception
		} finally {
			daoFactory.closeConnection();
		}

	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) {
		try {
			daoFactory.initTransaction();
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.find(dto);
			daoFactory.commitTransaction();
		} catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "there was a problem tryign to find the new IdType on find method in IdTypeFacade Impl";
			throw GradesException.buildTechnicalBusinessLogicException(message);
			// Controlar exception
		} finally {
			daoFactory.closeConnection();
		}

		return null;
	}

}
