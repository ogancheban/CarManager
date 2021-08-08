package com.Ogancheban.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassengerCar prius = new PassengerCar("Toyota Prius", 15000, 2008, 1200, Color.GREEN);
			
		//_________________
		Bus renualt = new Bus("Renault Laguna", 9700, 2000, 1600, Color.WHITE);
		Bus renualt2 = new Bus("Renault Laguna", 9700, 2000, 1600, Color.WHITE);
	List<Car> cars = new ArrayList<Car>();		
	cars.add(prius);
	cars.add(renualt);
	cars.add(renualt2);
	System.out.println(cars);
		prius.addDistance(1000); 
		prius.addDistance(200.9);
		prius.addDistance(15000);
		renualt.addDistance(15000);
		
		
		
		System.out.println(prius);
		
		System.out.println(renualt2);
		System.out.println(prius.equals(renualt2));
		System.out.println(renualt.equals(renualt2));
		System.out.println(prius.isReadyToService());
		System.out.println(renualt.isReadyToService());
		}

}
