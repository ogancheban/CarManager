package com.Ogancheban.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		// TODO Auto-generated method stub
		if (ditanceOnService > 50000) {
			return true;
		}
		else {
			return false;
		}
	}

}
