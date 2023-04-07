package priyam;
//gg
public class q2 {
	
	
	public static void waveform(int a[]) {
		
		for(int i=0;i<a.length;i=i+2) {
			
			if(i>0 && a[i]<a[i-1]) 
			{
				int temp;
				temp =a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
				}
			
			if(i<a.length-1 && a[i]<a[i+1])
			{
				int temp;
				temp =a[i];
				a[i]=a[i+1];
				a[i+1]=temp;	
			}
		}
		for(int element:a) {
			System.out.println(element);
		}
	}
	public static int search(int a[], int x) {
		
		for(int i=0;i<a.length;i++) {
			
			if (a[i]== x) {
				return i;
			}
		}
		return -1;
	}
	
public static void main(String[] args) {
	
	int[] a = {10,30,40,90,60,80,100};
	
	waveform(a);
	
	System.out.println(search(a,80));
	
	
}
}
