package com.image;
import java.io.*;
public class Inout {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//only bytes input stream can transfer images.
			//first input images into RAM
			FileInputStream fis=null;
			//define a output
			FileOutputStream fos=null;
			byte buf[]=new byte[1024];
			try {
				fis=new FileInputStream("D:/puppy2.jpg");
				fos=new FileOutputStream("E:/puppy2.jpg");
			
				//don't know how large is image, you can read in loop
				int n=0;//record real read bytes
				while((n=fis.read(buf))!=-1)
				{
					//output to destination file
					fos.write(buf);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				try {
					fis.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
