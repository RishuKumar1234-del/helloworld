package javaPrograms.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ElectronicDevices implements Comparator<ElectronicDevices>{
	 String name;
	 int price;
	public ElectronicDevices(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int compare(ElectronicDevices o1, ElectronicDevices o2) {
		int price1=o1.price;
		int price2=o2.price;
		
   return o1.compare(o2, o1);

	}
	 
	 
	
}

public class CustomSrtingExample1 {

	public static void main(String[] args) {
		ArrayList<ElectronicDevices> list= new ArrayList<ElectronicDevices>();
		list.add(new ElectronicDevices("soldering iron", 15));
		list.add(new ElectronicDevices("Electric Iron", 700));
		list.add(new ElectronicDevices("Electronic Tester",10));
		list.add(new ElectronicDevices("5 plug switch", 20));
		
		//Collections.sort(list);
		list.forEach(e->{
			System.out.println(e.name +" : " +e.price);
		});


	
		





	}

}


