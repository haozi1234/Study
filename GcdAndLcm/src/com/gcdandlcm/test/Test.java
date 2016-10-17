package com.gcdandlcm.test;

public class Test {

	@org.junit.Test
	public void test() {
		
		int m = 12;
		int n = 8;
		System.out.println("GCD:" + GCD(m, n));
		System.out.println("LCM:" + LCM(m, n));
	}
	
	/**
	 * ���Լ��
	 * @param m
	 * @param n
	 * @return
	 */
    public int GCD(int m, int n) {  
    
    	//��֤m>n����m<n����������ݽ���
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

    /**
     * ��С������
     * @param m
     * @param n
     * @return
     */
    public int LCM(int m, int n) {
        
    	return m * n / GCD(m, n);
    }
}