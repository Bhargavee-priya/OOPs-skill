package oops;

public class SearchIndex {
	public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.indexOf(""));        // 2
        System.out.println(s.lastIndexOf("na"));    // 4
        System.out.println(s.contains("nan"));      // true
    }


}
