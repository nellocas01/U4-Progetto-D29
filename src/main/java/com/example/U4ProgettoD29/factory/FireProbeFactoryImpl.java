package com.example.U4ProgettoD29.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.U4ProgettoD29.proxy.FireProbe;
import com.example.U4ProgettoD29.proxy.FireProbeImpl;
import com.example.U4ProgettoD29.proxy.FireProbeProxy;

public class FireProbeFactoryImpl {
	@Autowired
	FireProbeFactory fireProbeFactory;

	public FireProbe createFireProbe(double latitude, double longitude, double smokeLevel) {
		return new FireProbeProxy(new FireProbeImpl(latitude, longitude, smokeLevel));
	}

}
