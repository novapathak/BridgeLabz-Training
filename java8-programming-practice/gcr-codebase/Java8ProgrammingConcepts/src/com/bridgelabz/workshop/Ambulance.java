package com.bridgelabz.workshop;

public class Ambulance implements TransportService, EmergencyService {

    public String getServiceName() { return "Ambulance"; }
    public double getFare() { return 0; }
    public String getRoute() { return "Emergency Route"; }
    public String getDepartureTime() { return "Immediate"; }
}
