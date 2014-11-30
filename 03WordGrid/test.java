import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class test{
    public static void main(String[] args) throws FileNotFoundException{
	boolean fillSpaces = true;
	WordGrid w = new WordGrid(20,20);
	if (args.length==3){
	    try{
		int rows=Integer.parseInt(args[0]);
		int cols=Integer.parseInt(args[1]);
	        w = new WordGrid(rows,cols);
		w.setSeed(Integer.parseInt(args[2]));
	    }catch(NumberFormatException e){
		System.err.println("Type <row> <col> <seed>");
		System.exit(1);
	    }
	}
	if (args.length==4){
	    fillSpaces =! args[3].equals("1");
	}
	w.loadWordsFromFile("WordList.txt",fillSpaces);
        System.out.println( "Find these words:\n" + w.wordsInPuzzle() );
	System.out.println(w);
	
    }
}

