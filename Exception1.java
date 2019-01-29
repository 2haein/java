package test;

import java.text.*;
import java.util.*;
import java.io.*;

public class Exception1 {

	public static void main(String[] args) throws IOException {
	System.out.println("1번과 2번 중 선택하시오: ");
	System.out.print(":");
	Scanner scan= new Scanner(System.in);
	int input= scan.nextInt();
	
	FileReader fr= null;
	FileWriter fw= null;
	int secret=3;
	
	try {
		if(input==1) {
			System.out.println("일반 문서중 불러오고자 하는 문서명: ");
			System.out.print(":");
			String fileName= new Scanner(System.in).nextLine();
			fr= new FileReader(fileName);
			
			System.out.println("암호화된 파일을 저장할 파일명");
			System.out.print(":");
			String encryptionFileName= new Scanner(System.in).nextLine();
			fw= new FileWriter(encryptionFileName);
			
			int data=0;
			
			while((data=fr.read())!=-1) {
				data+=secret;
				char ch=(char)data;
				System.out.print(ch);
				fw.write(data);
			}
		}
		
		else if(input==2){
		     System.out.println("암호화 문서만 불러오세요 .ex)sos.txt  ");
		     System.out.print(":");
		     String fileName=new Scanner(System.in).nextLine();  //불러오고자 하는파일명 입력  
		     fr=new FileReader(fileName);              //복호화 문서 파일 내용을 읽어온다.
		     
		     System.out.print("복호화될 파일을 저장할  .txt 명을 입력해주세요. ex)sos.txt");
		   
		      String encryptionFileName=new Scanner(System.in).nextLine();  //불러오고자 하는파일명 입력
		      fw=new FileWriter(encryptionFileName);        //복호화될 파일을 만든다.
		      
		     int data=0;
		     while((data=fr.read())!=-1){
		      data-=secret;   //복호화
		      char ch=(char)data;   
		      System.out.print(ch);         //복호화 출력 
		      fw.write(data);  //복호화된 데이터를 저장한다.
		      
		     }//while   
		      }  //else if   
		   }//try{}
		   catch(FileNotFoundException abc){
		       System.out.println("파일을 찾을수 없습니다.");
		      }
		   catch(IOException ee){
		  System.out.println("파일 읽을수 없다.");
		   }
		      finally{
		    try{ 
		        fr.close();
		        fw.close();  //저장값을 반환해준다.
		       }
		    catch(Exception ee){} 
		  
		    
		       }//finally 닫고
	}
		
}



class A {
	private int[] arr = new int[3];

	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}
