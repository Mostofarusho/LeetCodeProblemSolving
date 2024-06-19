package String;
public class String_Practice {
    public static void main(String[] args) {
        // String length
//			String data="Mostofa";
//			data=data.concat("\0");
//			char arr[]=data.toCharArray();
//			int count=0;
//			int i=0;
//			while(arr[i]!='\0') {
//				++count;
//				++i;
//			}
//			System.out.println(count);
//		copy a string in another array 
//		String data="Mostofa Omar";
//		char y[]=data.toCharArray();
//		int size=y.length;
//		char a[]=new char[size];
//		int i=0;
//		while(i!=size) {
//			a[i]=y[i];
//			i++;
//		}
//		System.out.println(y);
//		System.out.println(a);
		
//Reverse String 
//		String data="Mostofa Omar";
//		char y[]=data.toCharArray();
//		int size=y.length;
//		char a[]=new char[size];
//		int i=0;
//		while(i!=size) {
//			a[size-1-i]=y[i];
//			i++;
//		}
//		System.out.println(y);
//		System.out.println(a);
//		Palindrome number 
//		String data="Aaaa";
//		data=data.replace(" ", " ");
//		data=data.toUpperCase();
//		char y[]=data.toCharArray();
//		int size=y.length;
//		char a[]=new char[size];
//		int i=0;
//		while(i!=size) {
//			a[size-1-i]=y[i];
//			i++;
//		}
//		System.out.println(y);
//		System.out.println(a);
////		
//		while(i!=size) {	
//			if(a[i]!=y[i]) {
//				System.out.println("Not A Palindrome");
//				System.exit(0);
//				
//			}
//			else {
//				++i;
//				continue;
//			}
//			
//		}
//		System.out.println("Palindrome");
//		How to convert lowercase Strings to uppercase in Java 
//		String data="mostofa omar fattha";
//		data=data.toLowerCase();
//		char copy[]=data.toCharArray();
//		int size=copy.length;
//		
//		copy[0]=(char)(copy[0]-32);
//		int i=1;
//		while(i!=size) {
//		if(copy[i]==' '){			    
//				copy[i+1]=(char)(copy[i+1]-32);
//				
//			}
//			++i;	
//		}
//		System.out.println(data);
//		System.out.println(copy);
//		How to count vowels, consonants & special symbols in a String 
//		String data="Mostofa Omar Fattha";
//		data=data.toLowerCase();
//		char ch[]=data.toCharArray();
//		char vowel[]= {'a','e','i','o','u'};
//		int i=0;
//		int size=ch.length;
//		
//		int count=0;
//		while(i<size) {
//			for(char v:vowel) {
//				if(ch[i]==v) {
//					count++;
//					break;
//				}
//			}
//			++i;
//		}
//		System.out.println(count);
//		check if integer 
//		String data="1111111";
////		char ch[]=data.toCharArray();
//		int size=data.length();
//		int i=0;
//		while(i!=size) {
//			if(data.charAt(i)>='0' && data.charAt(i)<='9') {
//				++i;
//			}
//			else{
//				System.out.println("Not an Integer");
//				System.exit(0);
//			}
//		}
//		System.out.println("Is an Integer");
//		Anagram 
//		String data="Listen";
//		data=data.toLowerCase();
//		char ch[]=data.toCharArray();
//		int size=ch.length;
//		String copy="Silent";
//		char co[]=data.toCharArray();
//		int sizeco=co.length;
//		int i=0;
//		while(i!=size) {
//			if(ch[i]==co[i]) {
//				++i;
//			}
//			else {
//				System.out.println("Not anagram");
//				System.exit(0);
//			}
//			
//		}
//		System.out.println("Anagram");
//		Anagram By Sorting 
//		String name1="Listen Listen Listen";
//		name1=name1.toLowerCase();
//		name1=name1.replace(" ", "");
//		char ch1[]=name1.toCharArray();
//		Arrays.sort(ch1);
//		String name2="Silent Silent Silent";
//		name2=name2.toLowerCase();
//		name2=name2.replace(" ", "");
//		char ch2[]=name2.toCharArray();
//		Arrays.sort(ch2);
//		boolean result=Arrays.equals(ch1, ch2);
//		if(result==true) {
//			System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Not Anagram");
//		}
//		pangram 
//		String data="The quick brown fox jumps over the lazy dog";
//		data=data.toLowerCase();
//		data=data.replace(" ", "");
//		char ch[]=data.toCharArray();
//		int size=ch.length;
//		System.out.println("P");
//		int i=0;
//	     while(i!=size) {
//	    	 if(ch[i]>=(char)97 && ch[i]<=(char)122) {
//	    		 ++i;
//	    	 }
//	    	 else {
//	    		 System.out.println("NP");
//	    		 System.exit(0);
//	    	 }
//	    	 
//	     }
//	     System.out.println("P");
//		For Each Loop 
//		double aa[]= {10.5,11.2,12.8,21.9};
//		double sum=0.0;
//		for(double d:aa) {
//			sum+=d;
//		}
//		System.out.println(sum);
//Map data structure 
//	String x="ARADHA";
//	char y[]=x.toCharArray();
//	int size=y.length;
//	Map<Character,Integer>map=new HashMap<>();
//	int i=0;
//	while(i!=size) {
//		if(map.containsKey(y[i])==false) {
//			map.put(y[i], 1);
//		}
//		else {
//			int oldVal=map.get(y[i]);
//			int newVal=oldVal+1;
//			map.put(y[i], newVal);
//		}
//		++i;
//	}
//	Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
//	for(Map.Entry<Character, Integer>data:hmap) {
//		System.out.print(data.getKey());
//		System.out.print(data.getValue());
//	}
//	String input="SILLYSPIDERS";
//	char ch[]=input.toCharArray();
//	int size=ch.length;
//	Map<Character,Integer>map=new LinkedHashMap<>();
//	int i=0;
//	while(i!=size) {
//		if(map.containsKey(ch[i])==false) {
//			map.put(ch[i], 1);
//		}
//		else {
//			int oldVal=map.get(ch[i]);
//			int newVal=oldVal+1;
//			map.put(ch[i], newVal);
//		}
//		++i;
//	}
//	
//	Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
//	String res=" ";
//	for(Map.Entry<Character,Integer>data:hmap) {
//		res=res+data.getKey();
//		
//	}
//	System.out.println(res);
//	for(Map.Entry<Character, Integer>data:hmap) {
//		System.out.print(data.getKey());
//		System.out.print(data.getValue());
//	}
//		Remove All Occurance of a given Character 
//		String x="SPIDERSLIES";
//		char ch[]=x.toCharArray();
//		int size=ch.length;
//		char key='I';
//		int i=0;
//		String res="";
//		while(i!=size) {
//			if(ch[i]!=key) {
//				res=res+ch[i];
//			}
//			++i;
//		}
//		System.out.println(res);
//		How to convert String to Integer and Integer to String in Java
}
    }

