package com.example.U4ProgettoD29.proxy;

import java.util.ArrayList;
import java.util.List;

import com.example.U4ProgettoD29.observer.FireAlarm;

public class FireProbeImpl implements FireProbe {
	private double latitude;
	private double longitude;
	private double smokeLevel;
	private List<FireAlarm> listeners;

	public FireProbeImpl(double latitude, double longitude, double smokeLevel) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
		listeners = new ArrayList<>();
	}

	@Override
	public double getLatitude() {
		return latitude;
	}

	@Override
	public double getLongitude() {
		return longitude;
	}

	@Override
	public double getSmokeLevel() {
		return smokeLevel;
	}

	@Override
	public void addListener(FireAlarm listener) {
		// TODO Auto-generated method stub
		listeners.add(listener);

	}

	@Override
	public void triggerFireAlarm() {
		// TODO Auto-generated method stub
		double smokeLevel = getSmokeLevel();
		for (FireAlarm listener : listeners) {
			listener.onFireAlarm(this, smokeLevel);
		}
	}

}
