package com.EUOM.Calculation;

public class VolumeUnit
{

	private double litre;
	private double fluidOunce;
	private double pint;
	private double gallon;
	private final double LITRE_RATE_FL_OZ = 0.028413;
	private final double LITRE_RATE_PT = 0.568261;
	private final double LITRE_RATE_GAL = 4.546088;

	public void litreToFluidOunce(double litre)
	{
		fluidOunce = litre / LITRE_RATE_FL_OZ;
		System.out.printf("%.3f", fluidOunce);
		System.out.print(" fl oz");
	}

	public void fluidOunceToLitre(double fluidOunce)
	{
		litre = fluidOunce * LITRE_RATE_FL_OZ;
		System.out.printf("%.3f", litre);
		System.out.print(" l");
	}

	public void litreToPint(double litre)
	{
		pint = litre / LITRE_RATE_PT;
		System.out.printf("%.3f", pint);
		System.out.print(" pt");
	}

	public void pintToLitre(double pint)
	{
		litre = pint * LITRE_RATE_PT;
		System.out.printf("%.3f", litre);
		System.out.print(" l");
	}

	public void litreToGallon(double litre)
	{
		gallon = litre / LITRE_RATE_GAL;
		System.out.printf("%.3f", gallon);
		System.out.print(" gal");
	}

	public void gallonToLitre(double gallon)
	{
		litre = gallon * LITRE_RATE_GAL;
		System.out.printf("%.3f", litre);
		System.out.print(" l");
	}

}
