// Maryalise Lesley

import java.text.DecimalFormat;
//scanner is in the java util package
public class geometricfig {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please select the type of Volume Computation you would like to do by typing a 1 (Cylinder) , 2 (Sphere) ,or 3 (Cone) : ");
  double userinput = input.nextDouble();
  DecimalFormat df = new DecimalFormat("0.00");
		  if (userinput <= 3){
 double Cylinder = 1;
 double Sphere = 2;
 double Cone = 3;
 
		  }
 else 
	 System.out.print("Invalid selection please try again");
 
 if (userinput == 1) {
 System.out.print("Enter the radius of the cylinder: ");

 double cylradius = input.nextDouble();
 
 System.out.print(" Enter the height of the cylinder: ");

 double cylheight = input.nextDouble(); 
 
 double cylvolume = (Math.PI*(cylradius*cylradius)*cylheight);
 System.out.print("the volume of your cylinder is: " + ((cylvolume*100.0)/100.0));
 }
 else if (userinput == 2){
 
	 System.out.print("Enter the radius of the sphere: ");
	double spherrad = input.nextDouble();
 
	 double sphervolume = ((4.0/3.0)*Math.PI*(spherrad*spherrad*spherrad));
	 System.out.print("The volume of your sphere is: " + ((sphervolume*100.0)/100.0));
 }
 else if (userinput == 3) {
 
	 System.out.print("Enter the radius of the cone: ");
	 double conrad = input.nextDouble();
 
	 System.out.print(" enter the height of the cone: ");
	 double conheight =input.nextDouble();
 
	 double convolume = ((1.0/3.0)*Math.PI* (conrad*conrad)* conheight);
	 System.out.print(" The volume of your cone is: " +  df.format(convolume));
 }
 
 

 

		  
	}

}
