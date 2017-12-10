package q_8_16;

public class HugeInteger
{
	
	private int digitArray[];
	final static int MAX_INT_SIZE = 40; 
	

	public HugeInteger()
	{

		 digitArray = new int[MAX_INT_SIZE];
	}
	

	public HugeInteger(String value)
	{
		this();
		this.parse(value);
	}
	

	public int getDigit(int digit)
	{
		return this.getIndex(MAX_INT_SIZE - digit);
	}
	

	public int getIndex(int index)
	{
		if( (index < MAX_INT_SIZE) && (index >= 0))
		{
			return this.digitArray[index];
		}
		
		else
		{

			System.out.println("getIndex failed: index out of bounds");

			return -1;
		}
	}
	

	private void setDigit(int digit, int value)
	{
		this.setIndex((MAX_INT_SIZE-digit), value);
	}
	

	private void setIndex(int index, int value)
	{
		if( (index < MAX_INT_SIZE) && (index >= 0))
		{
			if( (value < 10) && (value >= 0))
			{
				this.digitArray[index] = value;
			}
			
			else
			{

				System.out.println("setIndex failed: value should be an integer in the range 0-9.");
			}
		}
		
		else
		{

			System.out.println("setIndex failed: index out of bounds.");
		}
	}

	public void parse(String value)
	{
		if( (value.length() <= MAX_INT_SIZE) && (value.length() > 0))
		{	
			for(int counter = 1; counter <= value.length(); counter++)
			{

				int charDigit = value.length() - counter;

				if( Character.isDigit( value.charAt( charDigit ) ) )
				{

					this.setDigit(counter, 
						Character.getNumericValue(value.charAt(charDigit)));
				}
				
				else
				{

					System.out.println("parse failed: value must consist of numeric characters only.");
				}
			}
		}
		
		else
		{

			System.out.printf("parse failed: value must contain %d or fewer characters", MAX_INT_SIZE);
		}
	}

	public void add(HugeInteger addend)
	{
		int sum = 0;
		int carry = 0;
		
		for(int counter = 1; counter <= MAX_INT_SIZE; counter++)
		{
			sum =  this.getDigit(counter) + addend.getDigit(counter) + carry;
			
			if(sum < 10)
			{
				this.setDigit(counter, sum);
				carry = 0;
			}
			
			else
			{
				this.setDigit(counter, (sum-10));
				carry = 1;
			}
		}

		if(carry != 0)
		{
			System.out.println("addition result is incorrect: an overflow occurred");
		}
	}
	

	public void subtract(HugeInteger subtrahend)
	{	
		int difference = 0;
		int borrow = 0;

		if(this.isGreaterThanOrEqualTo(subtrahend))
		{
			for(int counter = 1; counter <= MAX_INT_SIZE; counter++)
			{
				difference = this.getDigit(counter) - subtrahend.getDigit(counter) - borrow;
				
				if(difference >= 0)
				{
					this.setDigit(counter, difference);
					borrow = 0;
				}
				
				else
				{
					this.setDigit(counter, (difference+10));
					borrow = 1;
				}
			}
		}

		else
		{

			System.out.println("subtraction failed: result would be negative");
		}
	}
		
		

	public boolean isZero()
	{
		for(int counter = 0; counter < MAX_INT_SIZE; counter++)
		{

			if(this.getIndex(counter) != 0)
			{
				return false;
			}
		}
		

		return true;
	}
	

	public boolean isEqualTo(HugeInteger argument)
	{	
		for(int counter = 0; counter <MAX_INT_SIZE; counter++)
		{
			if(this.getIndex(counter) != argument.getIndex(counter))
			{

				return false;
			}
		}
		

		return true;
	}
	

	public boolean isNotEqualTo(HugeInteger argument)
	{

		return !(isEqualTo(argument));
	}
	

	public boolean isGreaterThan(HugeInteger argument)
	{
		int counter = 0;
		while( (this.getIndex(counter) == argument.getIndex(counter)) && (counter < MAX_INT_SIZE) )
		{
			counter++;
		}
		
		if(counter == MAX_INT_SIZE)
		{
			return false;
		}
		
		else
		{
			return (this.getIndex(counter) > argument.getIndex(counter));
		}
	}
	
		public boolean isGreaterThanOrEqualTo(HugeInteger argument)
	{

		return (this.isEqualTo(argument) || this.isGreaterThan(argument));
	}
	

	public boolean isLessThan(HugeInteger argument)
	{
		int counter = 0;
		while( (this.getIndex(counter) == argument.getIndex(counter)) && (counter < MAX_INT_SIZE) )
		{
			counter++;
		}
		
		if(counter == MAX_INT_SIZE)
		{
			return false;
		}
		
		else
		{
			return (this.getIndex(counter) < argument.getIndex(counter));
		}
	}

	public boolean isLessThanOrEqualTo(HugeInteger argument)
	{

		return (this.isEqualTo(argument) || this.isLessThan(argument));
	}
	

 public String toString()
	{

		
		StringBuffer stringValue = new StringBuffer(MAX_INT_SIZE);
		

		for (int counter = 0; counter < MAX_INT_SIZE; counter++)
		{

			stringValue.append(this.getIndex(counter));
		}

		return stringValue.toString();
	}
	

	public String toShortString()
	{
		
		StringBuffer stringValue = new StringBuffer(MAX_INT_SIZE);
		

		if( this.isZero() )
		{
			stringValue.append(0);
		}
		

		else
		{

			int counter = 0;
			
			while( (this.getIndex(counter) == 0) && (counter < MAX_INT_SIZE) ) 
			{
				counter++;
			}
			
			for( ; counter < MAX_INT_SIZE; counter++)
			{
				stringValue.append(this.getIndex(counter));
			}
		}
		
		return stringValue.toString();
	}
}