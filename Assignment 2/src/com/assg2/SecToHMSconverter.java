package com.assg2;

public class SecToHMSconverter {
	
	public void convert(int seconds) {
	
	if(seconds>0) {
		int sectime = seconds % 60;
		int mintime = seconds / 60;
		mintime%=60;
		int hrtime = seconds /3600;
		System.out.print(seconds+" seconds has ");
		for(int i=0; i<3; i++) {
			if(i==0) {
				System.out.print(hrtime+":");
			} else if(i==1) {
				System.out.print(mintime+":");
			} else {
				System.out.print(sectime);
			}
		}
	}
	
	
	
	
		
		
			
}
	
		
}


