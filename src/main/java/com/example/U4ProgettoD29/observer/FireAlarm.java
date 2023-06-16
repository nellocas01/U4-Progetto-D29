package com.example.U4ProgettoD29.observer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.U4ProgettoD29.proxy.FireProbe;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class FireAlarm {
	private int fireAlarmId;
	private int smokeLevel;
	private double latitude;
	private double longitude;
	private List<Observer> observers = new ArrayList<>();

	public void FireAlarm(double latitude, double longitude) {
		super();
		setFireAlarmId(10);
		this.latitude = latitude;
		this.longitude = longitude;
	};

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		alertObservers();
	}

	public void alertObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
