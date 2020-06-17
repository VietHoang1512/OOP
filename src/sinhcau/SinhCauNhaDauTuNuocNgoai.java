package sinhcau;
import java.util.*;
import cackieudulieu.*;
import maucau.*;
import sosanhnhadautunuocngoai.*;
import java.util.Random;

public class SinhCauNhaDauTuNuocNgoai extends AbstractSinhCau {
	private List<NhaDauTuNuocNgoai> datalist = new ArrayList<>();
        public static List<String> sentences = new ArrayList<>();
	private String date;
	private String san;
	private long tongKhoiLuongMua;
	private long tongKhoiLuongBan;
	
	public void setDataList( List<NhaDauTuNuocNgoai> datalist ) {
		this.datalist = datalist;
	}
	
	public List<NhaDauTuNuocNgoai> getDataList(){
		return this.datalist;
	}
	
	public void setTongKhoiLuongMuaBan() {
		int i = 0;
		for(i = 0; i<this.datalist.size();i++) {
			this.tongKhoiLuongMua += datalist.get(i).getKhoiLuongMua();
			this.tongKhoiLuongBan += datalist.get(i).getKhoiLuongBan();
		}
	}
	
	public long getTongKhoiLuongMua() {
		return this.tongKhoiLuongMua;
	}
	
	public long getTongKhoiLuongBan() {
		return this.tongKhoiLuongBan;
	}
	
	public void setSanGiaoDich(String san) {
		this.san = san;
	}
	
	public String getSanGiaoDich() {
		return this.san;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String chenDuLieu(String sentence) {
		for(int i = 1; i<=5 ; i++) {
			sentence = sentence.replace("|Name"+i+"|",this.datalist.get(i).getType());
			sentence = sentence.replace("|Vol"+i+"|", this.datalist.get(i).getKhoiLuongMuaModified());
			sentence = sentence.replace("|SellVol"+i+"|", this.datalist.get(i).getKhoiLuongBanModified());
			sentence = sentence.replace("|VolRong"+i+"|", this.datalist.get(i).getKhoiLuongRongModified());
		}
		sentence = sentence.replace("|Sàn Giao Dịch|", this.san);
		sentence = sentence.replace("Ngày", this.date);
		return sentence;
	}
	
	public String sinhMuaNhieuCoPhieu(){
		Random rand = new Random();
		int j;
		double Sum =0, SumVol=0;
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getMuaNhieuCoPhieu());
		for(int i = 1; i<=5 ; i++) {
			do {
				j = rand.nextInt(this.datalist.size());
			} while(this.datalist.get(j).getKhoiLuongMua() == 0);
			sentence = sentence.replace("|Name"+i+"|", this.datalist.get(j).getType());
			sentence = sentence.replace("|Vol"+i+"|", this.datalist.get(j).getKhoiLuongMuaModified());
			SumVol += (double)this.datalist.get(j).getKhoiLuongMua();
			Sum += (double)this.datalist.get(j).getGiaTriMua();
		}
		if (Sum / 1000000000 >= 1)sentence = sentence.replace("|Sum|", String.format("%.2f", (Sum/1000000000)) + " tỷ");
		else if(Sum / 1000000 >= 1)sentence = sentence.replace("|Sum|", String.format("%.2f", (Sum/1000000)) + " triệu");
		else if(Sum / 1000 >= 1)sentence = sentence.replace("|Sum|", String.format("%.2f", (Sum/1000)) + " nghìn");
		else sentence = sentence.replace("|Sum|", String.format("%.2f", Sum));
		if (SumVol / 1000000000 >= 1)sentence = sentence.replace("|SumVol|", String.format("%.2f", (SumVol/1000000000)) + " tỷ");
		else if(SumVol / 1000000 >= 1)sentence = sentence.replace("|SumVol|", String.format("%.2f", (SumVol/1000000)) + " triệu");
		else if(SumVol / 1000 >= 1)sentence = sentence.replace("|SumVol|", String.format("%.2f", (SumVol/1000)) + " nghìn");
		else sentence = sentence.replace("|SumVol|", String.format("%.2f", SumVol));
		return sentence;
	}
	
	public String sinhMuaNhieuNhat() {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getMuaNhieuNhat());
		Collections.sort(this.datalist, new SoSanhKhoiLuongMua());
		Collections.reverse(this.datalist);
		sentence = chenDuLieu(sentence);
		return sentence;
	}
	
	public String sinhBanNhieuNhat() {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getBanNhieuNhat());
		Collections.sort(this.datalist, new SoSanhKhoiLuongBan());
		Collections.reverse(this.datalist);
		sentence = chenDuLieu(sentence);
		return sentence;
	}
	
	public String sinhMuaRong() {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getMuaRongNhieuNhat());
		Collections.sort(this.datalist, new SoSanhKhoiLuongRong());
		Collections.reverse(this.datalist);
		sentence = chenDuLieu(sentence);
		return sentence;
	}
	
	public String sinhBanRong() {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getBanRongNhieuNhat());
		Collections.sort(this.datalist, new SoSanhKhoiLuongRong());
		sentence = chenDuLieu(sentence);
		return sentence;
	}
	
	public String sinhTongKhoiLuongMua() {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongMua());
		sentence = sentence.replace("|Ngày|", this.date);
		sentence = sentence.replace("|Sàn Giao Dịch|", this.san);
		if (tongKhoiLuongMua / 1000000000 >= 1)sentence = sentence.replace("|Tổng Khối Lượng|", String.format("%.2f", (double)tongKhoiLuongMua/1000000000) + " tỷ");
		else if(tongKhoiLuongMua / 1000000 >= 1)sentence = sentence.replace("|Tổng Khối Lượng|", String.format("%.2f", (double)tongKhoiLuongMua/1000000) + " triệu");
		else if(tongKhoiLuongMua / 1000 >= 1)sentence = sentence.replace("|Tổng Khối Lượng|", String.format("%.2f", (double)tongKhoiLuongMua/1000) + " nghìn");
		else sentence = sentence.replace("|Tổng Khối Lượng|", String.format("%d", tongKhoiLuongMua));
		return sentence;
	}
	
	public String sinhTongKhoiLuongBan() {
		String sentence;
		sentence = sinhCauNgauNhien(MauCauNhaDauTuNuocNgoai.getTongKhoiLuongBan());
		sentence = sentence.replace("|Ngày|", this.date);
		sentence = sentence.replace("|Sàn Giao Dịch|", this.san);
		if (tongKhoiLuongBan / 1000000000 >= 1)sentence = sentence.replace("|Tổng Khối Lượng Bán|", String.format("%.2f", (double)tongKhoiLuongBan/1000000000) + " tỷ");
		else if(tongKhoiLuongBan / 1000000 >= 1)sentence = sentence.replace("|Tổng Khối Lượng Bán|", String.format("%.2f", (double)tongKhoiLuongBan/1000000) + " triệu");
		else if(tongKhoiLuongBan / 1000 >= 1)sentence = sentence.replace("|Tổng Khối Lượng Bán|", String.format("%.2f", (double)tongKhoiLuongBan/1000) + " nghìn");
		else sentence = sentence.replace("|Tổng Khối Lượng Bán|", String.format("%d", tongKhoiLuongBan));
		return sentence;
	}
	
	@Override
	public List<String> sinhDoanVan() {
		// TODO Auto-generated method stub
//		List<String> sentences = new ArrayList<>();
		sentences.add("Tin về nhà đầu tư nước ngoài trên sàn "+this.san+" vào ngày "+this.date+" :");
		sentences.add(this.sinhMuaNhieuCoPhieu());
		sentences.add(this.sinhMuaNhieuNhat());
		sentences.add(this.sinhBanNhieuNhat());
		sentences.add(this.sinhMuaRong());
		sentences.add(this.sinhBanRong());
		sentences.add(this.sinhTongKhoiLuongMua());
		sentences.add(this.sinhTongKhoiLuongBan());
		return sentences;
	}
	
}
