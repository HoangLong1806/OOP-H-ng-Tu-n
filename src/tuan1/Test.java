package tuan1;

import java.util.Scanner;

public class Test {
	public static HinhChuNhat nhapCung() {
		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.setChieuDai(5);
		hcn1.setChieuRong(3);
		HinhChuNhat hcn2 = new HinhChuNhat();
		hcn2.setChieuDai(5);
		hcn2.setChieuRong(4);
		return hcn1;

	}
	public static void main(String[] args) {
		nhapCung();
		
		System.out.println(nhapCung());
		System.out.println(nhapCung());
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao pham mem");
//		System.out.println("Nhap vao chieu dai");
//		double d = sc.nextDouble();
//		hcn1.setChieuDai(d);
//		System.out.println("Nhap vao chieu rong");
//		double c = sc.nextDouble();
//		hcn1.setChieuRong(c);
//		System.out.println(hcn1.toString());
	
		
	}
}
