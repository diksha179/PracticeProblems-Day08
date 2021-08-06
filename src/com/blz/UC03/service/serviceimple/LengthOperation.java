package com.blz.UC03.service.serviceimple;

import com.blz.UC03.dto.userInputs;

	public class LengthOperation implements LengthInterface {
	    userInputs obj = new userInputs();
	    public double lenLineOne() {
	        double lenFirstLine = Math.sqrt((Math.pow((obj.getX2() - obj.getX1()), 2)) + (Math.pow((obj.getY2() - obj.getY1()), (2))));
	        return lenFirstLine;
	    }
	    public double lenLineTwo() {
	        double lenSecondLine = Math.sqrt((Math.pow((obj.getX2() - obj.getX1()), 2)) + (Math.pow((obj.getY2() - obj.getY1()), (2))));
	        return lenSecondLine;
	    }
	    public void compare(){

	    }
	
}
