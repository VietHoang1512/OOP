package visualize;

import visualize.plot.Plot;

public class Test {

	public static void main(String[] args) {
		try {
			new Plot().launch("VNINDEX", " GD khớp lệnh (khối lượng)");

		} catch (Exception e) {
			System.out.println("Mã code hoặc thông tin cần truy xuất không tồn tại");
			e.printStackTrace();
		}
//		try {
//			new Plot().launch("VNINDEX", " GD khớp lệnh (khối lượng)");
//
//		} catch (Exception e) {
//			System.out.println("Mã code hoặc thông tin cần truy xuất không tồn tại");
//			e.printStackTrace();
//		}
	}
}
