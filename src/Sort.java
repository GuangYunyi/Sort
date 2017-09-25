
public class Sort {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int[] arr=new int[15];
		
		// Create a random integer array
		System.out.println("current integer array=");
		for(i=0;i<15;i++) {
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Sort
		for (i=14;i>=0;i--) {
			for(j=0;j<i;j++) {
				if(arr[j]<arr[j+1]) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		for (i=0;i<15;i++)
			System.out.print(arr[i]+" ");
	}
}