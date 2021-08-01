package com.blz.practiceproblem.day05.UC1;

import java.util.concurrent.ThreadLocalRandom;

public class UC1_Flip_Coin {
	static int n = 0;
    double randomNum;
    int head =0;
    int tail =0;
    double percentage=0;
	public static void main(String[] args) {
		UC1_Flip_Coin flip = new UC1_Flip_Coin();
		flip.coinFlip(n);

	}

	public void coinFlip(int n) {
		do {
			n++;
			randomNum = ThreadLocalRandom.current().nextDouble(0, 1);
//			System.out.println(+randomNum);
			if (randomNum >= 0.5) {
			//	System.out.println(+head+"Head");
				head++;
			} else {
				//System.out.println(+tail+"Tail"); 
				tail++;
			}
		} while (n <= 19);
		//System.out.println("head repeated: "+head+"times\n tail repeated: "+tail+"times");
		double percentage=head*100/20;
		System.out.println("percentage of head is:"+percentage+"%");
		percentage=(tail*100/20);
		System.out.println("percentage of tail is:"+percentage+"%");
	}
}
