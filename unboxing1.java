package oops_practical;
import java.util.ArrayList;
//all primitive data types autoboxing example
class unboxing1{
public static void main(String[] args) {
  Integer iobj=Integer.valueOf(10);
  int i=iobj;
  Byte bobj=Byte.valueOf((byte)8);
  byte b=bobj;
    Short sobj=Short.valueOf((short)5);
  short s=sobj;
  Long lobj=Long.valueOf(123456789L);
  long l=lobj;
  Float fobj=Float.valueOf(10.0f);
  float f=fobj;
  Double dobj=Double.valueOf(123.456);
  double d=dobj;
  Character cobj=Character.valueOf('#');
  char c=cobj;
Boolean boolObj = Boolean.valueOf(true); // additional for completeness
      boolean bool = boolObj;
  
     System.out.println("object of integer is iobj " + iobj);
     System.out.println("unboxingboxing i is  " + i);
       System.out.println("object of byte is bobj " + bobj);
     System.out.println("unboxingboxing i is  " + b);
      System.out.println("object of short is sobj " + sobj);
     System.out.println("unboxingboxing s is  " + s);
      System.out.println("object of long is lobj " + lobj);
     System.out.println("unboxingboxing l is  " + l);
      System.out.println("object of float is fobj " + fobj);
     System.out.println("unboxingboxing f is  " + f);
      System.out.println("object of integer is dobj " + dobj);
     System.out.println("unboxingboxing d is  " + d);
      System.out.println("object of character is cobj " + cobj);
     System.out.println("unboxingboxing c is  " + c);
System.out.println("Object of Boolean is boolObj: " + boolObj);
      System.out.println("Unboxed bool: " + bool);
  }
}