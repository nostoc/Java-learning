 public class SimpleStartupTestDrive {
  public static void main(String[] args) {
	  
    int numOfGuesses = 0;
	GameHelper helper  = new GameHelper();
	SimpleStartup theStatrtup = new SimpleStartup();
	int randomNum = (int) (Math.random() * 5);
	
	int[] locations = {randomNum, randomNum+1,randomNum+2};
	theStatrtup.setLocationCells(locations);
	boolean isAlive = true;
	
	while(isAlive){
		int guess = helper.getUserInput("Enter a number");
		String result = theStatrtup.checkYourSelf(guess);
		numOfGuesses++;
		if(result.equals("kill")){
			isAlive=false;
			System.out.println("You took "+numOfGuesses+" guesses.");
		}
	}
  }
 }