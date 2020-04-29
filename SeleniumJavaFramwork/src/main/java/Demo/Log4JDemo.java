package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	static Logger myLogger = LogManager.getLogger(Log4JDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Hello World  ..! \n");
		myLogger.trace("This is a trace message");
	    myLogger.info("This is information message");
	    myLogger.error("This is an error message");
	    myLogger.warn("This is a warning message");
	    myLogger.fatal("This is a fatal message");
	    
	    System.out.println("\n Completed");
	}

}
