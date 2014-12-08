public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(int capacity){
	super(capacity);
    }
    public OrderedSuperArray(){
	super();
    }

   public int get(String e){
	for (int i = 0;i<SuperArray.length;i++){
	    if (SuperArray[i] == null || e.compareTo(SuperArray[i]) < 0){
		return i;
	    }
	}
	return SuperArray.length-1;
    }
    
    public void add (String e){
	int index = get(e);
	super.add(index,e);
    }
    public void add(int index, String e){
	add(e);
    }
    
    public static void main(String[] args){
	OrderedSuperArray O = new OrderedSuperArray();
	O.add("whiskey");
	O.add("tango");
	O.add("alpha");
	O.add("lima");
	O.add("hotel");
	O.add("november");
	O.add("delta");
	O.add("kilo");
	O.add("zulu");
	O.add("papa");
	System.out.println(O);
	
    }
    
}
