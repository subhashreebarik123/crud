package com.java.test;



import com.java.test.Asynch.AsynchController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;


@SpringBootApplication
public class crudOperationApplication implements CommandLineRunner{

	@Autowired
	private AsynchController asynchController;
	public static void main(String[] args) {

		SpringApplication.run(crudOperationApplication.class, args);
		System.out.println("my spring version is :" + SpringVersion.getVersion());
		System.out.println("my springboot version is :" + SpringBootVersion.getVersion());


	}

	@Override
	public void run(String... args) throws Exception {
      asynchController.runAsyncTask();
	}
}


