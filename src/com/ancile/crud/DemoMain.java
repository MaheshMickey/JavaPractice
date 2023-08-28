package com.ancile.crud;

import java.util.*;

public class DemoMain {
	public static void main(String[] args) {

		Employee e1 = new Employee("Mike", "1124A Kbsdi");

		printStatements();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		int printOption = 0;
		int breakOption = 0;
		int keyOption;
		String in = "";
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(100, e1);
		do {
			do {
				if (breakOption == 1) {
					printStatements();
					option = sc.nextInt();
				}
				switch (option) {
				case 1:
					System.out.println("You have selected to Insert an Employee");
					System.out.println("You want to continue? (Yes/No)");
					sc.nextLine();
					in = sc.nextLine();
					if (in.equalsIgnoreCase("yes")) {
						System.out.println("Enter the key to add");
						int key = sc.nextInt();
						String name = "";
						String addr = "";
						if (!hm.containsKey(key)) {
							sc.nextLine();
							System.out.println("Enter the name");
							name = sc.nextLine();
							System.out.println("Enter the address");
							addr = sc.nextLine();
							Employee e = new Employee(name, addr);
							hm.put(key, e);
							System.out.println("Operation Successfull");
						} else {
							System.out.println("Key " + key + "already exists");
						}
					} else {
						break;
					}
					break;
				case 2:
					System.out.println("You have choosed to read employee data");
					System.out.println("You want to continue? (Yes/No)");
					sc.nextLine();
					in = sc.nextLine();
					if (in.equalsIgnoreCase("yes")) {
						System.out.println("select a key to choose employee data");
						System.out.println(hm.keySet());
						keyOption = sc.nextInt();
						if (hm.containsKey(keyOption)) {
							Employee getKey = hm.get(keyOption);
							if (getKey != null) {
								System.out.println("You have selected a key" + keyOption + " with values " + getKey);
							}
						}
					} else {
						break;
					}
					break;

				case 3:
					System.out.println("You choosed to update the Employee Data");
					System.out.println("You want to continue ? (Yes/No)");
					sc.nextLine();
					in = sc.nextLine();
					if (in.equalsIgnoreCase("yes")) {
						System.out.println("Select a key you want to update");
						System.out.println(hm.keySet());
						keyOption = sc.nextInt();
						if (hm.containsKey(keyOption)) {
							System.out.println("Choose what data you want to update\n Name or Address");
							sc.nextLine();
							String sc1 = sc.nextLine();
							if (sc1.equalsIgnoreCase("name")) {
								Employee getValue = hm.get(keyOption);
								System.out.println("Old Value is: "+getValue.getEmpName());
								System.out.println("Enter a new name value");
								String newName = sc.nextLine();
								getValue.setEmpName(newName);
								hm.put(keyOption, getValue);
								System.out.println("Update Operation Successfull!!!");
							} else if (sc1.equalsIgnoreCase("address")) {
								Employee getValue = hm.get(keyOption);
								System.out.println("Enter a new address value");
								String newAddr = sc.nextLine();
								getValue.setEmpAddress(newAddr);
								hm.put(keyOption, getValue);
								System.out.println("Update Operation Successfull!!!");
							} else {
								System.out.println("Please choose either Name or Address");
							}
						}
					}
					break;
				case 4: System.out.println("You have choosed to delete a Employee");
				System.out.println("Do you want to continue? (Yes/No)");
				sc.nextLine();
				in = sc.nextLine();
				if(in.equalsIgnoreCase("yes")) {
					System.out.println("Select a key you want to Delete");
					System.out.println(hm.keySet());
					keyOption = sc.nextInt();
					Employee eValues = hm.get(keyOption);
					System.out.println("Delete Operation Successfull!!! \n Following employee Data has been deleted:\n "
							+ "Key: "+keyOption +" Values: "+eValues);
					hm.remove(keyOption);
				}
				break;
				default:System.out.println("Please select a valid operation");
				break;
				}
				System.out.println("Do you want to do other operation ? (1/0)");
				breakOption = sc.nextInt();
			} while (breakOption == 1);
			System.out.println("Are you sure you want to exit? (1/0");
			printOption = sc.nextInt();
		} while (printOption == 0);
		System.out.println("Completed!!!!");
		System.out.println("Updated Map is:" + hm.entrySet());
	}

	public static void printStatements() {
		System.out.println("EMPLOYEE CRUD OPERATION");
		System.out.println("1. Insert Employee");
		System.out.println("2. Read Employee Data");
		System.out.println("3. Update Employee Data");
		System.out.println("4. Delete Employee");
	}
}
