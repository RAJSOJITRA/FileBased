package SolutionPackage;
import java.util.HashMap;
import java.util.Scanner;
import org.json.simple.JSONObject;

import LibraryPackage.LibraryClass;

public class Main {

	public static void main(String[] args) 
	{
		LibraryClass libobj = new LibraryClass();
		Scanner sc = new Scanner(System.in);
		JSONObject obj = new JSONObject();
		System.out.println("1.Create");
		System.out.println("2.Read");
		System.out.println("3.Write");
		while(true)
		{
			System.out.print("Enter Option : ");
			int option = sc.nextInt();
			sc.nextLine();
			String ans="",key="";
			switch(option)
			{
				case 1:
					System.out.println("Enter Hash Key");
					key = sc.nextLine();
					System.out.println("Enter Json Key");
					String jsonkey = sc.nextLine();
					System.out.println("Enter Json Key");
					String jsonvalue = sc.nextLine();
					obj.put(jsonkey, jsonvalue);
					ans = libobj.create(key, obj);
					System.out.println(ans);
					break;
				case 2:
					System.out.println("Enter Hash Key");
					key = sc.next();
					ans = libobj.read(key);
					System.out.println(ans);
					break;
				case 3:
					System.out.println("Enter Hash Key");
					key = sc.next();
					ans = libobj.Delete(key);
					System.out.println(ans);
					break;
				default:
					System.out.println("Invalid option");
					System.exit(0);
			}
		}	
		

	}

}
