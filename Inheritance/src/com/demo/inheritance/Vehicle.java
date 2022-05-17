package com.demo.inheritance;

public class Vehicle {
	private String manufacturer;
	protected String plate;
	protected String destination;
	
	protected Customer seats[][] =new Customer[0][0];
	protected void listSeats() {
		int i,j=0;
		  
		  for(int i1=0; i1<seats.length; i1++) {
			  for(int j1=0; j1<seats[i1].length;j1++) {
				  if(seats[i1][j1]==null) {
					  System.out.println("empty");
				  }else {
					  System.out.println(seats[i1][j1].getName()+" "+seats[i1][j1].getSurname());
					  
					  
				  }
			  }
		  }
				  
					  //seats[i][j]=c;
		
		
	}
	
  protected String reserveSeat(Customer c) {
	  int i = 0,j=0;
	  
	  for(int i1=0; i1<seats.length; i1++) {
		  for(int j1=0; j1<seats[i1].length;j1++) {
			  if(seats[i1][j1]==null) {
				  seats[i1][j1]=c;
			  break;
		  }
	  }
  }
  int seat = (i-1) * seats[0].length + j;
	  return seat + "";
  }
	 public String getManufacturer() {
		  return "manufacturer";
	  }
	public void setManufacturer(String manufacturer) {
		this.manufacturer=manufacturer;
	}
}

