package com.example.U4ProgettoD29.proxy;

public class FireProbeFactoryImpl extends FireProbeFactory {
	@Override
	public FireProbe createFireProbe(double latitude, double longitude, double smokeLevel) {
		return new FireProbeProxy(new FireProbeImpl(latitude, longitude, smokeLevel));
	}

}
