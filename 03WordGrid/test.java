import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class test{
    public static void main(String[] args) throws FileNotFoundException{
	WordGrid w = new WordGrid(20,20);
	w.loadWordsFromFile("WordList.txt",false);
        System.out.println( "Find these words:\n" + w.wordsInPuzzle() );
	System.out.println(w);
	
    }
}

