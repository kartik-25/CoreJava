package StaticAndNonStatic;
public class Example2 {
	
int a ;
static int b;

public void test1() {
System.out.println(a);
System.out.println(b);
}

public static void test2() {
	System.out.println(b=32);
}

	
public static void main(String[] args) {
System.out.println(" ***** Calling static method directly *****");
test2();
System.out.println(b);
Example2.test2();
System.out.println(Example2.b);

System.out.println(" **** Calling non static method with help of object *****");
/*
 Rule => Non static member will be loaded in heap area as many time we create objects.
	  => If we create ten objects than non static member will get loaded to heap area in memory
*/

Example2 obj = new Example2();
obj.test1();
System.out.println(obj.a);

Example2 obj1 = new Example2();
obj.test1();
System.out.println(obj.a);

}}

/*
Rule =>  Static member 
= They are class member. 
= Static member will be get execute once per class. 
= Static member get loaded to memory once
= In case of Static member, 
  even if we call it for 10 time then also it will not occupying extra space in memory. Since it is class member.



Rule =>   Non Static member
= Where as non static member will get loaded as many as we create object.
= e.g. if we create 2 or more object in java. 
  Now when I call this method. Then in heap area of memory it will occupy space.
*/
