public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(int capacity){
	super(capacity);
    }
    public OrderedSuperArray(){
	super();
    }
    
    public void add (String e){
	for (int i =0;i < SuperArray.length; i++){
	    if (e.compareTo(SuperArray[i])<0 || SuperArray[i]== null){
		int index = i;
	    }	    
	}
	int index = SuperArray.length-1;
	super.add(index,e);
    }

    public void add(int index, String e){
	add(e);
    }
    
    public static void main(String[] args){
	OrderedSuperArray O = new OrderedSuperArray();
	O.add("tango");
	O.add("alpha");
	O.add("november");
	O.add("delta");
	O.add("zulu");
	System.out.println(O);
	
    }
    
}
