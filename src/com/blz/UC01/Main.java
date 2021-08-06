package com.blz.UC01;

import com.blz.UC01.InputUtilities.InputUtilities;
import com.blz.UC01.dto.userInputs;
import com.blz.UC01.service.LengthInterface;
import com.blz.UC01.service.serviceimple.LengthOperation;

	public class Main {
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
	        System.out.println("Enter Line Co-ordinates ");
	        Coordinates();
	        System.out.println("Length of Line : " + obj.lenLineOne());
	    }
	}


