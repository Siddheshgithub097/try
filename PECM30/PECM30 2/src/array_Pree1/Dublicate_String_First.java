package array_Pree1;

public class Dublicate_String_First {

	public static void main(String[] args) 
	{
		String array[]= {"hi","hello","hello","harry","kevin","speed","Pree","Avengers","tom","tom","Tom","Pree",};
		
		for (int i = 0; i < array.length; i++) 
		{
			int count = 0 ;
			if(array[i]!=null)
			{
				
				for (int j = i+1; j < array.length; j++) 
				{
					if(array[i].equals(array[j]))
					{	
					count++;
					array[j]=null; }
				}
			}
			
			if(count!=0)
			{
				System.out.println(array[i]+ " ");
				return;
			}
			
		}

	}

}
