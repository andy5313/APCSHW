+public class test{
+    public static void main(String[] args){
+	Integer x = new Integer(5);
+	SuperArray L = new SuperArray();
+	L.add(x);
+	L.add(new Integer(99)); 
+	System.out.println(L.toString());
+	System.out.println(L.remove(1));
+	System.out.println(L.remove(10));
+	L.set(2,"A");
+	System.out.println(L.toString());
+    }
+}
