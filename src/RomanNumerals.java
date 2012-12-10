
public class RomanNumerals {

	public String toRoman(int number)
	{
		String value="";
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
