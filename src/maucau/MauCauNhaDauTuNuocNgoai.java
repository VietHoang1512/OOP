package maucau;

public class MauCauNhaDauTuNuocNgoai {
	private static String[] tongKhoiLuongMua = {
			"Tổng Khối lượng mua ngày |Ngày| của sàn giao dịch |Sàn Giao Dịch| là |Tổng Khối Lượng|",
			"Ngày |Ngày| , Tổng Khối lượng mua trên sàn giao dịch |Sàn Giao Dịch| đạt |Tổng Khối Lượng|" };

	private static String[] tongKhoiLuongBan = {
			"Tổng Khối lượng bán ngày |Ngày| của sàn giao dịch |Sàn Giao Dịch| là |Tổng Khối Lượng Bán|",
			"Ngày |Ngày| , Tổng Khối lượng bán trên sàn giao dịch |Sàn Giao Dịch| đạt |Tổng Khối Lượng Bán|", };

	private static String[] coPhieuCoKhoiLuongMuaLonNhat = {
			"Cổ Phiếu |Mua Nhiều Nhất| được rao mua nhiều nhất trong ngày.Tổng sức mua là |Max| ",
			"|Mua Nhiều Nhất| là Cổ phiếu được mua nhiều nhất với số lượng là |Max|",
			"Được Mua Với số lượng |Max|, Cổ Phiếu |Mua Nhiều Nhất| đạt kỷ lục về lượng bán",
			"Các Nhà Đầu tư tranh nhau mua Cổ phiếu |Mua  Nhiều Nhất|, Khối lượng giao dịch đạt ngưỡng |Max|",

	};

	private static String[] muaNhieuCoPhieu = {
			"Nhà đầu tư nước ngoài mua vào |SumVol| cổ phiếu (|Name1| |Vol1|, |Name2| |Vol2|, |Name3| |Vol3|, |Name4| |Vol4|, |Name5| |Vol5|).",
			"Nhà đầu tư nước ngoài mua vào |Vol1| |Name1|, |Vol2| |Name2|, |Vol3| |Name3| và |Vol4| |Name4| với tổng giá trị mua đạt |Sum| đồng." };

	private static String[] muaNhieuNhat = {
			"Lượng mua của nhà đầu tư nước ngoài hôm nay tập trung chủ yếu vào các mã như |Name1| |Vol1| đơn vị, |Name2| |Vol2| đơn vị, |Name3| |Vol3| đơn vị.",
			"Cổ Phiếu |Name1| được rao mua nhiều nhất trong ngày.Tổng sức mua là |Vol1| ",
			"|Name1| là Cổ phiếu được mua nhiều nhất với số lượng là |Vol1|",
			"Được Mua Với số lượng |Vol1|, Cổ Phiếu |Name1| đạt kỷ lục về lượng bán",
			"Các Nhà Đầu tư tranh nhau mua Cổ phiếu |Name1|, Khối lượng giao dịch đạt ngưỡng |Vol1|",

	};

	private static String[] banRongNhieuNhat = {
			"Nhà đầu tư nước ngoài tiếp tục bán ròng trên sàn |Sàn Giao Dịch| và |Name1| là mã bị bán ra nhiều nhất." };

	private static String[] muaRongNhieuNhat = {
			"Khối ngoại đổ tiền vào |Name1|, |Name2|, |Name3|, trong đó |Name1| được nhà đầu tư nước ngoài mua ròng hơn |VolRong1| cổ phiếu." };

	private static String[] banNhieuNhat = {
			"Trong phiên, các nhà đầu tư nước ngoài bán ra khá nhiều cổ phiếu, tập trung vào các mã |Name1|, |Name2|, |Name3|.",
			"Cổ Phiếu được bán nhiều nhất là |SellVol1| |Name1|",
			"Với số lượng bán ròng |SellVol1|,|Name1| là cổ phiếu được bán nhiều nhất trong ngày ",
			"Ngày Hôm nay, Cổ Phiếu được bán nhiều nhất là |Name1|, với số lượng là |SellVol1|",
			"Khối lượng bán ròng đạt |SellVol1|,|Name1| dẫn đầu về khối lượng bán ròng",
			"Khối Lượng bán ròng của |Name1| đạt Ngưỡng |SellVol1|, Một kỷ lục vô tiền khoáng hậu" };

	public static String[] getTongKhoiLuongMua() {
		return MauCauNhaDauTuNuocNgoai.tongKhoiLuongMua;
	}

	public static String[] getTongKhoiLuongBan() {
		return MauCauNhaDauTuNuocNgoai.tongKhoiLuongBan;
	}

	public static String[] getCoPhieuCoKhoiLuongMuaLonNhat() {
		return MauCauNhaDauTuNuocNgoai.coPhieuCoKhoiLuongMuaLonNhat;
	}

	public static String[] getMuaNhieuNhat() {
		return MauCauNhaDauTuNuocNgoai.muaNhieuNhat;
	}

	public static String[] getBanNhieuNhat() {
		return MauCauNhaDauTuNuocNgoai.banNhieuNhat;
	}

	public static String[] getMuaNhieuCoPhieu() {
		return MauCauNhaDauTuNuocNgoai.muaNhieuCoPhieu;
	}

	public static String[] getMuaRongNhieuNhat() {
		return MauCauNhaDauTuNuocNgoai.muaRongNhieuNhat;
	}

	public static String[] getBanRongNhieuNhat() {
		return MauCauNhaDauTuNuocNgoai.banRongNhieuNhat;
	}
}
