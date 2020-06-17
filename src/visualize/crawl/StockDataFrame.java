package visualize.crawl;

import static visualize.utils.Config.dataDir;

import java.io.IOException;

import visualize.utils.DataFrame;

public class StockDataFrame extends DataFrame {
	public String stockCode;

	public StockDataFrame(String name) {
		super(name);
		stockCode = name;
	}

	public void getData() {
		Crawler crawler = new Crawler();
		try {
			data = crawler.getData(stockCode);
		} catch (IOException e) {
			System.out.println("Không thể lấy dữ liệu từ trang này, yêu cầu thử lại!");
			e.getStackTrace();
		}
	}

	public void toDataBase() {
		this.getData();
		this.getHeader();
		this.toCSV(dataDir);
	}
}