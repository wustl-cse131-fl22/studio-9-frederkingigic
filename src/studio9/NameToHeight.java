package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, Double> mapNameToHeight= new HashMap<String,Double>();
		mapNameToHeight.put("Amelia", 65.0);
		mapNameToHeight.put("Tasha", 69.0);
		mapNameToHeight.put("Maeve", 66.0);
		boolean a=false;
		while(a==false) {
		System.out.println("What name do you want to look up?");
		String name = in.next();
		if(name.equals("quit")) {
			a=true;
		}
		else if(mapNameToHeight.containsKey(name)) {
		double height = mapNameToHeight.get(name);
		System.out.println(name+"'s height is "+height);
		}
		else {
			System.out.println("This name is not in the map. Please enter a new name.");
		}
		}
	}
	}
