package com.tapacademy.DAO;

import java.util.List;
import com.tapacademy.DTO.*;

public interface EmployeeDAO {

	
	List getEmployees();
	Employee getId(int id);
	boolean insertEmployee(int id , String name , String designation , int salary);
	boolean updateEmployee(Employee e);
	boolean deleteEmployee(int id);
	
}
