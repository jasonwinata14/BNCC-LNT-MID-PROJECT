package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import java.util.List.*;

abstract class vehicle{
	
	Scanner scan = new Scanner(System.in);
	String brand, name, license, type2;
	int x=0, topspeed, gascap, wheel, entertainment, helm;

	
	public String brand() {
		do
		{
			System.out.print("Input brand [>= 5]: ");
			brand = scan.nextLine();
		}while(brand.length()<5);
		return brand;
	}
	
	public String name() {
		do
		{
			System.out.print("Input name [>= 5]: ");
			name = scan.nextLine();
		}while(name.length()<5);
		return name;
	}
	
	public String license() {
		do
		{
			System.out.print("Input license: ");
			license = scan.nextLine();
			if(Pattern.matches("\\D\\s\\d\\s\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\s\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\d\\s\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\d\\d\\s\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\s\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\s\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\d\\s\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\d\\d\\s\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\s\\D\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\s\\D\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\d\\s\\D\\D\\D", license)) x=1;
			else if(Pattern.matches("\\D\\s\\d\\d\\d\\d\\s\\D\\D\\D", license)) x=1;
			license.toUpperCase();
		}while(x==0);
		return license;
	}
	
	public int topspeed() {
		do
		{
			System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
			topspeed = scan.nextInt();scan.nextLine();
		}while(topspeed<100||topspeed>250);
		return topspeed;
	}
	
	public int gascap() {
		do
		{
			System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
			gascap = scan.nextInt();scan.nextLine();
		}while(gascap<30||gascap>60);
		return gascap;
	}
	
	abstract int wheel();
	
	abstract String type2();

}

class car extends vehicle{
	
	int wheel() {
		do
		{
			System.out.print("Input wheel [4 <= wheel <= 6]: ");
			wheel = scan.nextInt();scan.nextLine();
		}while(wheel<4||wheel>6);
		return wheel;
	}
	
	String type2() {
		do
		{
			System.out.print("Input type [SUV | Supercar | Minivan]: ");
			type2 = scan.nextLine();
		}while(!type2.equals("SUV") && !type2.equals("Supercar") && !type2.equals("Minivan") );
		return type2;
	}
	
	public int entertainment() {
		do
		{
			System.out.print("Input entertainment system amount [>= 1]: ");
			entertainment = scan.nextInt();scan.nextLine();
		}while(entertainment<1);
		return entertainment;
	}

}

class motorcycle extends vehicle{
	
	int wheel() {
		do
		{
			System.out.print("Input wheel [2 <= wheel <= 3]: ");
			wheel = scan.nextInt();scan.nextLine();
		}while(wheel<2||wheel>3);
		return wheel;
	}
	
	String type2() {
		do
		{
			System.out.print("Input type [Automatic | Manual]: ");
			type2 = scan.nextLine();
		}while(!type2.equals("Automatic") && !type2.equals("Manual"));
		return type2;
	}
	
	public int helm() {
		do
		{
			System.out.print("Input helm [>= 1]: ");
			helm = scan.nextInt();scan.nextLine();
		}while(helm<1);
		return helm;
	
	}

	}

public class Main{

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		ArrayList<List> Alist = new ArrayList<List>();
		List daftar = new List();
		String type;
		String mybrand, myname, mylicense, mytype2;
		int choose, mytopspeed, mygascap, mywheel, myentertainment, myhelm;
		
		do
		{
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.print("Choose: ");
			choose = scan.nextInt();scan.nextLine();
		
		if(choose==1)
		{
			do
			{
				System.out.println("Input type [Car | Motorcycle]: ");
				type = scan.nextLine();
			}while(!type.equals("Car") && !type.equals("Motorcycle"));
			daftar.Type = type;
			
		
			if(type.equals("Car"))
			{
				car Mobil = new car();
				Mobil.brand();
				mybrand = Mobil.brand;
				Mobil.name();
				myname = Mobil.name;
				Mobil.license();
				mylicense = Mobil.license;
				Mobil.topspeed();
				mytopspeed = Mobil.topspeed;
				Mobil.gascap();
				mygascap = Mobil.gascap;
				Mobil.wheel();
				mywheel = Mobil.wheel;
				Mobil.type2();
				mytype2 = Mobil.type2;
				Mobil.entertainment();	
				myentertainment = Mobil.entertainment;
				
				daftar.Brand = mybrand;
				daftar.entertainment = myentertainment;
				daftar.Name = myname;
				daftar.License = mylicense;
				daftar.topspeed = mytopspeed;
				daftar.gascap = mygascap;
				daftar.wheel = mywheel;
				daftar.Type2 = mytype2;
				Alist.add(daftar);
			}
			else if(type.equals("Motorcycle"))
			{
				motorcycle Motor = new motorcycle();
				Motor.brand();
				mybrand = Motor.brand;
				Motor.name();
				myname = Motor.name;
				Motor.license();
				mylicense = Motor.license;
				Motor.topspeed();
				mytopspeed = Motor.topspeed;
				Motor.gascap();
				mygascap = Motor.gascap;
				Motor.wheel();
				mywheel = Motor.wheel;
				Motor.type2();
				mytype2 = Motor.type2;
				Motor.helm();
				myhelm = Motor.helm;
				
				daftar.Brand = mybrand;
				daftar.helm = myhelm;
				daftar.Name = myname;
				daftar.License = mylicense;
				daftar.topspeed = mytopspeed;
				daftar.gascap = mygascap;
				daftar.wheel = mywheel;
				daftar.Type2 = mytype2;
				Alist.add(daftar);
			}
			
			
			System.out.println("ENTER to return");
			scan.nextLine();
			
		}
		else if(choose==2)
		{
			int i, price;
			System.out.println("-----------------------------------");
			System.out.printf("%5s %10s %10s", "No", "Type", "Name");
			System.out.println();
			System.out.println("-----------------------------------");
			for(int a = 0; a<Alist.size(); a++)
			{
			System.out.format("%5d %10s %10s", (a+1), Alist.get(a).Type, Alist.get(a).Name);
			System.out.println();
			System.out.println("----------------------------------");
			}
			System.out.println("Pick a vehicle number to test drive[Enter '0' to exit]: ");
			i = scan.nextInt();scan.nextLine(); 
			System.out.println("Brand: "+Alist.get(i-1).Brand);	
			System.out.println("Name: "+Alist.get(i-1).Name);	
			System.out.println("License Plate: "+Alist.get(i-1).License);	
			System.out.println("Type: "+Alist.get(i-1).Type2);	
			System.out.println("Gas Capacity: "+Alist.get(i-1).gascap);	
			System.out.println("Top Speed: "+Alist.get(i-1).topspeed);	
			System.out.println("Wheel(s): "+Alist.get(i-1).wheel);	
			
			if(Alist.get(i-1).Type.equals("Car"))
			{
			System.out.println("Entertainment System: "+Alist.get(i-1).entertainment);	
			System.out.println("Turning on entertainment system. . .");
				if(Alist.get(i-1).Type2.equals("Supercar")) System.out.println("Boosting!");
			}
			else if(Alist.get(i).Type.equals("Motorcycle"))
			{
			System.out.println("Helm: "+Alist.get(i-1).helm);	
			System.out.println(Alist.get(i-1).Name+" is standing!");
			System.out.print("Helm price: ");
			price = scan.nextInt();scan.nextLine();
			System.out.println("Price: "+price);
			}
		}
		}while(choose!=3);
		
		
		
		
	
	}

}
