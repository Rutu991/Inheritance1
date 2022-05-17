package com.demo.inheritance;

public class Plane extends Vehicle{
   public Plane() {
	   seats=new Customer[4][5];
   }
   protected void listSeats() {
		int i,j=0;
		  
		  for(int i1=0; i1<seats.length; i1++) {
			  for(int j1=0; j1<seats[i1].length;j1++) {
				  if(seats[i1][j1]==null) {
					  System.out.println("empty");
				  }else {
					  int seat = (i1) * seats[0].length + j +1;
				  
					  System.out.println(seats[i1][j1].getName()+" "+seats[i1][j1].getSurname());
					  
					  
				  }
			  }
		  }
				  

}
}