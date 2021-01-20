package ex01;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex01 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println(i);
			arr[i] = sc.nextInt();
					}
	
	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	for (int i = 0; i < n; i++) {
        addElement(map, arr[i]);
    }
	for(int i=0; i<n;i++) {
		System.out.println(" cac phan tu chi xuat hien 1 lan: ");
		for(Integer cnt : map.keySet()) {
			if(map.get(cnt)==1) {
				System.out.println(cnt + " ");
			}
		}
		}
		
		
	}
	
	public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
	}
