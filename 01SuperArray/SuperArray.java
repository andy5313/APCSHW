public class SuperArray{
    private int numElements;
    private Object[] SuperArray;
       
    public SuperArray(){
	SuperArray = new Object[10];
	numElements = 0;
    }
    
    public SuperArray(int capacity){
	SuperArray = new Object[capacity];
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

    public void add(Object e){  
	if (SuperArray[SuperArray.length-1]== null){
	    SuperArray[numElements] = e;
	    numElements ++;
	} else {
	    Object[] copy = new Object[SuperArray.length+1];
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

    public void add(int index, Object o){
	if (SuperArray[index] == null){
	    SuperArray[index] = o;
	    numElements ++;
	} else if (SuperArray[SuperArray.length-1] != null) {
	    Object[] copy = new Object[SuperArray.length+1];
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
	    Object[] copy = new Object[SuperArray.length+1];
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

    public Object remove(int index){
	if (index>= 0 && index < SuperArray.length){
	    Object saved = SuperArray[index];
	    Object[] copy = new Object[SuperArray.length];
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
	    throw new IndexOutOfBoundsException();
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
	Object[] copy = new Object[newCapacity];
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

    public Object get(int index){
	if (index>=0 && index< SuperArray.length){
		return SuperArray[index];    
	} else {
	throw new IndexOutOfBoundsException();
	}
    }

    public Object set(int index, Object o){
	if (index>= 0 && index<SuperArray.length){
	    Object saved = SuperArray[index];
	    SuperArray[index] = o;
	    return saved;
	} else {
	throw new IndexOutOfBoundsException();
	}
    }

}
