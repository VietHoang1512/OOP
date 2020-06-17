package cackieudulieu;

import java.lang.Double;
import java.util.*;

public class BienDongChungKhoan {
	private String name; 			//Ten ma chung khoan
	private double vonHoa;			//Don vi cua von hoa la ty dong
	private double todayVal;
	private double todayChange;
	private double todayVol;
	private double aveMonthlyVal;	// Gia tri trung binh thang
	private double aveMonthlyVol;	// Khoi luong trung binh thang
	private double valueChange;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setVonHoa(String vonHoa) {
		int j;
		for(j = 0; j< vonHoa.length();j++)
			if(vonHoa.charAt(j) == ' ' )  break;
		//tim den vi tri dau tien xuat hien dau cach
		//System.out.println(vonHoa.substring(0, j));
		this.vonHoa = Double.parseDouble(vonHoa.substring(0, j));
	}
	
	public void setTodayValandChange(String ValAndChange) {
		int i,j;
		for(i = 0; i< ValAndChange.length();i++)
			if(ValAndChange.charAt(i) == '(' ) break;
		for(j = 0; j< ValAndChange.length();j++)
			if(ValAndChange.charAt(j) == ')' ) break;
		this.todayVal = Double.parseDouble(ValAndChange.substring(0, i));
		this.todayChange = Double.parseDouble(ValAndChange.substring(i+1,j-2));
	}
	
	public void setTodayVol(String todayVol) {
		this.todayVol = Double.parseDouble(todayVol);
	}
	
	// Bieu do cung cap su thay doi cua ngay hom nay so voi trung binh thang
	// Tu do tinh ra du lieu trung binh cho thang vua qua
	public void setAveMonthlyVal(String aveMonthlyVal) {
		this.valueChange = Double.parseDouble(aveMonthlyVal);
		this.aveMonthlyVal = this.todayVal*100/(100 + Double.parseDouble(aveMonthlyVal));
	}
	
	public void setAveMonthlyVol(String aveMonthlyVol) {
		double change;
		if(aveMonthlyVol.charAt(0) == '-')
			change = 0.0;
		else
			change = Double.parseDouble(aveMonthlyVol);
		this.aveMonthlyVol = this.todayVol*100/(100 + change);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getVonHoa() {
		return this.vonHoa;
	}
	
	public double getTodayVal() {
		return this.todayVal;
	}
	
	public double getTodayChange() {
		return this.todayChange;
	}
	
	public double getTodayVol() {
		return this.todayVol;
	}
	
	public double getAveMonthlyVal() {
		return this.aveMonthlyVal;
	}
	
	public double getAveMonthlyVol() {
		return this.aveMonthlyVol;
	}
	
	public double getValueChange() {
		return this.valueChange;
	}
	
	public String getVonHoaModified() {
		if(this.vonHoa/1000 > 1.0) return String.format("%.2f", this.vonHoa/1000) + " nghìn";
		else 
			return String.format("%.2f", this.vonHoa);
	}
	
	public String getAveMonthlyVolModified() {
		if(this.aveMonthlyVol/1000000 > 1.0) return String.format("%.2f", this.aveMonthlyVol/1000000) + " triệu";
		else if(this.aveMonthlyVol/1000 > 1.0) return String.format("%.2f", this.aveMonthlyVol/1000) + " nghìn";
		else return String.format("%.2f", this.aveMonthlyVol) ;
	}
	
	public void displayData() {
		System.out.println(this.name + "|" + this.vonHoa + "|" + this.todayVal + "|" + this.todayChange + "|" + this.todayVol + "|" + this.aveMonthlyVal +"|"+this.aveMonthlyVol);
	}
}
