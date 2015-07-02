package GUI;

public class CompareTo {

	
	public static void main(String[] args) {
		
	 	String str1 = "hello how are you ";
        String str2 = "here we comere strings";
        String str3 = "String method ";
        String str4 = "hello";
        String str5 = "hello";
        
        //a compareTo method compare string on the basis of ascii  values of the alphabets
        //and compare the distance between first value of alphabets and return value 
        
		int var1 = str1.compareTo( str2 );
	    System.out.println("str1 & str2 comparison: "+var1);

	    int var2 = str1.compareTo( str3 );
	    System.out.println("str1 & str3 comparison: "+var2);

	    int var3 = str4.compareTo( str5 );
	    System.out.println("str7 & str8 comparison: "+var3);
	
	    int var4 = str3.compareTo( str5 );
	    System.out.println("str3 & str7 comparison: "+var4);
	    
	    int var5 = str4.compareTo( str2 );
	    System.out.println("str4 & str2 comparison: "+var4);
	}

}
