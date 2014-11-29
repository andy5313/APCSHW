import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]grid;
    public WordGrid(int rows,int cols){
	grid = new char[rows][cols];
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
    public void clear(){
	int r = 0;
	while (r<grid.length){
	    int c = 0;
	    while (c<grid[r].length){
		grid[r][c] = ' ';
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
	if (word.length()+ col <= grid.length){
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
		return true;
	    }
	    return false;
	}else if (col+1>=word.length()){
	    boolean notOverlapping = true;
	    int a = 0;
	    while (a<word.length()){
		if (grid[row][col-a] == '.' || grid[row][col+a]== word.charAt(a)){
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
		return true;
	    }
	}
	return false;
    }
}
