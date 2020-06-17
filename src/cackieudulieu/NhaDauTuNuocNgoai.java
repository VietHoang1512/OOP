package cackieudulieu;

public class NhaDauTuNuocNgoai {
	private String type;
	private long khoiLuongMua;
	private long giaTriMua;
	private long khoiLuongBan;
	private long giaTriBan;
	private long khoiLuongRong;
	private long giaoDichRong;
	private long roomConLai;
	private double dangSoHuu;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getKhoiLuongMua() {
		return this.khoiLuongMua;
	}

	public void setKhoiLuongMua(long khoiLuongMua) {
		this.khoiLuongMua = khoiLuongMua;
	}

	public long getGiaTriMua() {
		return this.giaTriMua;
	}

	public void setGiaTriMua(long giaTriMua) {
		this.giaTriMua = giaTriMua;
	}

	public long getKhoiLuongBan() {
		return this.khoiLuongBan;
	}

	public void setKhoiLuongBan(long khoiLuongBan) {
		this.khoiLuongBan = khoiLuongBan;
	}

	public long getGiaTriBan() {
		return this.giaTriBan;
	}

	public void setGiaTriBan(long giaTriBan) {
		this.giaTriBan = giaTriBan;
	}

	public long getKhoiLuongRong() {
		return this.khoiLuongRong;
	}

	public void setKhoiLuongRong(long khoiLuongRong) {
		this.khoiLuongRong = khoiLuongRong;
	}

	public long getGiaoDichRong() {
		return this.giaoDichRong;
	}

	public void setGiaoDichRong(long giaoDichRong) {
		this.giaoDichRong = giaoDichRong;
	}

	public long getRoomConLai() {
		return this.roomConLai;
	}

	public void setRoomConLai(long roomConLai) {
		this.roomConLai = roomConLai;
	}

	public double getDangSoHuu() {
		return this.dangSoHuu;
	}

	public void setDangSoHuu(double dangSoHuu) {
		this.dangSoHuu = dangSoHuu;
	}

	public String getKhoiLuongMuaModified() {
		if (khoiLuongMua / 1000000 >= 1)
			return String.format("%.2f", (double) khoiLuongMua / 1000000) + " triệu";
		else if (khoiLuongMua / 1000 >= 1)
			return String.format("%.2f", (double) khoiLuongMua / 1000) + " nghìn";
		else
			return String.format("%d", khoiLuongMua);
	}

	public String getKhoiLuongBanModified() {
		if (khoiLuongBan / 1000000 >= 1)
			return String.format("%.2f", (double) khoiLuongBan / 1000000) + " triệu";
		else if (khoiLuongBan / 1000 >= 1)
			return String.format("%.2f", (double) khoiLuongBan / 1000) + " nghìn";
		else
			return String.format("%d", khoiLuongBan);
	}

	public String getKhoiLuongRongModified() {
		if (khoiLuongRong / 1000000 >= 1)
			return String.format("%.2f", (double) khoiLuongRong / 1000000) + " triệu";
		else if (khoiLuongRong / 1000 >= 1)
			return String.format("%.2f", (double) khoiLuongRong / 1000) + " nghìn";
		else
			return String.format("%d", khoiLuongRong);
	}

	public void displayData() {
		System.out.println(type + "|" + khoiLuongMua + "|" + giaTriMua + "|" + khoiLuongBan + "|" + giaTriBan + "|"
				+ khoiLuongRong + "|" + giaoDichRong + "|" + roomConLai + "|" + dangSoHuu);
	}

}
