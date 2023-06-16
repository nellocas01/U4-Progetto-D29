package com.example.U4ProgettoD29.proxy;

import com.example.U4ProgettoD29.observer.FireAlarm;

public class FireProbeProxy implements FireProbe {
	private FireProbeImpl probe;

	public FireProbeProxy(FireProbeImpl probe) {
		this.probe = probe;
	}

	@Override
	public double getLatitude() {
		return probe.getLatitude();
	}

	@Override
	public double getLongitude() {
		return probe.getLongitude();
	}

	@Override
	public double getSmokeLevel() {
		return probe.getSmokeLevel();
	}

	@Override
	public void addListener(FireAlarm listener) {
		probe.addListener(listener);
	}

	@Override
	public void triggerFireAlarm() {
		probe.triggerFireAlarm();
	}

}
