/*
 * If we use fully qualified name then only we can declare  the class of this package will be 
 * accessible.
 * here there is no need to import. but we have to use fully qualified name every time when  access the class or interface
 */

package mypack2;   //here in this mypack2 package we accessing the different package of same class file 

public class ClassA { //here i have taken the same class name as ClassA

	public static void main(String[] args) { //created main method
		
		mypackage.ClassA obj = new mypackage.ClassA(); //creating the fully qalified name for the classA object 
		obj.bark(); //displays the properties 
		obj.run();
		System.out.println("here mypackage ClassA methods have been called");

	}

}
