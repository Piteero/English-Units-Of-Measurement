package com.EUOM.View;

public class ViewText
{

	public static void showIntroduction()
	{
		System.out.println("Program służy do przeliczania jednostek miar brytyjskich. Wpisz liczbę odpowiadającą"
				+ " interesującej Cię mierze i wciśnij enter");
	}

	public static void showResult()
	{
		System.out.print("Wynik: ");
	}

	public static void showWriteValue()
	{
		System.out.println("Wpisz wartość: ");
	}

	public static void showMenu()
	{
		System.out.println("    Jednostki długości: \n[1] Cal (in) \n[2] Stopa (ft) \n[3] Jard (yd) \n"
				+ "    Jednostki objętości: \n[4] Uncja płynu (fl oz) \n[5] Półkwarta (pt) \n[6] Galon (gal) \n"
				+ "    Jednostki wagowe: \n[7] Uncja (oz) \n[8] Funt (lb)");
	}

	public static void showCommutationWay()
	{
		System.out.println("Wybierz sposób przeliczenia wpisując odpowiednią liczbę i wśnij enter:");
	}

	public static void showMeterToCalAndReverse()
	{
		System.out.println("[1] m -> in \n[2] in -> m");
	}

	public static void showMeterToFootAndReverse()
	{
		System.out.println("[1] m -> ft \n[2] ft ->m");
	}

	public static void showMeterToYardAndReverse()
	{
		System.out.println("[1] m -> yd \n[2] yd -> m");
	}

	public static void showLitreToFluidOunceAndReverse()
	{
		System.out.println("[1] l -> fl oz \n[2] fl oz -> l");
	}

	public static void showLitreToPintAndReverse()
	{
		System.out.println("[1] l -> pt \n[2] pt -> l");
	}

	public static void showLitreToGallonAndReverse()
	{
		System.out.println("[1] l -> gal \n[2] gal > l");
	}

	public static void showKilogramToOunceAndReverse()
	{
		System.out.println("[1] kg -> oz \n[2] oz ->kg");
	}

	public static void showKilogramToPoundAndReverse()
	{
		System.out.println("[1] kg -> lb \n[2] lb -> kg");
	}

}
