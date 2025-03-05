//Maryalise, Da'mauze, Dakota

import java.util.Scanner; 

public class lab12final {
	
	public static void main(String[] args) {
	//scanner to get input and to use the scanner class
	
		Scanner input = new Scanner( System.in); 
		//menu for the user to choose sales route
		System.out.println("Sales Route Planner");
		System.out.println("1.Allendale" + " " +" " + "6.Lancaster");
		System.out.println("2.Charleston" + " "+ "" + "7.Manning");
		System.out.println("3.Columbia"+ " " + "  "+ "8.McCormick");
		System.out.println("4.Conway" + " " + "    " + "9.Pickens" );
		System.out.println("5.Florence" + " " + " " + "10.Spartenburg");
		
	
		
		
		
		
		   
		//assignment statements to assign the distances to a number to use as input
		int Allendale = 1;
		int Charleston = 2;
		int Columbia = 3;
		int Conway =4; 
		int Florence =5; 
	    int Lancaster =6;
		int Manning = 7;
		int McCormic = 8;
		int Pickens = 9;
		int Spartanburg = 10;
		// input statements 
		
		
		
	
		
          double [][] distances = {{0, 90, 76, 171, 136, 132, 89,99, 172, 158},
				                  {90,0,112,97,110,162,77,174,234,201 },
		                           { 76,112,0,130,80,61,63,76,121,93},
		                          { 171, 97,130,0,56,132,82,203,248,209},
		                          { 136, 110,80,56,0,76,44,157,202,153},
		                          {132, 162,61,132,76,0,87,125,128,77},
		                          { 89,77,63,82,44,87,0,139,184,152},
		                          {99, 174,76,203,157,125,139,0,83,87},
		                          {172, 234, 121,248,202,128,184,83,0,51},   
		                         {158, 201, 93, 209, 153, 77, 152, 87,51,0}
		                          
		                         
		};
        
  		System.out.println("Enter route waypoints seperated by a space:");
     double sum = 0;
     String location = input.nextLine();
     String[] route = location.split(" ");
     for (int i =0; i < route.length-1; i++) {
    	 int a = Integer.parseInt(route[i])-1;
    	 int b = Integer.parseInt(route[i+1])-1;
    	 sum +=distances[a][b];
    	 

		
     }
        			 
        			

		// output statements 
  
		
		
		System.out.println("Enter average fuel cost: ");
		double fuel= input.nextDouble();
		
		System.out.println("Enter average highway speed: ");
		int speed= input.nextInt();
		
		System.out.println("Enter vehicle MPG: ");
		double mpg= input.nextDouble();
 			
  			System.out.println("Total route distance is: " + " "+ sum +" " +"miles");
  			// MPG
  			double gas = Math.round((sum/mpg)*100) /100.0;
  			System.out.println("Anticipated gallons of fuel needed: " + gas + " "+ "gallons");
  			//fuel
  			
  		 double money = Math.round((sum/mpg)* fuel *100)/100.0;
  			System.out.println("Anticipated cost of fuel: $ "+money);
  			//speed
  		   double  hrs = (int )(sum/speed);
  			
  		    double conversion= Math.round((sum/speed)*60)*100/100.0/60;
  		    double mins = Math.round((conversion-hrs)*60)*100/100.0;
  			
  			System.out.println("Estimated driving time at " + " MPH is:" + " " + hrs+ " hours" + " "+ "and"+ " "+ mins +" "+ "minutes");
  			

  		
	}		
  			
  			
  		
  			
  	 
		
}





