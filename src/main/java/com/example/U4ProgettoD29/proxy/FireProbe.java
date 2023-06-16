package com.example.U4ProgettoD29.proxy;

import com.example.U4ProgettoD29.observer.FireAlarm;

public interface FireProbe {
	public double getLatitude();

	public double getLongitude();

	public double getSmokeLevel();

	public void addListener(FireAlarm listener); // New method to add a listener

	public void triggerFireAlarm();
}
