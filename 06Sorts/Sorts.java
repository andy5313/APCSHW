public class Sorts{
    public static void bubble(int[]c){
	int temp;
	for (int i = 0; i < c.length -1; i++){
	    for (int j= 0; j < c.length - 1 - i;j++){
		if (c[j]> c[i+1]){
		temp = c[j];
		c[j] = c[j+1];
		c[j+1] = temp;
		}
	    }
	}
    }

    public static void selection(int[] c){
        for (int i = 0; i< c.length-1;i++){
	    for (int j = i + 1; j < c.length; j++){
		int index = i;
		if (c[j] < c[i]){
		    index = j;
		}
		int swap = c[index];
		c[index] = c[i];
		c[i] = swap;
	    }
	}
    }
    
    public static void insertion(int[] c){
	for (int i = 1; i < c.length; i++){
	    int temp = c[i];
	    for (int j = i - 1; j >= 0 && temp <c[j]; j--){
		c[j+1] = c[j];
		c[j+1] = temp;
	    }
	}
    }


    public static void main(String[] args){
	int[] array = new int[10];
	array[0] = 5;
	array[1] = 10;
	array[2] = 2;
	array[3] = 8;
	array[4] = 5;
	array[5] = 20;
	array[6] = 16;
	array[7] = 3;
	array[8] = 11;
	array[9] = 7;
	if (args[0].equals("bubble")){
	    long startTime = System.currentTimeMillis();
	    bubble(array);
	    long endTime = System.currentTimeMillis();
	    System.out.println("bubble "+ (endTime-startTime));
	}
	if (args[0].equals("selection")){
	    long startTime = System.currentTimeMillis();
	    selection(array);
	    long endTime = System.currentTimeMillis();
	    System.out.println("selection "+ (endTime-startTime));
	}
	if (args[0].equals("insertion")){
	    long startTime = System.currentTimeMillis();
	    insertion(array);
	    long endTime = System.currentTimeMillis();
	    System.out.println("insertion "+ (endTime-startTime));
	}
    }
}
