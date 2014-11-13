import java.util.*;

public class ArrayListMethods {

    public static void collapseDuplicates( ArrayList<Integer> L ){
	int i = 0;
	while (i<L.size()-1){
	    if ((int)L.get(i)==(int)L.get(i+1)) L.remove(i+1);
	    i++;
	}
    }

    public static void randomize (ArrayList<Integer> L){
	Random rand = new Random();
	int i = 0;
	while (i<L.size()){
	    int randomNumber = rand.nextInt(L.size());
	    int swap = L.get(i);
	    L.set(i,L.get(randomNumber));
	    L.set(randomNumber, swap);
	    i++;
	}
    }

    public static void main(String[]args) {
	ArrayList<Integer> L = new ArrayList<Integer>();
	L.add(new Integer(1));
	L.add(new Integer(1));
	L.add(new Integer(0));
	L.add(new Integer(1));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(2));
	L.add(new Integer(3));
	System.out.println(L);
	collapseDuplicates(L);
	System.out.println(L);
	randomize(L);
	System.out.println(L);
    }
}
