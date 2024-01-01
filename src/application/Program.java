package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(5);
		System.out.println(seller);
		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		for(Seller obj : list) {
			System.out.println(obj);
		};
		System.out.println("\n=== TEST 3: Seller findAll ===");
		List<Seller> list1 = sellerDao.findAll();
		for(Seller ob : list1) {
			System.out.println(ob);
		};
	}
}
