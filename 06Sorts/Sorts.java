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
	int[] array = new int[5];
	array[0]=3;
	array[1]=5;
	array[2]=0;
	array[3]=10;
	array[4]=4;
	if (args[0].equals("bubble")){
	    System.out.println(array);
	    bubble(array);
	    System.out.println(array);
	}
	if (args[0].equals("selection")){
	    System.out.println(array);
	    selection(array);
	    System.out.println(array);
	}
	if (args[0].equals("insertion")){
	    System.out.println(array);
	    insertion(array);
	    System.out.println(array);
	}
    }
}
