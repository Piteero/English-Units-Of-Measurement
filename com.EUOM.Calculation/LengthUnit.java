package com.EUOM.Calculation;

public class LengthUnit
{

	private double metre;
	private double inch;
	private double foot;
	private double yard;
	private final double METRE_RATE_IN = 0.0254;
	private final double METRE_RATE_FT = 0.3048;
	private final double METRE_RATE_YD = 0.9144;

	public void metreToInch(double metre)
	{
		inch = metre / METRE_RATE_IN;
		System.out.printf("%.3f", inch);
		System.out.print(" in");
	}

	public void inchToMetre(double inch)
	{
		metre = inch * METRE_RATE_IN;
		System.out.printf("%.3f", metre);
		System.out.println(" m");
	}

	public void metreToFoot(double metre)
	{
		foot = metre / METRE_RATE_FT;
		System.out.printf("%.3f", foot);
		System.out.print(" ft");
	}

	public void footToMetre(double foot)
	{
		metre = foot * METRE_RATE_FT;
		System.out.printf("%.3f", metre);
		System.out.print(" m");
	}

	public void metreToYard(double metre)
	{
		yard = metre / METRE_RATE_YD;
		System.out.printf("%.3f", yard);
		System.out.print(" yd");
	}

	public void yardToMetre(double yard)
	{
		metre = yard * METRE_RATE_YD;
		System.out.printf("%.3f", metre);
		System.out.print(" m");
	}

}
