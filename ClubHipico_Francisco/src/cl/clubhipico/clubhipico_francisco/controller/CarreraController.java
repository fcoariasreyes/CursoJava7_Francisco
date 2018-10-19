package cl.clubhipico.clubhipico_francisco.controller;

import java.sql.SQLException;
import java.util.List;
import cl.clubhipico.clubhipico_francisco.object.CarreraObject;
import cl.clubhipico.clubhipico_francisco.util.DataBaseUtil;

public class CarreraController{

	private DataBaseUtil<CarreraObject> database;
	
	public CarreraController() throws ClassNotFoundException, SQLException {
		database = new DataBaseUtil<CarreraObject>();
	}
	
	

	

}
