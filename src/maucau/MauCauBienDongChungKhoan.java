package maucau;

public class MauCauBienDongChungKhoan {
	private static String[] GiaoDichNhieuNhat = {
			"Đứng đầu về khối lượng giao dịch tháng qua là |Name1|, với |TodayVol1| cổ phiếu, kế đến là |Name2|, |Name3|.",
			"Top 3 cổ phiếu đứng đầu về khối lượng giao dịch trong tháng qua, |Name1| dẫn đầu thị trường (|TodayVol1| cổ phiếu), theo sau là  |Name2| (|TodayVol2| cổ phiếu) và |Name3| (|TodayVol3| cổ phiếu)", };

	private static String[] GiaoDichItNhat = {
			"Trong khi đó ở chiều ngược lại, |Name1| là mã cổ phiếu chạm đáy xét về khối lượng giao dịch trong tháng vừa qua với |TodayVol1|.",
			"Đứng cuối về khối lượng giao dịch trong một tháng trở lại đây là |Name1|, với |TodayVol1| cổ phiếu, kế đến là |Name2|, |Name3|. ",
			"|Name1| là mã cổ phiếu có khối lượng giao dịch ít nhất tháng vừa qua với |TodayVol1| cổ phiếu, xếp ngay sau đó là |Name2| và |Name3|.", };

	private static String[] VonHoaLonNhat = {
			"Hai cổ phiếu có vốn hóa lớn nhất thị trường trong tháng vừa qua là |Name1| và |Name2| với giá trị lần lượt là |VonHoa1| và |VonHoa2| tỷ đồng.",
			"Trong 1 tháng trở lại đây, |Name1| là cổ phiếu có vốn hóa lớn nhất thị trường (|VonHoa1| tỷ đồng), theo sau đó là |Name2| (|VonHoa2| tỷ đồng)." };

	private static String[] VonHoaNhoNhat = {
			"Đối lập với xu thế này, |Name1| là mã có vốn hóa ở cuối bảng với |VonHoa1| tỷ đồng, xếp ngay trên là |Name2| với |VonHoa2| tỷ đồng.",
			"Trong khi đó, |Name1|, |Name2| là hai cổ phiếu có vốn hóa thấp nhất với giá trị lần lượt là |VonHoa1| và |VonHoa2| tỷ đồng." };

	private static String[] GiaCaoNhat = {
			"|Name1| là mã cổ phiếu có giá cao nhất trong tháng vừa qua, ngay sau đó là |Name2| và |Name3|.",
			"Đứng đầu bảng về giá là mã cổ phiếu |Name1|, tiếp theo đó là |Name2| và |Name3|.",
			"Top 3 mã cổ phiếu có giá cao nhất trong tháng qua lần lượt là |Name1|, |Name2| và |Name3|." };

	private static String[] GiaThapNhat = {
			"Ba mã cổ phiếu có giá thấp nhất trong tháng vừa qua lần lượt là |Name1| ,|Name2| và |Name3|.",
			"Đứng cuối bảng về giá là mã |Name1|, nhỉnh hơn một chút là các mã |Name2|, |Name3|.",
			"|Name1| là mã cổ phiếu có giá đứng áp chót bảng." };

	private static String[] TangNhieuNhat = {
			"Trong tháng qua, thị trường chứng khoán chứng kiến sự tăng trưởng mạnh mẽ của mã cổ phiếu |Name1| .",
			"Top 3 cổ phiếu có mức độ tăng trưởng về giá hàng đầu trong tháng qua là |Name1|, |Name2| và |Name3|.",
			"|Name1| tăng trưởng mạnh nhất tháng qua, theo ngay sau đó là |Name2|, |Name3|." };

	public static String[] getGiaoDichNhieuNhat() {
		return MauCauBienDongChungKhoan.GiaoDichNhieuNhat;
	}

	public static String[] getGiaoDichItNhat() {
		return MauCauBienDongChungKhoan.GiaoDichItNhat;
	}

	public static String[] getVonHoaLonNhat() {
		return MauCauBienDongChungKhoan.VonHoaLonNhat;
	}

	public static String[] getVonHoaNhoNhat() {
		return MauCauBienDongChungKhoan.VonHoaNhoNhat;
	}

	public static String[] getGiaCaoNhat() {
		return MauCauBienDongChungKhoan.GiaCaoNhat;
	}

	public static String[] getGiaThapNhat() {
		return MauCauBienDongChungKhoan.GiaThapNhat;
	}

	public static String[] getTangNhieuNhat() {
		return MauCauBienDongChungKhoan.TangNhieuNhat;
	}
}
