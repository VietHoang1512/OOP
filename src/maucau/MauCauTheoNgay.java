package maucau;

public class MauCauTheoNgay {
	 public MauCauTheoNgay() {
		 
	 }
	 
	// Mau cau co phieu tang gia
	private static String[] tangSoVoiBanDau = {
		"Chốt phiên ngày |date|, giá cổ phiếu |ticker| tăng từ |openValue| lên thành |closeValue| .",
		"Đóng cửa phiên ngày |date|, giá cổ phiếu |ticker| dừng lại ở mức |closeValue|,tăng |dif| so với khi mở cửa phiên giao dịch.",
		"Phiên giao dịch ngày |date| ghi nhận giá cổ phiếu |ticker| đạt |closeValue|,tăng |dif| so với khi mở cửa phiên giao dịch.",
		"Cổ phiếu |ticker| tại lúc đóng cửa phiên giao dịch ngày |date| đạt |closeValue|,ghi nhận tăng |dif| so với thời điểm bắt đầu phiên giao dịch." 
	};
	private static String[] bangSoVoiBanDau = {
		"Chốt phiên ngày |date|, giá cổ phiếu |ticker| đứng giá tại |openValue| .",
		"Đóng cửa phiên ngày |date|, giá cổ phiếu |ticker| dừng lại ở mức |closeValue|,không đổi so với khi mở cửa phiên giao dịch.",
		"Phiên giao dịch ngày |date| ghi nhận giá cổ phiếu |ticker| đạt |closeValue|,không đổi so với khi mở cửa phiên giao dịch.",
		"Cổ phiếu |ticker| tại lúc đóng cửa phiên giao dịch ngày |date| đạt |closeValue|,ghi nhận không đổi so với thời điểm bắt đầu phiên giao dịch." 
	};

	// Mau cau co phieu giam gia
	private static  String[] giamSoVoiBanDau = {
		"Chốt phiên ngày |date|, giá cổ phiếu |ticker| giảm từ |openValue| xuống thành |closeValue|.",
		"Đóng cửa phiên ngày |date|, giá cổ phiếu |ticker| dừng lại ở mức |closeValue|,giảm |dif| so với khi mở cửa phiên giao dịch.",
		"Phiên giao dịch ngày |date| ghi nhận giá cổ phiếu |ticker| đạt |closeValue|,giảm |dif| so với khi mở cửa phiên giao dịch.",
		"Cổ phiếu |ticker| tại lúc đóng cửa phiên giao dịch ngày |date| chỉ đạt |closeValue|,ghi nhận giảm |dif| so với thời điểm bắt đầu phiên giao dịch." 
	};

	// Mau cau ve cac co phieu hot
	private static String[] giaoDichNhieu = {
		"Kết thúc phiên ngày |date|,các cổ phiếu được giao dịch nhiều nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "Trong đó,đứng đầu là mã cổ phiếu |ticker0| với khối lượng giao dịch |volume0|",
		"Chốt phiên ngày |date| các cổ phiếu được nhà đầu tư giao dịch nhiều nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "Trong đó |ticker0| đang dẫn đầu xu thế thị trường với khối lượng giao dịch |volume0|",
		"Hết phiên ngày |date|,các cổ phiếu đang dẫn đầu xu thế thị trường là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| " 
	};

	// Mau cau ve cac co phieu khong hot
	private static String[] giaoDichIt = {
		"Kết thúc phiên ngày |date|,các cổ phiếu được giao dịch ít nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "Trong đó,thấp nhất là mã cổ phiếu |ticker0| với khối lượng giao dịch |volume0|",
		"Chốt phiên ngày |date| các cổ phiếu được nhà đầu tư giao dịch ít nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "Trong đó |ticker0| ít được các nhà đầu tư quan tâm nhất với khối lượng giao dịch |volume0|",
		"Hết phiên ngày |date|,các cổ phiếu ít được các nhà đầu tư quan tâm nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| " 
	};

	// Cac mau cau ve cac co phieu co gia cao
	private static String[] giaCaoDauNgay = {
		"Mở cửa phiên giao dịch ngày |date|,cổ phiếu có giá cao nhất là |ticker0| với giá |openValue0|/1 cổ phiếu.",
		"Mở cửa phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá cao nhất ",
		"Mở đầu phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá cao nhất,trong đó đứng đầu là |ticker0| với giá |openValue0|/1 cổ phiếu "
	};
	private static String[] giaCaoCuoiNgay = {
		"Kết thúc phiên giao dịch ngày |date|,cổ phiếu có giá cao nhất là |ticker0| với giá |closeValue0|/1 cổ phiếu.",
		"Đóng cửa phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá cao nhất ",
		"Chốt phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá cao nhất,trong đó đứng đầu là |ticker0| với giá |closeValue0|/1 cổ phiếu " 
	};

	// Cac mau cau ve cac co phieu co gia thap
	private static String[] giaThapDauNgay = {
		"Mở cửa phiên giao dịch ngày |date|,cổ phiếu có giá thấp nhất là |ticker0| với giá |openValue0|/1 cổ phiếu.",
		"Mở cửa phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá thấp nhất ",
		"Mở đầu phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá thấp nhất,trong đó nổi bật là |ticker0| với giá |openValue0|/1 cổ phiếu "
	};
	private static String[] giaThapCuoiNgay = {
		"Kết thúc phiên giao dịch ngày |date|,cổ phiếu có giá thấp nhất là |ticker0| với giá |closeValue0|/1 cổ phiếu.",
		"Đóng cửa phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá thấp nhất ",
		"Chốt phiên giao dịch ngày |date| ghi nhận các mã cổ phiếu |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| "
			+ "có giá thấp nhất,trong đó nổi bật là |ticker0| với giá |closeValue0|/1 cổ phiếu " 
	};

	// Cac mau cau noi ve gia co phieu
	private static String[] giaDauNgay = {
		"Mở cửa phiên giao dịch ngày |date| ghi nhận cổ phiếu |ticker| có giá |openValue|/1 cổ phiếu",
		"Mở đầu phiên giao dịch ngày |date|,1 cổ phiếu |ticker| có giá |openValue|",
		"Giá trị 1 cổ phiếu |ticker| là |openValue| tại thời điểm bắt đầu phiên ngày |date|" 
	};
	private static String[] giaCuoiNgay = {
		"Đóng cửa phiên giao dịch ngày |date| ghi nhận cổ phiếu |ticker| có giá |closeValue|/1 cổ phiếu",
		"Chốt phiên giao dịch ngày |date|,1 cổ phiếu |ticker| có giá |closeValue|",
		"Giá trị 1 cổ phiếu |ticker| là |closeValue| tại thời điểm kết thúc phiên ngày |date|" 
	};
	private static String[] giaCaoNhat = {
		"Trong phiên ngày |date| ghi nhận từng có thời điểm giá cổ phiếu |ticker| đạt |highestValue|",
		"Giá trị cao nhất của cổ phiếu |ticker| trong phiên ngày |date| là |highestValue|",
		"Cổ phiếu |ticker| đạt giá trị cao nhất là |highestValue| trong phiên ngày |date|" 
	};
	private static String[] giaThapNhat = {
		"Trong phiên ngày |date| ghi nhận từng có thời điểm giá cổ phiếu |ticker| đạt |lowestValue|",
		"Giá trị thấp nhất của cổ phiếu |ticker| trong phiên ngày |date| là |lowestValue|",
		"Cổ phiếu |ticker| đạt giá trị thấp nhất là |lowestValue| trong phiên ngày |date|" 
	};

	// Mau cau noi ve khoi luong giao dich
	private static String[] khoiLuongGiaoDich = {
		"Trong phiên ngày |date|,mã cổ phiếu |ticker| đạt khối lượng giao dịch |volume|",
		"Có tổng cộng |volume| lượt giao dịch cổ phiếu |ticker| trong phiên ngày |date|" 
	};

	// Cac mau cau noi ve cac co phieu on dinh va khong on dinh
	private static String[] maOnDinh = {
		"Các mã cổ phiếu có độ ổn định cao nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| ", 
	};
	private static String[] maKhongOnDinh = {
		"Các mã cổ phiếu có độ ổn định thấp nhất là |ticker0|,|ticker1|,|ticker2|,|ticker3|,|ticker4| ",
	};
	public static String[] getTangSoVoiBanDau() {
		return tangSoVoiBanDau;
	}
	public static String[] getBangSoVoiBanDau() {
		return bangSoVoiBanDau;
	}
	public static String[] getGiamSoVoiBanDau() {
		return giamSoVoiBanDau;
	}
	public static String[] getGiaoDichNhieu() {
		return giaoDichNhieu;
	}
	public static String[] getGiaoDichIt() {
		return giaoDichIt;
	}
	public static String[] getGiaCaoDauNgay() {
		return giaCaoDauNgay;
	}
	public static String[] getGiaCaoCuoiNgay() {
		return giaCaoCuoiNgay;
	}
	public static String[] getGiaThapDauNgay() {
		return giaThapDauNgay;
	}
	public static String[] getGiaThapCuoiNgay() {
		return giaThapCuoiNgay;
	}
	public static String[] getGiaDauNgay() {
		return giaDauNgay;
	}
	public static String[] getGiaCuoiNgay() {
		return giaCuoiNgay;
	}
	public static String[] getGiaCaoNhat() {
		return giaCaoNhat;
	}
	public static String[] getGiaThapNhat() {
		return giaThapNhat;
	}
	public static String[] getKhoiLuongGiaoDich() {
		return khoiLuongGiaoDich;
	}
	public static String[] getMaOnDinh() {
		return maOnDinh;
	}
	public static String[] getMaKhongOnDinh() {
		return maKhongOnDinh;
	}
	
}