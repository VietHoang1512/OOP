package cackieudulieu;
import java.lang.Double;

public class ChiSoINDEX {
	private String stockCode;
	private String date;
	private double openValue;
	private double highestValue;
	private double lowestValue;
	private double closeValue;
	private String change; 			//Chu y: thay doi la thay doi so voi ngay truoc do
	private long gdKhopLenhvol;
	private long gdKhopLenhval;
	private long gdThoaThuanvol;
	private long gdThoaThuanval;
	private double changeVal; 		// Gia tri thay doi so voi phien truoc
	private double changePer;		// Phan tram thay doi so voi phien truoc
	
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setOpenValue(double openValue) {
		this.openValue = openValue;
	}
	
	public void setHighestValue(double highestValue) {
		this.highestValue = highestValue;
	}
	
	public void setLowestValue(double lowestValue) {
		this.lowestValue = lowestValue;
	}
	
	public void setCloseValue(double closeValue) {
		this.closeValue = closeValue;
	}
	
	// Khi set gia tri cho String change thi set luon hai gia tri changeVal va changePer
	public void setChange(String change) {
		this.change = change;
		int i;
		int j;
		for(i = 0; i< change.length();i++)
			if(change.charAt(i) == '(' ) break;
		for(j = i; j< change.length();j++)
			if(change.charAt(j) == ')' ) break;
		this.changeVal = Double.parseDouble(this.change.substring(1, i-1));
		this.changePer = Double.parseDouble(this.change.substring(i+1,j-1));
	}
	
	public void setGDKhopLenhVol(long gdKhopLenhvol) {
		this.gdKhopLenhvol = gdKhopLenhvol;
	}
	
	public void setGDKhopLenhval(long gdKhopLenhval) {
		this.gdKhopLenhval = gdKhopLenhval;
	}
	
	public void setGDThoaThuanvol(long gdThoaThuanvol) {
		this.gdThoaThuanvol = gdThoaThuanvol;
	}
	
	public void setGDThoaThuanval(long gdThoaThuanval) {
		this.gdThoaThuanval = gdThoaThuanval;
	}
	
	public String getStockCode() {
		return this.stockCode;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public double getOpenValue() {
		return this.openValue;
	}
	
	public double getHighestValue() {
		return this.highestValue;
	}
	
	public double getLowestValue() {
		return this.lowestValue;
	}
	
	public double getCloseValue() {
		return this.closeValue;
	}
	
	public long getGDKhopLenhvol() {
		return this.gdKhopLenhvol;
	}
	
	public long getGDKhopLenhval() {
		return this.gdKhopLenhval;
	}
	
	public long getGDThoaThuanvol() {
		return this.gdThoaThuanvol;
	}
	
	public long getGDThoaThuanval() {
		return this.gdThoaThuanval;
	}
	
	public String getChange() {
		return this.change;
	}
	
	public double getChangeVal() {
		return this.changeVal;
	}
	
	public double getChangePer() {
		return this.changePer;
	}
	
	public String changeModify() {
		String a;
		int i,j; //luu hai vi tri xuat hien dau ( va )
		String figure1;
		String figure2;
			if(this.getChange().charAt(1) == '-') {
			// tu -1.91 (-0.25 %) doi thanh "giam 1.91 diem (tuong duong voi 0.25%)	
				for(i = 0; i< this.getChange().length();i++)
					if(this.getChange().charAt(i) == '(' ) break;
				for(j = i; j< this.getChange().length();j++)
					if(this.getChange().charAt(j) == ')' ) break;
				figure1 = this.getChange().substring(2,i-1);
				figure2 = this.getChange().substring(i+2,j);
				a = "giảm " + figure1 + " điểm ( tương đương với "+ figure2 + ")";
			}
			else {
			// tu 1.91 (0.25 %) doi thanh tang 1.91 diem (tương duong voi 0.25%)
				for(i = 0; i< this.getChange().length();i++)
					if(this.getChange().charAt(i) == '(' ) break;
				for(j = i; j< this.getChange().length();j++)
					if(this.getChange().charAt(j) == ')' ) break;
				figure1 = this.getChange().substring(1, i-1);
				figure2 = this.getChange().substring(i+1,j);
				a = "tăng " + figure1 + " điểm ( tương đương với "+ figure2 + ")";
			}
		return a;
	}
	
	public void displayData() {
		System.out.println( stockCode + "|" + date + "|" + closeValue + "|" + changeVal + "|" + changePer + "|" + openValue + "|" + highestValue + "|" + lowestValue +"|"+ gdThoaThuanvol +"|"+ gdThoaThuanval);
	}
	// lay gia tri thay doi dau phien hom nay va cuoi phien truoc do
	public double getThayDoiDauPhien() {
		double change = openValue - (closeValue - changeVal);
		return change;
	}
	// quy doi don vi cua so gd khop lenh va gd thoa thuan thanh (trieu giao dich)
	public int quyDoiGDKhopLenhvol() {
		int a;
		a = (int)(gdKhopLenhvol/1000000);
		return a;
	}
	
	public int quyDoiGDThoaThuanvol() {
		int a;
		a = (int)(gdThoaThuanvol/1000000);
		return a;
	}
	
	// quy doi don vi cua gia tri gd khop lenh va gd thoa thuan thanh (ty dong)
	public int quyDoiGDKhopLenhval() {
		int a;
		a = (int)(gdKhopLenhval/1000000000);
		return a;
	}
	
	public int quyDoiGDThoaThuanval() {
		int a;
		a = (int)(gdThoaThuanval/1000000000);
		return a;
	}
	
	
}
