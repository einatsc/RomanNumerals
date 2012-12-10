
public class RomanNumerals {

	public String toRoman(int number)
	{
		String value="";
		
		if (number > 499)
		{
			value = value + "D";
			number = number - 500;
		}

		
		if (number > 399)
		{
			value = value + "CD";
			number = number - 400;
		}

		while (number > 99)
		{
			value = value + "C";
			number = number - 100;
		}

		if (number > 89) 
		{
			value = value + "XC";
			number = number - 90;
		}
		
		if (number > 49)
		{
			value = value + "L";
			number = number - 50;
		}
		
		if (number > 39)
		{
			value = value + "XL";
			number = number - 40;
		}
		while (number > 9)
		{
			value = value + "X";
			number = number - 10;
		}

		if (number > 8)
		{
			value = value + "IX";
			number = number - 9;
		}

		if (number > 4)
		{
			value = value + "V";
			number = number - 5;
		}
		
		if (number > 3) 
		{
			value = value + "IV";
			number = number - 4;
		}

		while (number > 0)
		{
			value = value + "I";
			number = number - 1;
		}
		
		
		return value;
	}

}
