public class SuperArray{
    public int numElements;
    public String[] SuperArray;
       
    public SuperArray(){
	SuperArray = new String[10];
	numElements = 0;
    }
    
    public SuperArray(int capacity){
	SuperArray = new String[capacity];
	numElements = 0; 
    }

    public String toString(){
	int a = 0;
	String s = "[ ";
	while (a<SuperArray.length){
	    s += SuperArray[a];
	    s += " ";
	    a ++;
	}
	return s += "]";
    }

    public void add(String e){  
	if (SuperArray[SuperArray.length-1]== null){
	    SuperArray[numElements] = e;
	    numElements ++;
	} else {
	    String[] copy = new String[SuperArray.length+1];
	    int i = 0;
	    while (i<SuperArray.length){
		copy[i] = SuperArray[i];
		i ++;
	    }
	    copy[SuperArray.length]=e;
	    SuperArray = copy;
	    numElements ++;
	}
    }

    public void add(int index, String o){
	if (SuperArray[index] == null){
	    SuperArray[index] = o;
	    numElements ++;
	} else if (SuperArray[SuperArray.length-1] != null) {
	    String[] copy = new String[SuperArray.length+1];
	    int i = 0;
	    while (i<index){
		copy[i] = SuperArray[i];
		i++;
	    }
	    copy[i] = o;
	    while (i<SuperArray.length){
		copy[i+1] = SuperArray[i];
		i ++;
	    }
	    SuperArray = copy;
	    numElements++;
	} else {
	    String[] copy = new String[SuperArray.length+1];
	    int i = 0;
	    while (i<index){
		copy[i] = SuperArray[i];
		i++;
	    }
	    copy[i] = o;
	    while (i<SuperArray.length-1){
		copy[i+1] = SuperArray[i];
		i ++;
	    }
	    SuperArray = copy;
	    numElements++;
	}
	    
    }

    public String remove(int index){
	if (index>= 0 && index < SuperArray.length){
	    String saved = SuperArray[index];
	    String[] copy = new String[SuperArray.length];
	    int i = 0;
	    while (i<index){
		copy[i] = SuperArray[i];
		i ++;
	    }
	    while (i+1<SuperArray.length){
		copy[i] = SuperArray[i];
		i ++;
	    }
	    SuperArray = copy;
	    numElements --;
	    return saved;
	}else{
	    System.out.println("Index out of range");
	    return null;
	}
    }

    public int size(){
	int counter = 0;
	int i = 0;
	while (i<SuperArray.length){
	    if (SuperArray[i] != null) counter ++;
	    i ++;
	}
	return counter;
    }

    public void resize(int newCapacity){
	if (newCapacity > SuperArray.length){
	    String[] copy = new String[newCapacity];
	    int i = 0;
	    while (i<SuperArray.length){
		copy[i] = SuperArray[i];
		i ++;
	    }
	    SuperArray = copy;
	}
    }

    public void clear(){
	int i = 0;
	while (i<SuperArray.length){
	    SuperArray[i] = null;
	    i ++;
	}
    }

    public String get(int index){
	if (index>=0 && index< SuperArray.length){
	    return SuperArray[index];    
	} else {
	    System.out.println("Index is out of range");
	    return null;
	}
    }

    public String set(int index, String o){
	if (index>= 0 && index<SuperArray.length){
	    String saved = SuperArray[index];
	    SuperArray[index] = o;
	    return saved;
	} else {
	    System.out.println("Index out of range");
	    return null;
	}
    }
    
    public void insertionSort(){
	for (int i = 1; i<SuperArray.length;i++){
	    if (SuperArray[i].compareTo(SuperArray[0])<0){
		String copy = SuperArray[i];
		for (int a =0;  a<1;a++){
		    SuperArray[i-a]=SuperArray[i-a-1];
		}
		SuperArray[0] = copy;
	    }
	    for (int b = i;b>0;b--){
		if (SuperArray[i].compareTo(SuperArray[i-b])>0 && SuperArray[i].compareTo(SuperArray[i-b+1])<0){
		    String copy = SuperArray[i];
		    for (int a = 0;a<i-b+1;a++){
			SuperArray[i-a]=SuperArray[i-a-1];
		    }
		    SuperArray[i-b+1] = copy;
		}
	    }
	}
    }

}
