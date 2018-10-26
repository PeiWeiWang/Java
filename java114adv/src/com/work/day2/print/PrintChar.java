package com.work.day2.print;

public class PrintChar extends Thread{
	private Print printer;

	public PrintChar(Print printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void run() {
		for(char c='A';c<='Z';c++){
			printer.printChar(c);
		}
	}

	
}
