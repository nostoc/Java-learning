public class PhraseOmatic {
    public static void main (String[] args){

//make three sets of words to choose from
String[] wordListOne = {"agnostic", "opinionated", 
"voice activated", "haptically driven", "extensible", 
"reactive", "agent based", "functional", "AI enabled", 
"strongly typed"};

 String[] wordListTwo ={"loosely coupled", "six sigma", 
"asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", 
"microservices", "distributed ledger"};


String[] wordListThree =  {"framework", "library", 
"DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", 
"orientation"};


//finding out how many words are there in each list

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
	
//generate three random numbers
	
	java.util.Random randomGenerator = new java.util.Random();
	int random1 = randomGenerator.nextInt(oneLength);
	int random2 = randomGenerator.nextInt(twoLength);
	int random3 = randomGenerator.nextInt(threeLength);
	
//build a phrase
	String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];
	
	//printout the phrase
	System.out.println("What we need is a " +phrase);
	
	}
}
