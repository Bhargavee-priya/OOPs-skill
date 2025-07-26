package oops_practical;
import java.util.ArrayList;
//all primitive data types autoboxing example
class autoboxing2{
public static void main(String[] args) {
short s=5;
Short sobj=s;
byte b=2;
Byte bobj=b;
double d=123.456;
Double obj=d;
float f=11;
Float fobj=f;
int i=10;
Integer iobj=i;
long l=123456789;
Long lobj=l;
char c=65;
Character cobj=c;


System.out.println("primitivevalue of byte is" + b);
     System.out.println("autoboxing bobj is  " + bobj);
     System.out.println("primitivevalue of short is" + s);
     System.out.println("autoboxing sobj is  " + sobj);
     System.out.println("primitivevalue of double is" + d);
     System.out.println("autoboxing obj is  " + obj);
     System.out.println("primitivevalue of float is" + f);
     System.out.println("autoboxing fobj is  " + fobj);
     System.out.println("primitivevalue of integer is" + i);
     System.out.println("autoboxing iobj is  " + iobj);
     System.out.println("primitivevalue of long is" + l);
     System.out.println("autoboxing lobj is  " + lobj);
     System.out.println("primitivevalue of character is" + c);
     System.out.println("autoboxing cobj is  " + cobj);
      
  }
}