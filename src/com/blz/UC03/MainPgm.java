package com.blz.UC03;

	import com.blz.UC03.InputUtilities.InputUtilities;
	import com.blz.UC03.dto.userInputs;
	import com.blz.UC03.service.serviceimple.LengthInterface;
	import com.blz.UC03.service.serviceimple.LengthOperation;

	public class MainPgm {
	    public static userInputs inputs = new userInputs();
	    public static LengthInterface obj = new LengthOperation();
	    public static void Coordinates() {
	        System.out.print("Enter Your First Point Co-Ordinate x1 : ");
	        inputs.setX1(InputUtilities.intInput());
	        System.out.print("Enter Your First Point Co-Ordinate y1 : ");
	        inputs.setY1(InputUtilities.intInput());
	        System.out.print("Enter Your Second Point Co-Ordinate x2 : ");
	        inputs.setX2(InputUtilities.intInput());
	        System.out.print("Enter Your Second Point Co-Ordinate y2 : ");
	        inputs.setY2(InputUtilities.intInput());

	    }

	    public static void main(String[] args) {
	        System.out.println("Enter First Line Co-ordinates \n-----------------------------");
	        Coordinates();
	        float firstLineLength=(float)obj.lenLineOne();
	        System.out.println("Length of First Line : " + firstLineLength);
	        System.out.println("\nEnter Second Line Co-ordinates \n------------------------------");
	        Coordinates();
	        float secondLineLength=(float)obj.lenLineTwo();
	        System.out.println("Length of Second Line : " + secondLineLength);
	        compare(firstLineLength,secondLineLength);
	    }
	    public static void compare(float a,float b){
	        if (a>b){
	            System.out.println("\nFirst Line is greater in Length than Second Line");
	        }
	        if (a<b) {
	            System.out.println("\nSecond Line is greater in Length than First Line");
	        }
	        else {
	            System.out.println("\nBoth First and Second Lines are EQUAL in Length");
	        }
	    }
	}


