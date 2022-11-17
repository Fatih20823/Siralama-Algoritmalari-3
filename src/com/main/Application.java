package com.main;

public class Application {

	public static void main(String[] args) {
		// 3 - Inserting Sort Algoritmaları (eklemeli sıralama)
		
		long counter = 0;
		int[] dizi = new int[] {5,3,2,6,1,4};
		// for (int i = 0; i < dizi.lemgth ; i++) dizi[i] = (int) (Math.random()*21);
		long time1 = System.nanoTime();
		for(int k = 0; k < dizi.length;k++) System.out.printf("%3d", dizi[k]);System.out.println();
		
		
		for (int i = 1; i < dizi.length; i++) {
		    int key = dizi[i];
		    int j = i-1;
		    while(j>=0 && dizi[j]>key) {
		    	dizi[j+1] = dizi[j];
		    	j = j-1;
		    }
		    dizi[j+1]=key;
		}
		
		
		for(int k = 0; k < dizi.length;k++) System.out.printf("%3d", dizi[k]);System.out.println();
		
		long time2 = System.nanoTime();
		time1 = (time2-time1) / 1000/1000; // 1.000.000'a bolduk cunku milisaniye bazında alıcaz sureyi
		
		// nanoTime(); saniyenin 1 milyarda 1'ini ifade eder
	}

}
