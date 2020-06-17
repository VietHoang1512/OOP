package sinhcau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import cackieudulieu.ChungKhoanTheoNgay;
import maucau.MauCauTheoNgay;
import sosanhdulieuchungkhoantheongay.SoSanhDiemChotPhien;
import sosanhdulieuchungkhoantheongay.SoSanhDiemMoPhien;
import sosanhdulieuchungkhoantheongay.SoSanhKhoiLuongGiaoDich;
import sosanhdulieuchungkhoantheongay.SoSanhTinhOnDinh;

public class SinhCauTheoNgay extends AbstractSinhCau {
	public SinhCauTheoNgay() {

	}

	public List<ChungKhoanTheoNgay> datalist = new ArrayList<>();
	public static List<String> sentences = new ArrayList<>();

	public String sinhCauNgauNhien(String[] sentences) {
		Random rd = new Random();
		return sentences[rd.nextInt(sentences.length)];
	}

	// Thay the cac key word va du lieu trong cau bang cac thuoc tinh cua data
	public String chenDuLieu(String sentence, ChungKhoanTheoNgay data) {
		sentence = sentence.replace("|date|", data.getDate());
		sentence = sentence.replace("|ticker|", data.getTicker());
		sentence = sentence.replace("|openValue|", Double.toString(data.getOpenValue()) + " đồng");
		sentence = sentence.replace("|closeValue|", Double.toString(data.getCloseValue()) + " đồng");
		sentence = sentence.replace("|highestValue|", Double.toString(data.getHighestValue()) + " đồng");
		sentence = sentence.replace("|lowestValue|", Double.toString(data.getLowestValue()) + " đồng");
		sentence = sentence.replace("|dif|", Double.toString(Math.abs(data.getDif())) + " đồng");
		sentence = sentence.replace("|volume|", data.convertVolume());
		return sentence;
	}

	public String chenListDuLieu(String sentence, List<ChungKhoanTheoNgay> datalist) {
		sentence = sentence.replace("|date|", datalist.get(0).getDate());
		sentence = sentence.replace("|ticker0|", datalist.get(0).getTicker());
		sentence = sentence.replace("|ticker1|", datalist.get(1).getTicker());
		sentence = sentence.replace("|ticker2|", datalist.get(2).getTicker());
		sentence = sentence.replace("|ticker3|", datalist.get(3).getTicker());
		sentence = sentence.replace("|ticker4|", datalist.get(4).getTicker());
		sentence = sentence.replace("|openValue0|", Double.toString(datalist.get(0).getOpenValue()) + " đồng");
		sentence = sentence.replace("|closeValue0|",
				Double.toString(Math.abs(datalist.get(0).getCloseValue())) + " đồng");
		sentence = sentence.replace("|volume0|", datalist.get(0).convertVolume());
		return sentence;
	}

	// Sinh cau theo 1 ma
	public String soVoiDauPhien(ChungKhoanTheoNgay data) {
		if (data.getDif() > 0)
			return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getTangSoVoiBanDau()), data);
		else if (data.getDif() == 0)
			return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getBangSoVoiBanDau()), data);
		else
			return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiamSoVoiBanDau()), data);
	}

	public String giaDauNgay(ChungKhoanTheoNgay data) {
		return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaDauNgay()), data);
	}

	public String giaCuoiNgay(ChungKhoanTheoNgay data) {
		return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCuoiNgay()), data);
	}

	public String giaCaoNhat(ChungKhoanTheoNgay data) {
		return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoNhat()), data);
	}

	public String giaThapNhat(ChungKhoanTheoNgay data) {
		return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapNhat()), data);
	}

	public String khoiLuongGiaodich(ChungKhoanTheoNgay data) {
		return chenDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getKhoiLuongGiaoDich()), data);
	}

	// Sinh cau theo nhieu ma
	public String giaCaoThapDauPhien(List<ChungKhoanTheoNgay> datalist) {
		String sentence1, sentence2;
		datalist.sort(new SoSanhDiemMoPhien());
		sentence1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapDauNgay()), datalist);
		Collections.reverse(datalist);
		sentence2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoDauNgay()), datalist);
		return sentence1 + "\n" + sentence2;
	}

	public String giaCaoThapChotPhien(List<ChungKhoanTheoNgay> datalist) {
		String sentence1, sentence2;
		datalist.sort(new SoSanhDiemChotPhien());
		sentence1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaThapCuoiNgay()), datalist);
		Collections.reverse(datalist);
		sentence2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaCaoCuoiNgay()), datalist);
		return sentence1 + "\n" + sentence2;
	}

	public String sapXepKhoiLuongGiaoDich(List<ChungKhoanTheoNgay> datalist) {
		String sentence1, sentence2;
		datalist.sort(new SoSanhKhoiLuongGiaoDich());
		sentence1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaoDichIt()), datalist);
		Collections.reverse(datalist);
		sentence2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getGiaoDichNhieu()), datalist);
		return sentence1 + "\n" + sentence2;
	}

	public String maOnDinh(List<ChungKhoanTheoNgay> datalist) {
		String sentence1, sentence2;
		datalist.sort(new SoSanhTinhOnDinh());
		sentence1 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getMaOnDinh()), datalist);
		Collections.reverse(datalist);
		sentence2 = chenListDuLieu(sinhCauNgauNhien(MauCauTheoNgay.getMaKhongOnDinh()), datalist);
		return sentence1 + "\n" + sentence2;
	}

	public List<String> sinhDoanVan() {
//		List<String> sentences = new ArrayList<>();
		Random rd = new Random();
		int i = rd.nextInt(datalist.size());
		sentences.add(
				"Tin về sàn giao dịch " + datalist.get(i).getStockCode() + " ngày " + datalist.get(i).getDate() + " :");
		sentences.add(giaDauNgay(datalist.get(i)));
		sentences.add(giaCuoiNgay(datalist.get(i)));
		sentences.add(soVoiDauPhien(datalist.get(i)));
		sentences.add(giaCaoNhat(datalist.get(i)));
		sentences.add(giaThapNhat(datalist.get(i)));
		sentences.add(khoiLuongGiaodich(datalist.get(i)));
		sentences.add(giaCaoThapDauPhien(datalist));
		sentences.add(giaCaoThapChotPhien(datalist));
		sentences.add(sapXepKhoiLuongGiaoDich(datalist));
		sentences.add(maOnDinh(datalist));
		return sentences;
	}
}
