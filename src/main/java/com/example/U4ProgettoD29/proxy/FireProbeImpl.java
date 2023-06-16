package com.example.U4ProgettoD29.proxy;

import java.util.ArrayList;
import java.util.List;

import com.example.U4ProgettoD29.observer.FireAlarmListener;

public class FireProbeImpl implements FireProbe {
	private double latitude;
	private double longitude;
	private double smokeLevel;
	private List<FireAlarmListener> listeners;

	public FireProbeImpl(double latitude, double longitude, double smokeLevel) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
		this.listeners = new ArrayList<>();

	}

	@Override
	public double getLatitude() {
		// TODO Auto-generated method stub
		return latitude;
	}

	@Override
	public double getLongitude() {
		// TODO Auto-generated method stub
		return longitude;
	}

	@Override
	public double getSmokeLevel() {
		// TODO Auto-generated method stub
		return smokeLevel;
	}/*
		 * 
		 * @Override public void addListener(FireAlarmListener listener) { // TODO
		 * Auto-generated method stub listeners.add(listener);
		 * 
		 * }
		 */

	@Override
	public void triggerFireAlarm() {
		// TODO Auto-generated method stub
		double smokeLevel = getSmokeLevel();
		for (FireAlarmListener listener : listeners) {
			listener.onFireAlarm(this, smokeLevel);
		}

	}

}
