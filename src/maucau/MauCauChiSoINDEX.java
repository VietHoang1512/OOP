package maucau;

public class MauCauChiSoINDEX {

	// Cac mau cau chot phien giao dich
	private static String[] ChotPhienGiaoDichTang = {
			"Chốt phiên ngày |Date|, chỉ số |StockCode| |Change|, lên thành |CloseValue| điểm.",
			"Đóng cửa phiên ngày |Date|, chỉ số |StockCode| tăng và dừng lại ở mức |CloseValue| điểm, |Change| so với phiên ngày trước đó.",
			"Phiên giao dịch ngày |Date| ghi nhận chỉ số |StockCode| đạt |CloseValue| điểm, |Change| so với phiên trước đó.",
			"Chỉ số |StockCode| tại lúc đóng cửa phiên giao dịch ngày |Date| đạt |CloseValue| điểm, ghi nhận |Change| so với ngày trước đó.",
			"Chỉ số |StockCode| tại giờ đóng cửa giao dịch đạt |CloseValue| điểm, |Change| so với phiên trước.",
			"Chốt phiên giao dịch ngày |Date|, |StockCode| tăng |ChangeVal| điểm , lên |CloseValue| điểm, chuyển nhượng |gdThoaThuanvol| triệu cổ phiếu, tương đương |gdThoaThuanval| tỷ đồng." };

	private static String[] ChotPhienGiaoDichGiam = {
			"Chốt phiên ngày |Date|, chỉ số |StockCode| |Change|, xuống còn |CloseValue| điểm.",
			"Đóng cửa phiên ngày |Date|, chỉ số |StockCode| giảm và dừng lại ở mức |CloseValue| điểm, |Change| so với phiên ngày trước đó.",
			"Phiên giao dịch ngày |Date| ghi nhận chỉ số |StockCode| còn |CloseValue| điểm, |Change| so với phiên trước đó.",
			"Chỉ số |StockCode| tại lúc đóng cửa phiên giao dịch ngày |Date| đạt |CloseValue| điểm, ghi nhận |Change| so với ngày trước đó.",
			"Chỉ số |StockCode| tại giờ đóng cửa giao dịch đạt |CloseValue| điểm, |Change| so với phiên trước.",
			"Chốt phiên giao dịch ngày |Date|, |StockCode| giảm |ChangeVal| điểm , lên |CloseValue| điểm, chuyển nhượng |gdThoaThuanvol| triệu cổ phiếu, tương đương |gdThoaThuanval| tỷ đồng." };

	// Mau cau khoi sac dau phien
	private static String[] KhoiSacDauPhienGiam = {
			"Bất chấp những khởi sắc đầu phiên giao dịch, cuối ngày |Date|, |StockCode| giảm xuống còn |CloseValue|, |Change| so với phiên trước đó.",
			"Mặc dù có những dấu hiệu khởi sắc đầu phiên, cuối ngày |Date|, |StockCode| giảm xuống còn |CloseValue|, |Change| so với phiên trước đó.",
			"Có dấu hiệu của sự hồi phục đầu phiên giao dịch, song chốt phiên ngày |Date|, |StockCode| giảm xuống còn |CloseValue|, |Change| so với phiên trước đó." };

	private static String[] KhoiSacDauPhienTang = {
			"Tiếp nối những sắc xanh từ đầu phiên giao dịch, cuối ngày |Date|, |StockCode| vươn lên, chạm mốc |CloseValue| điểm.",
			"Phiên giao dịch |Date| chứng kiến những thay đổi tích cực đối với chỉ số |StockCode|, theo đà đó, chốt phiên giao dịch, |StockCode| vươn lên, chạm mốc |CloseValue| điểm." };

	// Mau cau giam dau phien giao dich

	private static String[] GiamDauPhienGiam = {
			"Đầu phiên giao dịch ngày |Date| chứng kiến dấu hiệu giảm của chỉ số |StockCode|, theo đó, đóng cửa phiên, chỉ số |StockCode| giảm xuống còn |CloseValue| điểm.",
			"Chỉ số |StockCode| đã cho thấy những dấu hiệu tiêu cực ngay từ đầu phiên, kết thúc phiên giao dịch ngày |Date|, chỉ số |StockCode| tụt xuống còn |CloseValue| điểm."

	};

	private static String[] GiamDauPhienTang = {
			"Mặc dù khởi đầu trong không khí ảm đạm, chốt phiên giao dịch ngày |Date|, chỉ số |StockCode| tăng đến |CloseValue| điểm." };

	// Mau cau lien quan toi gia tri va khoi luong giao dich khop lenh

	private static String[] GiaoDichKhopLenh = {
			"Phiên giao dịch ngày |Date| ghi nhận trên |gdKhopLenhvol| triệu giao dịch khớp lệnh, tổng giá trị lên tới hơn |gdKhopLenhval| tỷ đồng.",
			"Đã có tổng cộng hơn |gdKhopLenhvol| triệu giao dịch khớp lệnh với tổng giá trị đạt trên |gdKhopLenhval| tỷ đồng trong phiên giao dịch ngày |Date|." };
	// Mau cau lien quan toi gia tri va khoi luong giao dich thoa thuan
	private static String[] GiaoDichThoaThuan = {
			"Phiên giao dịch ngày |Date| ghi nhận hơn |gdThoaThuanvol| triệu giao dịch thỏa thuận, tổng giá trị lên tới trên |gdThoaThuanval| tỷ đồng.",
			"Đã có tổng cộng trên |gdThoaThuanvol| triệu giao dịch thỏa thuận với tổng giá trị đạt hơn |gdThoaThuanval| tỷ đồng trong phiên giao dịch ngày |Date|." };

	// Mau cau nhan xet ve chi so INDEX voi phien truoc do
	private static String[] TangManh = {
			"So với phiên trước đó, chỉ số |StockCode| trong phiên giao dịch này tăng mạnh (|ChangeVal| điểm).",
			"Trong phiên giao dịch này ghi nhận chỉ số |StockCode| tăng mạnh so với phiên trước đó với mức tăng |ChangeVal| điểm." };

	private static String[] TangNhe = {
			"So với phiên giao dịch trước đó, chỉ số |StockCode| chỉ tăng nhẹ với mức |Change|" };

	private static String[] GiamNhe = {
			"So với phiên giao dịch trước đó, chỉ số |StockCode| chỉ giảm nhẹ với mức |Change|" };

	private static String[] GiamManh = {
			"Trong phiên giao dịch này ghi nhận chỉ số |StockCode| giảm sâu so với phiên trước đó với mức giảm |ChangeVal| điểm.", };

	// Mau cau danh gia cho nhieu ngay
	// Chi xet neu co >=3 ngay tang giam lien tiep
	private static String[] TangLienTuc = {
			"Chỉ số |StockCode| cho thấy những dấu hiệu tích cực khi tăng liên tục từ ngày |Date1| đến ngày |Date2|, tổng giá trị tăng lên tới |Sum| điểm.",
			"Trong các phiên giao dịch liên tiếp kể từ ngày |Date1| đến |Date2| chỉ số |StockCode| liên tục tăng từ |CloseValue1| đến |CloseValue2| điểm.",
			"|StockCode| liên tục tăng từ ngày |Date1| đến |Date2| với mức tăng tương ứng là |Sum| điểm." };

	private static String[] GiamLienTuc = {
			"Chỉ số |StockCode| cho thấy những dấu hiệu tiêu cực khi giảm liên tục từ ngày |Date1| đến ngày |Date2|, tổng giá trị giảm là |Sum| điểm.",
			"Trong các phiên giao dịch liên tiếp kể từ ngày |Date1| đến |Date2| chỉ số |StockCode| 'bốc hơi' liên tục từ |CloseValue1| đến |CloseValue2| điểm.",
			"|StockCode| liên tục giảm từ ngày |Date1| đến |Date2| với mức giảm tương ứng là |Sum| điểm." };

	private static String[] GiaCaoNhat = {
			"Trong khoảng thời gian trên, chỉ số |StockCode| đạt đỉnh tại mức |CloseValue| điểm tại ngày |Date|.",
			"Chỉ số |StockCode| trong khoảng thời gian trên chạm tới mốc cao nhất (|CloseValue| điểm) vào ngày |Date|." };

	private static String[] GiaThapNhat = {
			"Ngày |Date| ghi nhận chỉ số |StockCode| chạm đáy ở |CloseValue| điểm trong khoảng thời gian trên.",
			"Trong khoảng thời gian trên, chỉ số |StockCode| giảm xuống mức sâu nhất tại |CloseValue| điểm tại ngày |Date| " };

	private static String[] PhienTangManhNhat = {
			"Phiên giao dịch ngày |Date| ghi nhận chỉ số |StockCode| tăng mạnh nhất (|ChangeVal| điểm) so với phiên giao dịch ngay trước đó trong khoảng thời gian từ ngày |Date0| đến ngày |DateX|.", };

	private static String[] PhienGiamManhNhat = {
			"Khoảng thời gian từ ngày |Date0| đến |DateX| ghi nhận |StockCode| giảm mạnh nhất (|ChangeVal| điểm) so với phiên giao dịch trước đó vào ngày |Date|" };

	public static String[] getChotPhienGiaoDichTang() {
		return MauCauChiSoINDEX.ChotPhienGiaoDichTang;
	}

	public static String[] getChotPhienGiaoDichGiam() {
		return MauCauChiSoINDEX.ChotPhienGiaoDichGiam;
	}

	public static String[] getKhoiSacDauPhienTang() {
		return MauCauChiSoINDEX.KhoiSacDauPhienTang;
	}

	public static String[] getKhoiSacDauPhienGiam() {
		return MauCauChiSoINDEX.KhoiSacDauPhienGiam;
	}

	public static String[] getGiamDauPhienGiam() {
		return MauCauChiSoINDEX.GiamDauPhienGiam;
	}

	public static String[] getGiamDauPhienTang() {
		return MauCauChiSoINDEX.GiamDauPhienTang;
	}

	public static String[] getGiaoDichKhopLenh() {
		return MauCauChiSoINDEX.GiaoDichKhopLenh;
	}

	public static String[] getGiaoDichThoaThuan() {
		return MauCauChiSoINDEX.GiaoDichThoaThuan;
	}

	public static String[] getTangManh() {
		return MauCauChiSoINDEX.TangManh;
	}

	public static String[] getTangNhe() {
		return MauCauChiSoINDEX.TangNhe;
	}

	public static String[] getGiamManh() {
		return MauCauChiSoINDEX.GiamManh;
	}

	public static String[] getGiamNhe() {
		return MauCauChiSoINDEX.GiamNhe;
	}

	public static String[] getTangLienTuc() {
		return MauCauChiSoINDEX.TangLienTuc;
	}

	public static String[] getGiamLienTuc() {
		return MauCauChiSoINDEX.GiamLienTuc;
	}

	public static String[] getGiaCaoNhat() {
		return MauCauChiSoINDEX.GiaCaoNhat;
	}

	public static String[] getGiaThapNhat() {
		return MauCauChiSoINDEX.GiaThapNhat;
	}

	public static String[] getPhienTangManhNhat() {
		return MauCauChiSoINDEX.PhienTangManhNhat;
	}

	public static String[] getPhienGiamManhNhat() {
		return MauCauChiSoINDEX.PhienGiamManhNhat;
	}

}
