
public class RomanNumerals {

	public String toRoman(int number)
	{
		String value="";
		
		
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
