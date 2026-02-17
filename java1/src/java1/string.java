package java1;

public class string {
	public static void main(String[] args) {
		String txt="iconstar alluarjun";
        System.out.println(txt.length());
      System.out.println(txt.toUpperCase());
      String txt1="VIRAT KOHLI";
      System.out.println(txt1.toLowerCase());
      System.out.println(txt.indexOf("alluarjun"));
      System.out.println(txt.charAt(4));
      System.out.println(txt.codePointAt(4));
      System.out.println(txt.codePointBefore(4));
      System.out.println(txt.codePointCount(1, 4));
      System.out.println(txt.compareTo("alluarjun"));
      System.out.println(txt.concat(" national award winner"));
     System.out.println(txt.contains("arjun"));
     System.out.println(txt.contentEquals("alluarjun"));
    char[] str3={'h','e','l','l','o'};
      String str2="";
      str2=String.copyValueOf(str3,0,5);
      System.out.println(str2); 
      System.out.println(txt.endsWith("n"));
      String txt2="        hello    ";
      System.out.println(txt.equals(txt2));
     System.out.println(txt2.trim());
      System.out.println(txt.toString());
      char[] arr=txt.toCharArray();
      System.out.println(arr[4]);
       System.out.println(txt.substring(2,7));
      System.out.println(txt.subSequence(2, 7));
      System.out.println(txt.startsWith("ic"));
      String res = "%S alluarjun , %d";
      String res1 = String.format(res, "stylishstar",2403);
      System.out.println(res1);
     byte[] txt3=txt.getBytes();
      System.out.println(txt3[4]);
      System.out.println(txt.hashCode());
      System.out.println(txt.isEmpty());
      String txt4 = String.join(" ","hi","hello","how r u");
      System.out.println(txt4);
	}

}
