
public class test{
    public static void main(String[] args){
	WordGrid w = new WordGrid(10,10);
	System.out.println(w);
	w.addWordHorizontal("wooooo",0,0);
	w.addWordHorizontal("wooooo",6,3);
	w.addWordHorizontal("wooooo",5,5);
	w.addWordVertical("boo",1,1);
	w.addWordDiagonal("gooo",3,2);
	System.out.println(w);
	w.clear();
	System.out.println(w);
    }
}
