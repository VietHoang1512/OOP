package sinhcau;

import java.util.List; 

import java.util.ArrayList;
import cackieudulieu.BienDongChungKhoan;
import sosanhdulieubiendongchungkhoan.*;
import maucau.MauCauBienDongChungKhoan;
import java.util.*;

public class SinhCauBienDongChungKhoan extends AbstractSinhCau {
	private List<BienDongChungKhoan> datalist = new ArrayList<>();
        public static List<String> sentences = new ArrayList<>();
	
	public void setDataList(List<BienDongChungKhoan> datalist) {
		this.datalist = datalist;
		listModify();
	}
	
	public List<BienDongChungKhoan> getDataList() {
		return this.datalist;
	}
	
	public void listModify() {
		for(int i = 0; i<this.datalist.size(); i++) {
			// xoa nhung phan tu co khoi luong giao dich trong ngay bang 0.0 va von hoa bang 0.0 vi nhu the ta khong danh gia duoc
			if(this.datalist.get(i).getTodayVol() == 0.0) {
				this.datalist.remove(i);
				i--;
			}
			if(this.datalist.get(i).getVonHoa() == 0.0) {
				this.datalist.remove(i);
				i--;
			}
		}
	}
	
	public String sinhCauGiaoDichNhieuNhat() {
		String sentence;
		Collections.sort(this.datalist,new AveMonthlyVolComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getGiaoDichNhieuNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(0).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(1).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(2).getName());
		sentence = sentence.replace("|TodayVol1|", this.datalist.get(0).getAveMonthlyVolModified());
		sentence = sentence.replace("|TodayVol2|", this.datalist.get(1).getAveMonthlyVolModified());
		sentence = sentence.replace("|TodayVol3|", this.datalist.get(2).getAveMonthlyVolModified());
		return sentence;
	}
	
	public String sinhCauGiaoDichItNhat() {
		String sentence;
		Collections.sort(this.datalist,new AveMonthlyVolComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getGiaoDichItNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(this.datalist.size()-1).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(this.datalist.size()-2).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(this.datalist.size()-3).getName());
		sentence = sentence.replace("|TodayVol1|", this.datalist.get(this.datalist.size()-1).getAveMonthlyVolModified());
		sentence = sentence.replace("|TodayVol2|", this.datalist.get(this.datalist.size()-2).getAveMonthlyVolModified());
		sentence = sentence.replace("|TodayVol3|", this.datalist.get(this.datalist.size()-3).getAveMonthlyVolModified());
		return sentence;
	}
	
	public String sinhCauVonHoaMax() {
		String sentence;
		Collections.sort(this.datalist,new VonHoaComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getVonHoaLonNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(0).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(1).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(2).getName());
		sentence = sentence.replace("|VonHoa1|", this.datalist.get(0).getVonHoaModified());
		sentence = sentence.replace("|VonHoa2|", this.datalist.get(1).getVonHoaModified());
		sentence = sentence.replace("|VonHoa3|", this.datalist.get(2).getVonHoaModified());
		return sentence;
	}
	
	public String sinhCauVonHoaMin() {
		String sentence;
		Collections.sort(this.datalist,new VonHoaComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getVonHoaNhoNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(this.datalist.size()-1).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(this.datalist.size()-2).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(this.datalist.size()-3).getName());
		sentence = sentence.replace("|VonHoa1|", this.datalist.get(this.datalist.size()-1).getVonHoaModified());
		sentence = sentence.replace("|VonHoa2|", this.datalist.get(this.datalist.size()-2).getVonHoaModified());
		sentence = sentence.replace("|VonHoa3|", this.datalist.get(this.datalist.size()-3).getVonHoaModified());
		return sentence;
	}
	
	public String sinhCauGiaCaoNhat() {
		String sentence;
		Collections.sort(this.datalist,new AveMonthlyValComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getGiaCaoNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(0).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(1).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(2).getName());
		return sentence;
	}
	
	public String sinhCauGiaThapNhat() {
		String sentence;
		Collections.sort(this.datalist,new AveMonthlyValComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getGiaThapNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(this.datalist.size()-1).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(this.datalist.size()-2).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(this.datalist.size()-3).getName());
		return sentence;
	}
	
	public String sinhCauTangNhieuNhat() {
		String sentence;
		Collections.sort(this.datalist, new ChangeComparator());
		sentence = sinhCauNgauNhien(MauCauBienDongChungKhoan.getTangNhieuNhat());
		sentence = sentence.replace("|Name1|", this.datalist.get(0).getName());
		sentence = sentence.replace("|Name2|", this.datalist.get(1).getName());
		sentence = sentence.replace("|Name3|", this.datalist.get(2).getName());
		return sentence;
	}

	@Override
	public List<String> sinhDoanVan() {
		// TODO Auto-generated method stub
//		List<String> sentences = new ArrayList<>();
		sentences.add("Biến động chứng khoán trong vòng 1 tháng trở lại đây:");
		sentences.add(sinhCauGiaoDichNhieuNhat());
		sentences.add(sinhCauGiaoDichItNhat());
		sentences.add(sinhCauVonHoaMax());
		sentences.add(sinhCauVonHoaMin());
		sentences.add(sinhCauGiaCaoNhat());
		sentences.add(sinhCauGiaThapNhat());
		sentences.add(sinhCauTangNhieuNhat());
		return sentences;
	}
	
}
