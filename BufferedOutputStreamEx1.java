package test;
import java.io.*;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) 
	{
		String line="";

		try {
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(isr);
			
			System.out.println("사용중인 OS의 인코딩: "+isr.getEncoding());
			
			do {
				System.out.println("문장입력");
				line=br.readLine();
				System.out.println("입력하신 문장:"+line);
				
			}while(!line.equalsIgnoreCase("q"));
		
			br.close();
			System.out.println("프로그램 종료합니다.");
		}catch(IOException e) {}
		
		try {
			FileOutputStream fos= new FileOutputStream("123.txt");
			BufferedOutputStream bos= new BufferedOutputStream(fos,7);
			
			for(int i='1';i<='9';i++) {
				bos.write(i);
			}
			bos.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			String fileName="123.txt";
			FileInputStream fis= new FileInputStream(fileName);
			FileReader fr= new FileReader(fileName);
			
			int data=0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
				}
			System.out.println();
			fis.close();
			
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(5/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("오류:"+ e.getMessage());
		}
			
		
		
	}

}
