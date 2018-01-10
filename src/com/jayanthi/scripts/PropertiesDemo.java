package com.jayanthi.scripts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
	Properties p = new Properties();
	p.setProperty("username", "jayanthi@gmail.com");
	FileWriter fw = new FileWriter("C:\\Users\\jayanthi\\workspace\\selenium one\\OR.GMAIL.PROPERTIES");
    p.store(fw, "file created");
    fw.close();
	}

}
