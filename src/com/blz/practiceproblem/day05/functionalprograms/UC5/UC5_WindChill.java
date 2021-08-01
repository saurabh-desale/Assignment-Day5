package com.blz.practiceproblem.day05.functionalprograms.UC5;

public class UC5_WindChill {
	public static void main(String[] args) {
        double t,v,w;
        t= Double.parseDouble(args[0]);
        v= Double.parseDouble(args[1]);
        w = 35.74 + 0.6215*t +(0.4275*t-35.75)*Math.pow(v, 0.16);
        System.out.println("temperature : "+t);
        System.out.println("wind speed : "+v);
        System.out.println("Wind chill : "+w);
        
	}

}
