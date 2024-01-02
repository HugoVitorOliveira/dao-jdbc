package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		System.out.println("\n=== TEST 4: Seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@hotmail.com", new Date(), 4500.2, new Department(2, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Seller id: " + newSeller.getId());
		System.out.println("\n=== TEST 5: Seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		System.out.println("\n=== TEST 6: Seller Delete ===");
		System.out.println("Enter a Id for delete test:");
		sellerDao.deleteById(sc.nextInt());
		sc.close();
	
	}
}
