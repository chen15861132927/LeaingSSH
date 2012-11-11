package util;

public class Print {
	
	public  static void println(Object obj){
		System.out.println(obj);
	}
	public  static void print(Object obj){
		System.out.print(obj);
	}
	public static void printerr(Object obj){
		System.err.println(obj);
	}
	public static void printIter(Object[] obj){
		StringBuilder temp=new StringBuilder();
		
		for(Object item:obj){
			temp.append(item);
			temp.append(" ,");
		}
		println(temp.toString());
	}
}
