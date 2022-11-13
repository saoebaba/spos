import java.util.*;
class optimal
{
public static void main(String args[])
{
	int i,j,k,n,frames,mn,flag=0,pgfault=0;
	Scanner sc=new Scanner(System.in);
	//n--> no of pages
	
	System.out.println("Enter no of pages");
	n=sc.nextInt();
	System.out.println("enter page nos");
	int pages[]=new int[n];
	
	for(i=0;i<n;i++)
	{
		pages[i]=sc.nextInt();
	}
	System.out.println("Enter no of frames");
	frames=sc.nextInt();
	int frm[]=new int[frames];
	int whn[]=new int[frames];
	for(i=0;i<frames;i++)
	{
	frm[i]=pages[i];
	whn[i]=0;
	}
	for(;i<n;i++)
	{
		for(j=0;j<frames;j++)
		{
			if(frm[j]==pages[i])
			{
				flag=1;
				break;
			}
			else
				flag=0;
		}
	
		if(flag==0)
			{
			for(j=0;j<frames;j++)
				{
					for(k=i+1;k<n;k++)
					{
						if(frm[j]==pages[k])
							whn[j]=k;
						else
							whn[j]=0;
					}
			    } 
				mn=ltr(whn,frames);
				frm[mn]=pages[i];
				pgfault++;
		}
	}
pgfault=pgfault+frames;
System.out.println("Optimal algorithm");
System.out.println("page fault is:"+pgfault);
System.out.println("page hits are:"+(n-pgfault));
sc.close();

}
static int ltr(int whn[],int m)
{
int i,mn=0;
for(i=1;i<m;i++)
if((whn[i] > whn[i-1]) && (whn[i]!=0))
mn=i;
return mn;

}
}
