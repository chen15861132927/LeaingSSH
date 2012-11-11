package mm;

import java.io.*;

public class tt {
	public static void createfile(String sysInputFile,int[] input)
	{
		try {
			File file = new File(sysInputFile);
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			String line;
			for(int num:input)
			{
				out.append(Integer.toString(num)+"\n");
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		String sysInputFile = "{sysFileUrl}";
//		String sysInputFile = "/home/cit3d-02/re2";
//		int[] a={1,2,3,4,6,7};
//     	createfile(sysInputFile,a);
		try {
			File file = new File(sysInputFile);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			int number=0,sumOfNum=0;;
			while ((line = in.readLine()) != null) {
				//if(number==0)
				{
					System.out.println("input:");
				}
				//int tempNum=Integer.parseInt(line);
			//	sumOfNum=tempNum+sumOfNum;
			//	System.out.println(line);// Process line of input Here
			//	number++;
			}
			if(number>0)
			{
				System.out.println("output:\n"+sumOfNum);
			}
			System.out.println("output:");
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
