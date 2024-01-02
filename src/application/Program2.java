package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		//Department tests
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: Department insert ===");
		Department newDepartment = new Department(null, "Computers");
		DepartmentDao.insert(newDepartment);
		System.out.println("=== TEST 2: Department findById ===");
		System.out.println(DepartmentDao.findById(4));
		System.out.println("=== TEST 3: Department Update ===");
		Department department = DepartmentDao.findById(1);
		department.setName("Foods");
		DepartmentDao.update(department);
		System.out.println("Update completed");
		System.out.println("=== TEST 4: Department Delete ===");
		DepartmentDao.deleteById(6);
		System.out.println("\n=== TEST 5: Department FindAll ===");
		List<Department> list1 = DepartmentDao.findAll();
		for(Department ob : list1) {
			System.out.println(ob);
		};
	}

}
