package arrays_strings;

public class str1 {
	public static void main(String[] args) {
		String a="yash is java programmer";
		String b="YASH IS FRONTEND DEVELOPER ALSO";
		String c="     yash         ";
		System.out.println(a.length());
		System.out.println(a.charAt(5));
		System.out.println(a.equals("Yash Is Java Programmer"));
		System.out.println(a.equalsIgnoreCase("Yash Is Java Programmer"));
		System.out.println(a.substring(6));
		System.out.println(a.substring(2, 6));
		System.out.println(a.contains("java"));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.replace("programmer", "developer"));
		System.out.println(c.trim());
		System.out.println(a.indexOf("j"));
		String course="html,css,javascript,java,,python,mysql";
		String[] crs=course.split(",");
		for(String src:crs) {
			System.out.println(src);
		}
		System.out.println(a.startsWith("java"));
		System.out.println(a.endsWith("er"));
		

		
	}


}
