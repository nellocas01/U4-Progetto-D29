package com.example.U4ProgettoD29.factory;

import com.example.U4ProgettoD29.proxy.FireProbe;

public abstract class FireProbeFactory {
	public abstract FireProbe createFireProbe(double latitude, double longitude, double smokeLevel);

}
