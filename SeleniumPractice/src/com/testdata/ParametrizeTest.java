package com.testdata;

import com.excel.utility.Xls_Reader;

public class ParametrizeTest {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\HIMANSHU SEKHARDAS\\eclipse-workspaceNEW\\SeleniumPractice\\src\\com\\testdata\\XYZ.xlsx");
	int rowCount=reader.getRowCount("TestData");
	System.out.println(rowCount);
	for( int rowNum =2;rowNum<=rowCount ;rowNum++) {
		
String firstName =	reader.getCellData("TestData", "firstname", rowNum);
System.out.println(firstName);


String lastname=   reader.getCellData("TestData", "lastname", rowNum);
System.out.println(lastname);

String emailid=   reader.getCellData("TestData", "emailid", rowNum);
System.out.println(emailid);

String password=   reader.getCellData("TestData", "password", rowNum);
System.out.println(password);
		
	}
	}

}
