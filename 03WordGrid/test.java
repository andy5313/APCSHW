import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class test{
    public static void main(String[] args) throws FileNotFoundException{
        if (args.length>1 && args.length<5){
	    if (args.length==2){
		WordGrid w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		w.loadWordsFromFile("WordList.txt",true);
		System.out.println( "Find these words:\n" + w.wordsInPuzzle() );
		System.out.println(w);
	    }else if (args.length==3) {
		WordGrid w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Long.parseLong(args[2]));
		w.loadWordsFromFile("WordList.txt",true);
		System.out.println( "Find these words:\n" + w.wordsInPuzzle() );
		System.out.println(w);
	    }else{
		if (args[3].equals("1")){
		    WordGrid w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Long.parseLong(args[2]));
		    w.loadWordsFromFile("WordList.txt",false);
		    System.out.println( "Find these words:\n" + w.wordsInPuzzle() );
		    System.out.println(w);
			}else{
		    WordGrid w = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Long.parseLong(args[2]));
		    w.loadWordsFromFile("WordList.txt",true);
		    System.out.println( "Find these words:\n" + w.wordsInPuzzle() );
		    System.out.println(w);
		}
	    }
	}else {
	    System.out.println("Type <rows> <cols> <seed> <1>");
	}
    }
}
	
       

