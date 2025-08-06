package oops;

public class ReplaceModify {
	public static void main(String[] args) {
        String s = "ababab";
        System.out.println(s.replace('a', 'x'));         
        System.out.println(s.replace("ab", "xy"));     
        System.out.println(s.replaceAll("a.", "z"));    
        System.out.println(s.replaceFirst("ab", "xy")); 
    }

}
