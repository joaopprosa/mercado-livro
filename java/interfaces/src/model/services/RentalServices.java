package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalServices() {
		
	}
	
	public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		double hour = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment = 0.0;
		
		if(hour <= 12) {
			basicPayment = Math.ceil(basicPayment) * pricePerHour;
		}else {
			basicPayment = Math.ceil(basicPayment) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
