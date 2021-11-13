package Strings;
public class Solution{
	public static void main(String[] args){
		String s1="Hi Everyone";
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Hello");
		s2.append("World");
		System.out.println(s2);

		StringBuilder s3= new StringBuilder("Hello");
		s3.append("Apisero");
		System.out.println(s3);
	}
}