package com.ancile.jpassodemo.JPAAssociationDemo;

import java.util.List;
import java.util.*;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ancile.jpaassodemo.entity.Department;
import com.ancile.jpaassodemo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Scanner sc = new Scanner(System.in);
		Department d = new Department();
		d.setDepName("ECE");
		d.setDepId(101);

		Department d1 = new Department();
		d1.setDepName("CSE");
		d1.setDepId(102);

		em.persist(d);
		em.persist(d1);
		em.getTransaction().commit();

		List<Employee> elist = new ArrayList<>();
		int empIdCounter = 1;
		while (true) {
			System.out.println("Choose a department from below 1.ECE   2.CSE");
			int depOption = sc.nextInt();
			sc.nextLine();
			
			Employee e = new Employee();
			e.setEmpId(empIdCounter++);
			System.out.println("Please enter empName:");
			String name = sc.nextLine();
			System.out.println("Please enter empAddress: ");
			String addr = sc.nextLine();
			
			em.getTransaction().begin();
			e.setEmpName(name);
			e.setEmpAddress(addr);
			
			if (depOption == 1) {
				e.setDepId(d.getDepId());
				elist.add(e);
				d.setListEmDp(elist);
			} else if(depOption == 2) {
				e.setDepId(d1.getDepId());
				elist.add(e);
				d1.setListEmDp(elist);
			}
			
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("Added succesfully");
			System.out.println(e);
			System.out.println("Do you want to continue? (1/0)");
			int caseOption = sc.nextInt();
			if(caseOption == 0) {
				break;
			}
			else if(caseOption ==1){
				continue;
			}
			else {
				System.out.println("Please choose valid option (1/0)");
			}
		}
		
		em.close();
		emf.close();
	}
}
