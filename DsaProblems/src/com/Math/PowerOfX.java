package com.Math;

public class PowerOfX {
	
	public static double pow(double x,int n) {
		
		double ans = 1.0;
		long nn = n;
		
		if(nn<0) {
			nn = -1*n;
		}
		
		while(nn>0) {
			
			if(nn%2==0) {
				nn=nn/2;
				x=x*x;
				
			}else {
				nn=nn-1;
				ans = ans*x;
			}
		}
		
		if(n<0) {
			ans = (double)(1.0)/(double)(ans);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		double x = 2.00000;
		int n = 10;
		
		System.out.println(String.format("%.5f",pow(x,n)));
		
	}
	
}
