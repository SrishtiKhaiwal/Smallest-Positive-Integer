package Srishti.com;

public class LowestPositiveInteger {
	public static void main(String args[])
	
	{
		int arr[]= {1,3,6,10,11,15};
		
		int n=arr.length;
int small =0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n-i-1;j++)
	{
	if(arr[j]>arr[j+1])
	{
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}
	}
}
		
		
		for(int i=0;i<n;i++) { System.out.print(arr[i]+" "); } 
		 
		for(int i=0;i<n-1;i++)
		{
			
			if(arr[i]<0 && arr[i+1]>0 && arr[i+1]!=1)
			{
			small=1;	
			break;
			}
			else if(arr[i]>0 && arr[i]-arr[i+1]<-1)
			{
				
				small=arr[i]+1;
				break;
			}
			else
				small=arr[n-1]+1;
		}
		
		
		System.out.println("\n"+small);
		

			}
		}
