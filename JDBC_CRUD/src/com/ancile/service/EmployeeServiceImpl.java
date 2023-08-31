package com.ancile.service;

import java.sql.SQLException;

import com.ancile.bean.Employee;
import com.ancile.dao.*;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public boolean insertEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDAO empDAO = new EmployeeDAOImpl();
		
		//System.out.println("From Service Layer");
		if(empDAO.insertEmployee(e)) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean readEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDAO empDAO = new EmployeeDAOImpl();
		if(empDAO.readEmployee(e)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e, int colVal) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDAO eDAO = new EmployeeDAOImpl();
		eDAO.updateEmployee(e,colVal);
		return false;
	}

	@Override
	public void deleteEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDAO eDAO =new EmployeeDAOImpl();
		eDAO.deleteEmployee(e);
	}

}
