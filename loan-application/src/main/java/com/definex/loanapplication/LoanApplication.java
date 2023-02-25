package com.definex.loanapplication;

import com.definex.loanapplication.service.impl.CreditScoreServiceImpl;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.*;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.io.OutputStreamWriter;


@SpringBootApplication
public class LoanApplication {
	public static final Logger logger = Logger.getLogger(LoanApplication.class);
	public static void main(String[] args) {
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
		SpringApplication.run(LoanApplication.class, args);

		ConsoleAppender consoleAppender = new ConsoleAppender();
		consoleAppender.setWriter(new OutputStreamWriter(System.out));
		consoleAppender.setLayout(new PatternLayout("%d{yyyy-MM-dd'T'HH:mm:ss.sss'Z'}] [%C] [%t] [%L] [%-5p] %m%n"));

		//Logger.getRootLogger().addAppender(consoleAppender);
		Logger.getRootLogger().setLevel(Level.INFO);


	}

}
