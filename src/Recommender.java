import java.util.ArrayList;
import java.util.HashMap;

public class Recommender {
	Tester tester;
	
	public Recommender(Tester t) {
		tester = t;
	}
	
	// This is automatically run before any tests.  You may use this method to do
	// any calculations you need to support your predictRating method.

	// NOTE:  to avoid cheating you must re-set any variables you use here
	// before you calculate their new values.
	public void init() {
		
	}

	public double predictRating(Person person, Movie movie) {
		return 2;
	}
}