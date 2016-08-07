

public class repeat {
	public static void main(String[] args) {
		int [] b=new int [5];
		for(int i=0;i<5;i++)
		{
			b[i]=Integer.parseInt(args[i]);
			
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=1+i;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.println(b[i]);
					System.exit(0);
				}
			}
		}
		
		
		
	}

}
