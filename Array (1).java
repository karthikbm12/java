public class Array
{
public static void main(String[] args)
	{
	byte byteArray[] = {1,2,3};
	int intArry[] = {1,2,3,4,5,6};
	short shortArray[] = {10,20,30,40,50};
	long longArray[] = {100L,200L,300,400l};
	float floatArray[] = {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f};
	double doubleArray[] = {1.11,1.22,1.33,1.44,1.55,1.66};
	boolean booleanArray[] = {true, false, true};
	char charArray[] = {'A','B','C','D','E'};
	String stringArray[] = {"Array1","Array2","Array3","Array4"};
	
	System.out.println("The Byte Array are :"+byteArray.length);
	System.out.println("The Int Array are :"+intArry.length);
	System.out.println("The Short Array are :"+shortArray.length);
	System.out.println("The Long Array are :"+longArray.length);
	System.out.println("The Float Array are :"+floatArray.length);
	System.out.println("The Double Array are :"+doubleArray.length);
	System.out.println("The Boolean Array are :"+booleanArray.length);
	System.out.println("The Char Array are :"+charArray.length);
	System.out.println("The String Array are :"+stringArray.length);
	
	for(int a=0 ; a<byteArray.length ; a++)
		{
		System.out.println("The Byte Array are :"+byteArray[a]);
		} 
		for(int b=0 ; b<intArry.length ; b++)
			{
			System.out.println("The Int Array are :"+intArry[b]);
			}
			for(int c=0 ; c<shortArray.length ; c++)
				{
			    System.out.println("The Short Array are :"+shortArray[c]);
				}
				for(int d=0 ; d<longArray.length ; d++)
					{
					System.out.println("The Long Array are :"+longArray[d]);
					}
					for(int e=0 ; e<floatArray.length ; e++)
						{
						System.out.println("The Float Array are :"+floatArray[e]);
						}
						for(int f=0 ; f<doubleArray.length ; f++)
							{
							System.out.println("The Double Array are :"+doubleArray[f]);
							}
							for(int g=0 ; g<booleanArray.length ; g++)
								{
								System.out.println("The Boolean Array are :"+booleanArray[g]);
								}
								for(int h=0 ; h<charArray.length ; h++)
									{
									System.out.println("The Char Array are :"+charArray[h]);
									}
									for(int i=0 ; i<stringArray.length ; i++)
										{
										System.out.println("The String Array are :"+stringArray[i]);
										}
	}
}