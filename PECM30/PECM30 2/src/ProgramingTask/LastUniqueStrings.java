package ProgramingTask;

public class LastUniqueStrings 
{
	public static void main(String[] args) 
	{
		String s1[]= {"hiii","byee","hiii","thnk","hello","byee","nice"};
		for(int i=s1.length-1;i>=0;i--)
		{
			int count=0;
			if(s1[i]!=null)
			{
				for(int j=i+1;j<s1.length;j++)
				{
					if(s1[i].equals(s1[j]))
					{
						count++;
						s1[j]=null;
					}
				}
				if (count==0) 
				{
					System.out.println(s1[i]+" is last unique strings");
					return;
				}
			}
		}
	}
}
