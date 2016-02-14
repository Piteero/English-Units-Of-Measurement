package com.EUOM.Calculation;

public class WeightUnit
{

	private double kilogram;
	private double ounce;
	private double pound;
	private final double KILOGRAM_RATE_OZ = 0.0283495;
	private final double KILOGRAM_RATE_LB = 0.45359237;

	public void kilogramToOunce(double kilogram)
	{
		ounce = kilogram / KILOGRAM_RATE_OZ;
		System.out.printf("%.3f", ounce);
		System.out.print(" oz");
	}

	public void ounceToKilogram(double ounce)
	{
		kilogram = ounce * KILOGRAM_RATE_OZ;
		System.out.printf("%.3f", kilogram);
		System.out.print(" kg");
	}

	public void kilogramToPound(double kilogram)
	{
		pound = kilogram / KILOGRAM_RATE_LB;
		System.out.printf("%.3f", pound);
		System.out.print(" lb");
	}

	public void poundToKilogram(double pound)
	{
		kilogram = pound * KILOGRAM_RATE_LB;
		System.out.printf("%.3f", kilogram);
		System.out.print(" kg");
	}

}
