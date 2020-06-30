package com.healthycoderapp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BMICalculatorTest {


@Test

public void isDietRecommendedTest()
{
	
 //Given
	
	double weight = 90;
	double height = 1.2;
	

 //When
	
	boolean DietRecommended = BMICalculator.isDietRecommended(weight, height);
 
 //Then
 
  assertTrue (DietRecommended);
}

@Test
public void print()
{
	fail ("No tests written");
}

}
