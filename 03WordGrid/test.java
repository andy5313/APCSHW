import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class test{
    public static void main(String[] args) throws FileNotFoundException{
	WordGrid w = new WordGrid(20,20);
	File text = new File("WordList.txt");
	Scanner scan = new Scanner(text);
	ArrayList<String> wordlist = new ArrayList<String>();
	while (scan.hasNextLine()){
	    String line = scan.nextLine();
	    wordlist.add(line);
	}
	Random rand = new Random();
	int decision = rand.nextInt(3);
	int randomY = rand.nextInt(w.getLength());
	int randomX = rand.nextInt(w.getLength(randomY));
	int i = 0;
	while (i<wordlist.size()){
	    if (decision == 0){
		int j = 0;
		while (j<10){
		    if (w.addWordHorizontal(wordlist.get(i), randomY, randomX)){
			break;
		    }
		    randomY = rand.nextInt(w.getLength());
		    randomX = rand.nextInt(w.getLength(0));
		    j ++;
		}		
	    }else if (decision == 1){
		int j = 0;
		while (j<10){
		    if (w.addWordVertical(wordlist.get(i), randomY, randomX)){
			break;
		    }
		    randomY = rand.nextInt(w.getLength());
		    randomX = rand.nextInt(w.getLength(0));
		    j ++;
		}
	    }else {
		int j = 0;
		while (j<10){
		    if (w.addWordDiagonal(wordlist.get(i), randomY, randomX)){
			break;
		    }
		    randomY = rand.nextInt(w.getLength());
		    randomX = rand.nextInt(w.getLength(0));
		    j ++;
		}
	    }
	    i++;
	    decision = rand.nextInt(3);
	    randomY = rand.nextInt(w.getLength());
	    randomX = rand.nextInt(w.getLength(0));
	}
	System.out.println(w);
    }
}

