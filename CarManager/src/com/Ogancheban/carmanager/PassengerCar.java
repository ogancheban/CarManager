package com.Ogancheban.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		// TODO Auto-generated method stub
		if (ditanceOnService > 10000) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
}
