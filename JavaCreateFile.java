package basic.programs.java;

import java.io.File;
import java.io.IOException;

public class JavaCreateFile
{
	static File folder = new File("D:\\JavaFileHandling\\TextFile3924.xlsx");
	//   ./TextFile3924.xlsx


	//1. if file exists, delete the file and create new file
	public static boolean fileexists() throws IOException
	{
		if(folder.exists()) //validate file is present , No it wont enter into the block
		{
			System.out.println(folder.canWrite()); //false
			//change the config setting (check the read only mode, so write is disabled)

			//if not able to write -> set towrittable
		System.out.println(folder.setWritable(true));	//true
		System.out.println(folder.canWrite()); //true

			//folder.delete();
			//folder.createNewFile();
		}


		return false;
	}

	public static void main(String[] args) throws IOException
	{
		fileexists(); //follow -> fileexists()
		//check file has the permission to write
		//hide the file in folder -> under properties hiden -> now check it
		//System.out.println(folder.isHidden()); //false

		//System.out.println(folder.createNewFile()); //true -> successfully created by java
		//exist in folder.
		//System.out.println(folder.exists()); //true

	}

}
