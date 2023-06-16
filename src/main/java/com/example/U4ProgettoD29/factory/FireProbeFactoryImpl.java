package com.example.U4ProgettoD29.factory;

import org.springframework.stereotype.Component;

import com.example.U4ProgettoD29.proxy.FireProbe;
import com.example.U4ProgettoD29.proxy.FireProbeImpl;
import com.example.U4ProgettoD29.proxy.FireProbeProxy;

@Component
public class FireProbeFactoryImpl extends FireProbeFactory {
	@Override
	public FireProbe createFireProbe(double latitude, double longitude, double smokeLevel) {
		return new FireProbeProxy(new FireProbeImpl(latitude, longitude, smokeLevel));
	}

}
