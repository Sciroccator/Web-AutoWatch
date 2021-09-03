package dao;

import java.sql.Connection;
import java.sql.SQLException;

import singleton.DbConnection;

public class DaoUsuario {
	private Connection conn = null;
	private static DaoUsuario instance = null;
	
public DaoUsuario() {
		
		try {
			conn= DbConnection.getConnection();
		} catch (SQLException e) {
			System.out.println("Fallo en la conexionn a base de datos");
			
		}
		
	}
public static DaoUsuario getInstance() {
	
	if (instance == null) {
		
		instance = new DaoUsuario();
		
		
		
	}
	
	return instance;
 
 }






}
