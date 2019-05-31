import java.util.ArrayList;
import java.util.Random;

public class Checkpoint {
public static void main(String[] args) {
ArrayList<Cow> hungryCows = new ArrayList<Cow>();
int numberOfCows = new Random().nextInt();
for (int i = 0; i < numberOfCows; i++) {
	Cow random = new Cow();
	hungryCows.add(random);
	
}
for (int i = 0; i < hungryCows.size(); i++) {
	Cow cow = new Cow();
	cow.feed();
	
	
}
}
}
class Cow {
    public void feed(){
    	System.out.println("fed");
    }
  }



