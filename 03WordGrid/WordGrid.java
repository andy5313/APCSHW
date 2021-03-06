import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]grid;
    private ArrayList<String>words = new ArrayList<String>();
    private ArrayList<String>wordsInGrid = new ArrayList<String>();
    private Random rand = new Random();
   
    public WordGrid(int rows,int cols,long seed){
	grid = new char[rows][cols];
	rand.setSeed(seed);
	clear();
    }
    public WordGrid(int rows,int cols){
	grid = new char[rows][cols];
	clear();
    }
    public WordGrid(){
	grid = new char[20][20];
	clear();
    }
    public void clear(){
	int r = 0;
	while (r<grid.length){
	    int c = 0;
	    while (c<grid[r].length){
		grid[r][c] = '.';
		c ++;
	    }
	    r ++;
	}
    }
    public String toString(){
	String s = "";
	int r = 0;
	while (r<grid.length){
	    int c = 0;
	    while (c<grid[r].length){
		s += grid[r][c]+" ";
		c ++;
	    }
	    s += "\n";
	    r ++;
	}
	return s;
    }

    public int getLength(){
	return grid.length;
    }
    
    public int getLength(int i){
	return grid[i].length;
    }

  

    
    public boolean addWordHorizontal(String word, int row, int col){
	if (word.length()+ col <= grid[row].length){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row][col+a] == '.' || grid[row][col+a]== word.charAt(a)){
		    notOverlapping = notOverlapping && true;
		} else {
		    notOverlapping = false;
		}
		a ++;
	    }
	    if (notOverlapping){
		int i = 0;
		while (i<word.length()){
		    grid[row][col+i] = word.charAt(i);
		    i ++;
		}
		wordsInGrid.add(word);
		return true;
	    }
	    return false;
	}else if (col+1>=word.length()){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row][col-a] == '.' || grid[row][col-a]== word.charAt(a)){
		    notOverlapping = notOverlapping && true;
		} else {
		    notOverlapping = false;
		}
		a ++;
	    }
	    if (notOverlapping){
		int i = 0;
		while (i<word.length()){
		    grid[row][col-i] = word.charAt(i);
		    i ++;
		}
		wordsInGrid.add(word);
		return true;
	    }
	}
	return false;
    }

    public boolean addWordVertical(String word, int row, int col){
	if (word.length()+ row <= grid.length){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row+a][col] == '.' || grid[row+a][col]== word.charAt(a)){
		    notOverlapping = notOverlapping && true;
		} else {
		    notOverlapping = false;
		}
		a ++;
	    }
	    if (notOverlapping){
		int i = 0;
		while (i<word.length()){
		    grid[row+i][col] = word.charAt(i);
		    i ++;
		}
		wordsInGrid.add(word);
		return true;
	    }
	    return false;
	}else if (row+1>=word.length()){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row-a][col] == '.' || grid[row-a][col]== word.charAt(a)){
		    notOverlapping = notOverlapping && true;
		} else {
		    notOverlapping = false;
		}
		a ++;
	    }
	    if (notOverlapping){
		int i = 0;
		while (i<word.length()){
		    grid[row-i][col] = word.charAt(i);
		    i ++;
		}
		wordsInGrid.add(word);
		return true;
	    }
	}
	return false;
    }


    public boolean addWordDiagonal(String word, int row, int col){
	if (word.length()+ row <= grid.length && word.length()+col<=grid[row].length){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row+a][col+a] == '.' || grid[row+a][col+a]== word.charAt(a)){
		    notOverlapping = notOverlapping && true;
		} else {
		    notOverlapping = false;
		}
		a ++;
	    }
	    if (notOverlapping){
		int i = 0;
		while (i<word.length()){
		    grid[row+i][col+i] = word.charAt(i);
		    i ++;
		}
		wordsInGrid.add(word);
		return true;
	    }
	    return false;
	}else if (row+1>=word.length() && col+1>=word.length()){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row-a][col-a] == '.' || grid[row-a][col-a]== word.charAt(a)){
		    notOverlapping = notOverlapping && true;
		} else {
		    notOverlapping = false;
		}
		a ++;
	    }
	    if (notOverlapping){
		int i = 0;
		while (i<word.length()){
		    grid[row-i][col-i] = word.charAt(i);
		    i ++;
		}
		wordsInGrid.add(word);
		return true;
	    }
	}
	return false;
    }

    public void loadWordsFromFile(String filename, boolean fillRandomLetters) throws FileNotFoundException {
	try {
	    File text = new File(filename);
	    Scanner scan = new Scanner(text);
	    ArrayList<String> wordlist = new ArrayList<String>();
	    while (scan.hasNextLine()){
		String line = scan.nextLine();
		wordlist.add(line);
	    } 
	    Random rand = new Random();
	    int decision = rand.nextInt(3);
	    int randomY = rand.nextInt(getLength());
	    int randomX = rand.nextInt(getLength(randomY));
	    int i = 0;
	    while (i<wordlist.size()){
		if (decision == 0){
		    int j = 0;
		    while (j<10){
			if (addWordHorizontal(wordlist.get(i), randomY, randomX)){
			    break;
			}
			randomY = rand.nextInt(getLength());
			randomX = rand.nextInt(getLength(0));
			j ++;
		    }		
		}else if (decision == 1){
		    int j = 0;
		    while (j<10){
			if (addWordVertical(wordlist.get(i), randomY, randomX)){
			    break;
			}
			randomY = rand.nextInt(getLength());
			randomX = rand.nextInt(getLength(0));
			j ++;
		    }
		}else {
		    int j = 0;
		    while (j<10){
			if (addWordDiagonal(wordlist.get(i), randomY, randomX)){
			    break;
			}
			randomY = rand.nextInt(getLength());
			randomX = rand.nextInt(getLength(0));
			j ++;
		    }
		}
		i++;
		decision = rand.nextInt(3);
		randomY = rand.nextInt(getLength());
		randomX = rand.nextInt(getLength(0));
	    }
	}catch (Exception e){
	    System.out.println("File not found");
	    return;
	}
    	
      	if (fillRandomLetters){
	    this.fillRandomLetters();	
	}
    }

    public void fillRandomLetters() {
	for (int r=0;r<grid[0].length;r++) {
	    for (int c=0;c<grid.length;c++) {
		if (grid[r][c] == '.') {
		    String alphabet = "abcdefghijklmnopqrstuvwxyz";
		    Random rand = new Random();
		    char filler = alphabet.charAt(rand.nextInt(26));
		    grid[r][c] = filler;
		}
	    }
	}
    }

    public String wordsInPuzzle(){
	String s = "";
	for (int i = 0; i < wordsInGrid.size(); ++i) {
	    s += wordsInGrid.get(i) + "\t";
	    if (i % 4 == 0 && i != 0) {
		s += "\n";
	    }
	}
	return s;
    }

    public void setSeed(long seed){
	rand.setSeed(seed);
    }

    
}
