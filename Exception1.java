package test;

import java.text.*;
import java.util.*;
import java.io.*;

public class Exception1 {

	public static void main(String[] args) throws IOException {
	System.out.println("1���� 2�� �� �����Ͻÿ�: ");
	System.out.print(":");
	Scanner scan= new Scanner(System.in);
	int input= scan.nextInt();
	
	FileReader fr= null;
	FileWriter fw= null;
	int secret=3;
	
	try {
		if(input==1) {
			System.out.println("�Ϲ� ������ �ҷ������� �ϴ� ������: ");
			System.out.print(":");
			String fileName= new Scanner(System.in).nextLine();
			fr= new FileReader(fileName);
			
			System.out.println("��ȣȭ�� ������ ������ ���ϸ�");
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
		     System.out.println("��ȣȭ ������ �ҷ������� .ex)sos.txt  ");
		     System.out.print(":");
		     String fileName=new Scanner(System.in).nextLine();  //�ҷ������� �ϴ����ϸ� �Է�  
		     fr=new FileReader(fileName);              //��ȣȭ ���� ���� ������ �о�´�.
		     
		     System.out.print("��ȣȭ�� ������ ������  .txt ���� �Է����ּ���. ex)sos.txt");
		   
		      String encryptionFileName=new Scanner(System.in).nextLine();  //�ҷ������� �ϴ����ϸ� �Է�
		      fw=new FileWriter(encryptionFileName);        //��ȣȭ�� ������ �����.
		      
		     int data=0;
		     while((data=fr.read())!=-1){
		      data-=secret;   //��ȣȭ
		      char ch=(char)data;   
		      System.out.print(ch);         //��ȣȭ ��� 
		      fw.write(data);  //��ȣȭ�� �����͸� �����Ѵ�.
		      
		     }//while   
		      }  //else if   
		   }//try{}
		   catch(FileNotFoundException abc){
		       System.out.println("������ ã���� �����ϴ�.");
		      }
		   catch(IOException ee){
		  System.out.println("���� ������ ����.");
		   }
		      finally{
		    try{ 
		        fr.close();
		        fw.close();  //���尪�� ��ȯ���ش�.
		       }
		    catch(Exception ee){} 
		  
		    
		       }//finally �ݰ�
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
