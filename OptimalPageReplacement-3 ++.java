
import java.util.*;
public class optimal {
 public static void main(String[] args) 
 {
	int counter,n,frames,pagefault=0,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of pages :");
	n=sc.nextInt();
	System.out.println("Enter the refrence string : ");
	int pages[]=new int[n];
	
	for(int i=0;i<n;i++) {
		pages[i]=sc.nextInt();
	}
	System.out.println("Enter the no of frames :");
	frames=sc.nextInt();
	int frm[]=new int[frames];
	int whn[]=new int [frames];
	for(int i=0;i<frames;i++) {
		frm[i]=pages[i];
		whn[i]=0;
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<frames;j++) {
			if(frm[j]==pages[i]) {
				flag=1;
				break;
			}
			else
				flag=0;
		}
		if(flag==0) {
		for(int j=0;j<frames;j++) {
			for(int k=i+1;k<n;k++) {
				if(frm[j]==pages[k]) {
					whn[j]=k;
				}
				else
					whn[j]=0;
			}
		}
		counter=fun1(whn,frames);
		frm[counter]=pages[i];
		pagefault++;
	}
}
	pagefault=pagefault+frames;
	System.out.println("Page faults is : "+pagefault);
	System.out.println("Page hits are : "+(n-pagefault));
	sc.close();
	
}

 
 
 static int fun1(int whn[],int frames) {
	 int counter=0;
	 for(int i=1;i<frames;i++) 
	if((whn[i]>whn[i-1])&&(whn[i]!=0)) 
	counter=i;
	 
	 return counter;
 }
}
