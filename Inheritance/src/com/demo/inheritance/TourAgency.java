package com.demo.inheritance;

public class TourAgency {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"rutu","tata","m",true);
		Car car=new Car();
		car.reserveSeat(customer);
		car.listSeats();
		
		System.out.println("............");
         Bus bus=new Bus();
         bus.reserveSeat(customer);
         bus.listSeats();
         
         System.out.println("...............");
         Plane plane=new Plane();
         plane.reserveSeat(customer);
         plane.listSeats();
	}

}
