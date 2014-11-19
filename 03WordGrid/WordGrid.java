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
    
    public boolean addWordHorizontal(String word, int row, int col){
	if (word.length()+ col > grid.length){
	    return false;
	}else {
	    int i = 0;
	    while (i<word.length()){
		grid[row][col+i] = word.charAt(i);
		i ++;
	    }
	    return true;
	}
    }
    
}
