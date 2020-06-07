package visualize;

import static visualize.utils.Config.*;

import visualize.plot.Plot;

public class Test {

	public static void main(String[] args) {
//		StockDataFrame test = new StockDataFrame("G20");
//		test.toDataBase();
//		RegExp re = new RegExp();
//		System.out.println(re.extractCode("nguadFVS.csv"));

//		TimeSerie ts = new TimeSerie("X18.csv");
//		ts.getData(3);
		try {
			Plot.launch("AAA", " GD khớp lệnh (khối lượng)");
		} catch (Exception e) {
			System.out.println("Mã code không tồn tại hoặc thông tin cần truy xuất không tồn tại");
			e.printStackTrace();
		}
	}
}
