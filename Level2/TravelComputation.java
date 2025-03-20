import java.util.Scanner;
public class TravelComputation{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    String name = sc.next();
	    String fromCity = sc.nextLine();
          String viaCity = sc.nextLine();
          String toCity = sc.nextLine();
	    float distancefromToVia = sc.nextFloat();
	    float distanceviaToFinalCity = sc.nextFloat();
	    float totalDistance = distancefromToVia + distanceviaToFinalCity;
	    int timefromToVia = sc.nextInt();
	    int timeViaToFinalCity = sc.nextInt();
	    int totalTime = timefromToVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
	}
}