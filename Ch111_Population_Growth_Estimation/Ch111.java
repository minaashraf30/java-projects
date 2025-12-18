public class Ch111{
	public static void main(String args []){
		long population = 312032486;
		long secondsInFiveYears = 5 * 365 * 24 * 60 * 60 ;
		long birthFiveYears = years / 7;
		long deathFiveYears = years / 13;
		long immigrantFiveYears = years / 45;
		long populationFiveYears = population +  birthFiveYears - deathFiveYears - immigrantFiveYears;
		System.out.println("population for next five years: " + populationFiveYears );
	}
}
