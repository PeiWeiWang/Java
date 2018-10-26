package com.work.day2.print;

public class PrintNum extends Thread{
	private Print printer;

	public PrintNum(Print printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void run() {
		for(int num=1;num<=52;num++){
			printer.printNum(num);
		}
	}

	
}
