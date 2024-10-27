package com.kn.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		Pilot pilot= new Pilot("Flying beast");
		Airline airline= new Airline("emirates",pilot);
		airline.operation();
		//shutdown emirates
		airline=null;
		System.out.println("airline has been shutdown");
		pilot.fly();
	}

}
