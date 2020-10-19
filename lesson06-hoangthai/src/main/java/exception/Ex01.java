package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 
{
    public static void main( String[] args )
    {
    	phuongTrinhBacNhat();
    	nhapMatKhau();
    }
    private static void phuongTrinhBacNhat() {
    	Scanner sc = new Scanner(System.in);
    	double a, b;
    	double x;
    	boolean check;
    	do {
    		check = false;
    		try {
        		System.out.println(" nhập a: ");
            	a = sc.nextDouble();
            	if(a==0) {
            		throw new Exception();
            	}
            	System.out.println(" nhập b: ");
            	b = sc.nextDouble();
            	x=-b/a;
            	System.out.println(" kq: " + x);
        	} catch (InputMismatchException e) {
        		check = true;
    		} catch(Exception e) {
    			System.out.println("a khong duoc bang 0");
    			check = true;
    		}
    	} while(check);
    }
    private static void nhapMatKhau() {
    	String matKhau;
    	Scanner sc = new Scanner(System.in);
    	
    	boolean check;
    	try {
    		System.out.println("nhap mk: ");
        	matKhau = sc.next();
			check = false;
    		if(matKhau.length()<8) {
        		throw new Exception("khong duoc it hon 8 ký tu");
        	} else if(matKhau.length()>256) {
        		throw new Exception("khong duoc nhieu hon 256 ký tu");
        	}else if(matKhau.length()>256) {
        		throw new Exception("khong duoc nhieu hon 256 ký tu");
        	}else if(!matKhau.matches(".*[a-z]+.*")) {
    			throw new Exception("chua it nhat 1 chu thuong");
    		}else if(!matKhau.matches(".*[A-Z]+.*")) {
    			throw new Exception("chua it nhat 1 chu in hoa");
    		}else if(!matKhau.matches(".*\\d+.*")) {
    			throw new Exception("chua it nhat 1 chu so");
    		}
    		else if(!matKhau.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
    			throw new Exception("chua it nhat 1 ky tu dat biet");
    		}
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		check = true;
    	}
    	while(check) {
    		try {
    			System.out.println("nhap mk: ");
    	    	matKhau = sc.next();
    			check = false;
        		if(matKhau.length()<8) {
            		throw new Exception("khong duoc it hon 8 ký tu");
            	} else if(matKhau.length()>256) {
            		throw new Exception("khong duoc nhieu hon 256 ký tu");
            	}else if(matKhau.length()>256) {
            		throw new Exception("khong duoc nhieu hon 256 ký tu");
            	}else if(!matKhau.matches(".*[a-z]+.*")) {
        			throw new Exception("chua it nhat 1 chu thuong");
        		}else if(!matKhau.matches(".*[A-Z]+.*")) {
        			throw new Exception("chua it nhat 1 chu in hoa");
        		}else if(!matKhau.matches(".*\\d+.*")) {
        			throw new Exception("chua it nhat 1 chu so");
        		}
        		else if(!matKhau.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
        			throw new Exception("chua it nhat 1 ky tu dat biet");
        		}
        	} catch(Exception e) {
        		System.out.println(e.getMessage());
        		check = true;
        	}
    	}
    }
    private static void docSo() {
    	Scanner sc = new Scanner(System.in);
    	int so;
    	System.out.println("nhap so: ");
    	so = sc.nextInt();
    	String hangTram, hangChuc, hangDV;
    	
    }
}
