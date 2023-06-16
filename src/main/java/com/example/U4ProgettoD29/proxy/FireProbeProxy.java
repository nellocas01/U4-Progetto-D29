package com.example.U4ProgettoD29.proxy;

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
}
