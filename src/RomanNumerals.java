
public class RomanNumerals {

	private int val[];
	private String romanChars[];
	
	//initial constructor
	/*
	public RomanNumerals()
	{
		val=new int[9];
		val[0]=100;	val[1]=90;  val[2]=50;
		val[3]=40;  val[4]=10;  val[5]=9;
		val[6]=5;   val[7]=4;   val[8]=1;
		
		romanChars=new String[9];
		romanChars[0]="C";  romanChars[1]="XC";  romanChars[2]="L";
		romanChars[3]="XL";  romanChars[4]="X";  romanChars[5]="IX";
		romanChars[6]="V";  romanChars[7]="IV";  romanChars[8]="I";
		
	}
	*/
	
	//final constructor for algorithm
	public RomanNumerals()
	{
		val=new int[13];
		val[0]=1000; val[1]=900; val[2]=500; val[3]=400;
		val[4]=100;	val[5]=90;  val[6]=50;
		val[7]=40;  val[8]=10;  val[9]=9;
		val[10]=5;   val[11]=4;   val[12]=1;
		
		romanChars=new String[13];
		romanChars[0]="M";  romanChars[1]="CM";  romanChars[2]="D";  romanChars[3]="CD";
		romanChars[4]="C";  romanChars[5]="XC";  romanChars[6]="L";
		romanChars[7]="XL";  romanChars[8]="X";  romanChars[9]="IX";
		romanChars[10]="V";  romanChars[11]="IV";  romanChars[12]="I";
		
	}
	
	public String toRoman(int number) {
		
		/*
		if (number == 1)
			return "I";
		if(number==2)
		{
			return "II";
		}
		else
			return "III";
			*/
		String romanNumeral="";
		for(int i=0;i<romanChars.length;i++)
		{
			while(number>=val[i])
			{
				number-=val[i];
				romanNumeral+=romanChars[i];
			}
		}
		return romanNumeral;
		
	}
}


