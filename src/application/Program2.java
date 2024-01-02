package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		//Department tests
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: Department insert ===");
		//Department newDepartment = new Department(null, "Cosmetics");
		//DepartmentDao.insert(newDepartment);
		System.out.println("=== TEST 2: Department findById ===");
		System.out.println(DepartmentDao.findById(4));
		System.out.println("=== TEST 3: Department Update ===");
		Department department = DepartmentDao.findById(1);
		department.setName("Foods");
		DepartmentDao.update(department);
		System.out.println("Update completed");
	}

}
