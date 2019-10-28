package org.lorenzoval;

import java.util.logging.*;

public class MyLogger {
	
	private MyLogger() {
		// not called
	}
	
	public static void log(String arg) {
		Logger log = Logger.getLogger("MyLogger.logger");
		log.setLevel(Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new SimpleFormatter());
		handler.setLevel(Level.ALL);
		log.addHandler(handler);
		log.fine(arg);
	}

}
