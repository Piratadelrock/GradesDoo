package co.edu.uco.grades.data.factory.azuresql;

import java.sql.Connection;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.crosscutting.util.sql.UtilConnection;
import co.edu.uco.grades.data.dao.StudentDAO;
import co.edu.uco.grades.data.factory.DAOFactory;

public class AzureSqlDAOFactory extends DAOFactory {

	private Connection connection;

	private AzureSqlDAOFactory() {
		openConnection();
	}

	@Override
	protected void openConnection() {
		// TODO Auto-generated method stub
		if(UtilObject.getUtilObject().isNull(connection)|| UtilConnection.isClosed(connection){
			//podemos abrir una conexión
			
		}
	}

	@Override
	public void getCoonection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeConnectio() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentDAO getStudentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
