public class EarthVolume{
	public static void main(String[] args){
		int radius_km = 6378;
		float radius_miles = (float) radius_km * 0.621371f;
		float volume_km = (float) (4.0f/3.0f) * 3.14f * (float) Math.pow(radius_km, 3);
		float volume_miles = (float) (4.0f/3.0f) * 3.14f * (float) Math.pow(radius_miles, 3);
		System.out.println("The volume of earth in cubic kilometers is "+volume_km+" and cubic miles is "+volume_miles);
	}
}