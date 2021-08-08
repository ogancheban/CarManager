package com.Ogancheban.carmanager;

public interface Serviceable {
	
	public abstract boolean isReadyToService();
	public int getDitanceOnService();
	public void addDistance(double additinalDistance);
	public void addDistance(int additinalDistance);
}
