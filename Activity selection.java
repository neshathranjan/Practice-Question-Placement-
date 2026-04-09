import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.print("Enter the number of activities:");
	int n=in.nextInt();
	int[] start =new int[n];
	int[] finish = new int[n];
	for(int i=0;i<n;i++){
	    System.out.print("Enter the start and finish activities "+i+" ");
	    start[i]=in.nextInt();
	    finish[i]=in.nextInt();
	}
	int lastFinish=finish[0];
	System.out.println("\nSelected activitites:");
	System.out.println("Activity 1 (start)="+start[0]+",Finish="+finish[0]+")");
	  for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinish) {
                System.out.println("Activity " + i+
                        " (Start=" + start[i] +
                        ", Finish=" + finish[i] + ")");
                lastFinish = finish[i];
            }
        }

    }
}
