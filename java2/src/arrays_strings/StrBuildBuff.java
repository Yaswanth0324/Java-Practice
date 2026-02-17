package arrays_strings;

public class StrBuildBuff {
	public static void main(String[] args) {
		
		
//String Builder 
		StringBuilder sb=new StringBuilder("java");
		sb.append("programmer");
		System.out.println(sb);
		sb.insert(4, ",");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		sb.toString();
		System.out.println(sb);
		
		
		//realworld example for StringBuilder
		
		StringBuilder sqlquery=new StringBuilder("select * from student where 1=1");
		String cond1="age<18";
		String cond2="city==suden";
		sqlquery.append(" and ").append(cond1).append(" and ").append(cond2 + " ;");
		System.out.println(sqlquery);

//String Buffer
		
		

	}

}
