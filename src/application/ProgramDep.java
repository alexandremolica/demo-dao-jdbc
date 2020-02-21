package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {

	public static void main(String[] args) {

		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
/*
		System.out.println("==== TEST 1 : Department findById ====");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
*/		
		System.out.println("\n==== TEST 2 : Department findAll ====");
		List<Department> departments = new ArrayList<>();
		departments = departmentDao.findAll();
		for(Department deps: departments) {
			System.out.println(deps);
		}
/*
		System.out.println("\n==== TEST 3 : Department update ====");
		Department dep = departmentDao.findById(4);
		dep.setName("Pets");
		departmentDao.update(dep);
		System.out.println("Updated!");
	
		System.out.println("\n==== TEST 4 : Department deleted ====");
		departmentDao.deleteById(5);
		System.out.println("Deleted!");

		System.out.println("\n==== TEST 5 : Department insert ====");
		Department newDepartment = new Department(null, "Pet");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
*/
		
	}

}
