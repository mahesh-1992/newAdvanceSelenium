package mytests;

public class PawanSTRING {

	public static void main(String[] args)
	{
		String s="java,selenium,testng,maven";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
		System.out.println(str[i]);
		}
		String s1="ABC";
		String s2="ABC";
		String s3="ABC";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.append(s2));
		System.out.println(s1.concat(s2).concat(s3));
		String s4="durga soft";
		System.out.println(s4.trim().length());
	}

}
