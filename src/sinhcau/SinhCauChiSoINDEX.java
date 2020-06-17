package sinhcau;
import cackieudulieu.ChiSoINDEX;
import maucau.MauCauChiSoINDEX;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class SinhCauChiSoINDEX extends AbstractSinhCau {
	private List<ChiSoINDEX> datalist = new ArrayList<>();
        public static List<String> sentences = new ArrayList<>();
	
	
	public void setDataList(List<ChiSoINDEX> datalist) {
		this.datalist = datalist;
	}
	
	public List<ChiSoINDEX> getDataList(){
		return this.datalist;
	}
	
	// Thay the cac key word va du lieu trong cau bang cac thuoc tinh cua data
	public String chenDuLieu(String sentence,ChiSoINDEX data) {
		sentence = sentence.replace("|StockCode|", data.getStockCode());
		sentence = sentence.replace("|Date|", data.getDate());
		sentence = sentence.replace("|OpenValue|", Double.toString(data.getOpenValue()));
		sentence = sentence.replace("|CloseValue|", Double.toString(data.getCloseValue()));
		sentence = sentence.replace("|HighestValue|", Double.toString(data.getHighestValue()));
		sentence = sentence.replace("|LowestValue|", Double.toString(data.getLowestValue()));
		sentence = sentence.replace("|Change|", data.changeModify());
		sentence = sentence.replace("|ChangeVal|", Double.toString(Math.abs(data.getChangeVal())));
		sentence = sentence.replace("|ChangePer|", Double.toString(Math.abs(data.getChangePer())));
		sentence = sentence.replace("|gdKhopLenhvol|", Integer.toString(data.quyDoiGDKhopLenhvol()));
		sentence = sentence.replace("|gdKhopLenhval|", Long.toString(data.quyDoiGDKhopLenhval()));
		sentence = sentence.replace("|gdThoaThuanvol|", Long.toString(data.quyDoiGDThoaThuanvol()));
		sentence = sentence.replace("|gdThoaThuanval|", Long.toString(data.quyDoiGDThoaThuanval()));
		sentence = sentence.replace("|DateX|", this.datalist.get(0).getDate());
		sentence = sentence.replace("|Date0|", this.datalist.get(this.datalist.size()-1).getDate());
		return sentence;
	}
	
	//Sinh cau chot phien giao dich tu chi so data
	public String sinhChotPhienGiaoDich(ChiSoINDEX data) {
		String sentence;
		if(data.getChangeVal() < 0)
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getChotPhienGiaoDichGiam());
		else
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getChotPhienGiaoDichTang());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	}
	
	public String sinhMoPhienGiaoDich(ChiSoINDEX data) {
		String sentence;
		if(data.getThayDoiDauPhien() > 0 && data.getChangeVal() > 0)
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getKhoiSacDauPhienTang());
		else if(data.getThayDoiDauPhien() > 0 && data.getChangeVal() < 0)
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getKhoiSacDauPhienGiam());
		else if(data.getThayDoiDauPhien() <= 0 && data.getChangeVal() > 0)
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiamDauPhienTang());
		else
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiamDauPhienGiam());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	}
	
	public String sinhGiaCaoNhat(ChiSoINDEX data) {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiaCaoNhat());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	};
	
	public String sinhGiaThapNhat(ChiSoINDEX data) {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiaThapNhat());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	};
	
	public String sinhPhienTangManhNhat(ChiSoINDEX data) {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getPhienTangManhNhat());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	};
	
	public String sinhPhienGiamManhNhat(ChiSoINDEX data) {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getPhienGiamManhNhat());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	};
	
	public String sinhGDKhopLenh(ChiSoINDEX data) {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiaoDichKhopLenh());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	}
	
	public String sinhGDThoaThuan(ChiSoINDEX data) {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiaoDichThoaThuan());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	}
	
	public String sinhCauDanhGia(ChiSoINDEX data) {
		String sentence;
		if(data.getChangePer() > 1) sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getTangManh());
		else if(data.getChangePer() > 0 && data.getChangePer() < 1) sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getTangNhe());
		else if(data.getChangePer() <=0 && data.getChangePer() >-1) sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiamNhe());
		else sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiamManh());
		sentence = chenDuLieu(sentence,data);
		return sentence;
	}
	
	
	//Sinh cau du lieu cho mot ngay
	public List<String> sinhCauDuLieuMotNgay(ChiSoINDEX data){
		List<String> sentences = new ArrayList<>();
		sentences.add("Tin về " + data.getStockCode() + " ngày " + data.getDate() +" :");
		sentences.add(sinhMoPhienGiaoDich(data));
		sentences.add(sinhGDKhopLenh(data));
		sentences.add(sinhGDThoaThuan(data));
		sentences.add(sinhChotPhienGiaoDich(data));
		sentences.add(sinhCauDanhGia(data));
		return sentences;
	};

	
	//Sinh cau danh gia tong quat cho ca quang thoi gian
	public List<String> sinhCauDuLieuNhieuNgay() {
		List<String> sentences = new ArrayList<>();
		int i,j;
		double sum = 0.0;
		String sentence;
		ChiSoINDEX max_change = this.datalist.get(0);
		ChiSoINDEX min_change = this.datalist.get(0);
		ChiSoINDEX max_price = this.datalist.get(0);
		ChiSoINDEX min_price = this.datalist.get(0);
		for(i=0;i<this.datalist.size();i++) {
			if(this.datalist.get(i).getChangeVal() > max_change.getChangeVal()) max_change = this.datalist.get(i);
			if(this.datalist.get(i).getChangeVal() < min_change.getChangeVal()) min_change = this.datalist.get(i);
			if(this.datalist.get(i).getCloseValue() > max_price.getCloseValue()) max_price = this.datalist.get(i);
			if(this.datalist.get(i).getCloseValue() < min_price.getCloseValue()) min_price = this.datalist.get(i);
		}
		sentences.add("Đánh giá tổng quan: ");
		sentences.add(sinhGiaCaoNhat(max_price));
		sentences.add(sinhGiaThapNhat(min_price));
		sentences.add(sinhPhienTangManhNhat(max_change));
		sentences.add(sinhPhienGiamManhNhat(min_change));
		
		
		// Tim cac khoang thoi gian tang lien tiep, giam lien tiep;
		for(i = 0;i<this.datalist.size()-2;i++) {
			//Neu gap 3 ngay lien tiep thi tim cho den khi khong tang nua thi dung lai
			if((this.datalist.get(i).getChangeVal() > 0) && (this.datalist.get(i+1).getChangeVal() > 0) && (this.datalist.get(i+2).getChangeVal() > 0)) {
				j = i+2;
				while(j+1< this.datalist.size()){
					if(this.datalist.get(j+1).getChangeVal() > 0) j++;
					else break;
				}
			for(int k = i; k <= j ; k++)
				sum += this.datalist.get(k).getChangeVal();
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getTangLienTuc());
			sentence = sentence.replace("|Date1|", this.datalist.get(j).getDate());
			sentence = sentence.replace("|Date2|", this.datalist.get(i).getDate());
			sentence = sentence.replace("|StockCode|", this.datalist.get(i).getStockCode());
			sentence = sentence.replace("|CloseValue1|", Double.toString(this.datalist.get(j).getCloseValue()));
			sentence = sentence.replace("|CloseValue2|", Double.toString(this.datalist.get(i).getCloseValue()));
			sentence = sentence.replace("|Sum|", String.format("%.2f", sum));
			sentences.add(sentence);
			i = j;
			}
			
			//Neu gap 3 ngay lien tiep giam lien tiep tim den khi nao khong giam nua thi dung lai
			if((this.datalist.get(i).getChangeVal() < 0) && (this.datalist.get(i+1).getChangeVal() < 0) && (this.datalist.get(i+2).getChangeVal() < 0)) {
				j = i+2;
				while(j+1<this.datalist.size()){
					if(this.datalist.get(j+1).getChangeVal() < 0) j++;
					else break;
				}
			for(int k = i; k <= j ; k++)
				sum += this.datalist.get(k).getChangeVal();
			sentence = sinhCauNgauNhien(MauCauChiSoINDEX.getGiamLienTuc());
			sentence = sentence.replace("|Date1|", this.datalist.get(j).getDate());
			sentence = sentence.replace("|Date2|", this.datalist.get(i).getDate());
			sentence = sentence.replace("|StockCode|", this.datalist.get(i).getStockCode());
			sentence = sentence.replace("|CloseValue1|", Double.toString(this.datalist.get(j).getCloseValue()));
			sentence = sentence.replace("|CloseValue2|", Double.toString(this.datalist.get(i).getCloseValue()));
			sentence = sentence.replace("|Sum|", String.format("%.2f", sum));
			sentences.add(sentence);
			i = j;
			}
			
		}
		return sentences;
	}
	
	public List<String> mergeList(List<String> list1, List<String> list2){
		for(int i = 0; i< list2.size(); i++) {
			list1.add(list2.get(i));
		}
		return list1;
	}
	
	@Override
	public List<String> sinhDoanVan() {
		// TODO Auto-generated method stub
//		List<String> sentences = new ArrayList<>();
		Random rand = new Random();
		int i;
		int sen_count = 0;
		sentences.add("TIN VỀ CHỈ SỐ "+datalist.get(0).getStockCode()+" TRONG KHOẢNG THỜI GIAN TỪ "+datalist.get(datalist.size()-1).getDate()+" ĐẾN "+datalist.get(0).getDate()+" :");
		// mo ta du lieu ngay gan nhat
		sentences = mergeList(sentences,sinhCauDuLieuMotNgay(datalist.get(0)));
		// mo ta du lieu 3 ngay ngau nhien trong khoang thoi gian
		while(sen_count < 3) {
			// i phai khac ngay dau va ngay cuoi
			i = rand.nextInt(datalist.size() - 2) +1;
			sentences = mergeList(sentences,sinhCauDuLieuMotNgay(datalist.get(i)));
			sen_count ++;
		}
		// mo ta du lieu ngay xa nhat
		sentences = mergeList(sentences,sinhCauDuLieuMotNgay(datalist.get(datalist.size()-1)));
		
		// mo ta du lieu tong quan cho ca quang thoi gian
		sentences = mergeList(sentences,sinhCauDuLieuNhieuNgay());
		return sentences;
	}
		
}
