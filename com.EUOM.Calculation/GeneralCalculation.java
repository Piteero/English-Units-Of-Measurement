package com.EUOM.Calculation;

import java.util.Scanner;

import com.EUOM.View.ViewText;

public class GeneralCalculation
{

	private int pickFromMenu;
	private int secondPick;
	private double value;

	public void runProgram()
	{
		GeneralCalculation newObject = new GeneralCalculation();
		newObject.chooseFromMenu();
	}

	public void chooseFromMenu()
	{
		LengthUnit lengthUnit = new LengthUnit();
		VolumeUnit volumeUnit = new VolumeUnit();
		WeightUnit weightUnit = new WeightUnit();
		GeneralCalculation generalCalculation = new GeneralCalculation();
		ViewText.showIntroduction();
		Scanner scanner = new Scanner(System.in);
		ViewText.showMenu();
		pickFromMenu = scanner.nextInt();
		switch (pickFromMenu)
		{
		case 1:
			chooseInchFromLengthUnit(lengthUnit, scanner);
			break;

		case 2:
			chooseFootFromLengthUnit(lengthUnit, scanner);
			break;

		case 3:
			chooseYardFromLengthUnit(lengthUnit, scanner);
			break;

		case 4:
			chooseFluidOnceFromVolumeUnit(volumeUnit, scanner);
			break;

		case 5:
			choosePintFromVolumeUnit(volumeUnit, scanner);
			break;

		case 6:
			chooseGallonFromVolumeUnit(volumeUnit, scanner);
			break;

		case 7:
			chooseOunceFromWeightUnit(weightUnit, scanner);
			break;

		case 8:
			choosePoundFromWeightUnit(weightUnit, scanner);
			break;

		}
		scanner.close();
	}

	public void choosePoundFromWeightUnit(WeightUnit weightUnit, Scanner scanner)
	{
		if (pickFromMenu == 8)
		{
			ViewText.showCommutationWay();
			ViewText.showKilogramToPoundAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				weightUnit.kilogramToPound(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				weightUnit.poundToKilogram(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void chooseOunceFromWeightUnit(WeightUnit weightUnit, Scanner scanner)
	{
		if (pickFromMenu == 7)
		{
			ViewText.showCommutationWay();
			ViewText.showKilogramToOunceAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				weightUnit.kilogramToOunce(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				weightUnit.ounceToKilogram(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void chooseGallonFromVolumeUnit(VolumeUnit volumeUnit, Scanner scanner)
	{
		if (pickFromMenu == 6)
		{
			ViewText.showCommutationWay();
			ViewText.showLitreToGallonAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				volumeUnit.litreToGallon(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				volumeUnit.gallonToLitre(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void choosePintFromVolumeUnit(VolumeUnit volumeUnit, Scanner scanner)
	{
		if (pickFromMenu == 5)
		{
			ViewText.showCommutationWay();
			ViewText.showLitreToPintAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				volumeUnit.litreToPint(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				volumeUnit.pintToLitre(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void chooseFluidOnceFromVolumeUnit(VolumeUnit volumeUnit, Scanner scanner)
	{
		if (pickFromMenu == 4)
		{
			ViewText.showCommutationWay();
			ViewText.showLitreToFluidOunceAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				volumeUnit.litreToFluidOunce(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				volumeUnit.fluidOunceToLitre(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void chooseYardFromLengthUnit(LengthUnit lengthUnit, Scanner scanner)
	{
		if (pickFromMenu == 3)
		{
			ViewText.showCommutationWay();
			ViewText.showMeterToYardAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				lengthUnit.metreToYard(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				lengthUnit.yardToMetre(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void chooseFootFromLengthUnit(LengthUnit lengthUnit, Scanner scanner)
	{
		if (pickFromMenu == 2)
		{
			ViewText.showCommutationWay();
			ViewText.showMeterToFootAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				lengthUnit.metreToFoot(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				lengthUnit.footToMetre(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

	public void chooseInchFromLengthUnit(LengthUnit lengthUnit, Scanner scanner)
	{
		if (pickFromMenu == 1)
		{
			ViewText.showCommutationWay();
			ViewText.showMeterToCalAndReverse();
			secondPick = scanner.nextInt();
			if (secondPick == 1)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				lengthUnit.metreToInch(value);
			} else if (secondPick == 2)
			{
				ViewText.showWriteValue();
				value = scanner.nextDouble();
				ViewText.showResult();
				lengthUnit.inchToMetre(value);
			} else
			{
				System.out.println("nieprawidłowy wybór");
			}
		}
	}

}
