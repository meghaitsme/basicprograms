package basic.programs.java;

import java.io.File;
import java.io.IOException;

public class CreateExcelfile {
 //Excel file
	public static void main(String[] args) throws IOException
	{ //import file from io.File

		File excel = new File("D:\\JavaFileHandling\\creatednewfile3-9-24.xlsx");
		System.out.println(excel.createNewFile()); //successfully created -> true

		//System.out.println(excel.delete());
		System.out.println(excel.getAbsoluteFile());
		//D:\JavaFileHandling\creatednewfile3-9-24.xlsx
		System.out.println(excel.getAbsolutePath());
		System.out.println(excel.getCanonicalFile());
		System.out.println(excel.canWrite());
		System.out.println(excel.getParent());//   D:\JavaFileHandling
		System.out.println(excel.getName()); // creatednewfile3-9-24.xlsx

		//true  -> file gets deleted in folder, no longer exists.

		//now , after creating the file if u run the same program, it triggers to the false
		//beacoz already exists. -> produces o/p as false.
		//excel.delete() -> if successfully deleted -> show true.
	}

}
