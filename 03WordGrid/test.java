public class test{
    public static void main(String[] args){
	WordGrid w = new WordGrid(10,10);
	System.out.println(w);
	w.addWordHorizontal("wooooo",0,0);
	w.addWordHorizontal("wooooo",6,3);
	w.addWordHorizontal("wooooo",5,5);
	System.out.println(w);
	w.clear();
	System.out.println(w);
    }
}
