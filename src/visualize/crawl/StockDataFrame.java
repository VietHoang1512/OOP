package visualize.crawl;

import static visualize.utils.Config.*;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import visualize.utils.DataFrame;
import visualize.utils.RegExp;

import java.util.*;

public class StockDataFrame extends DataFrame {
	public String stockCode;
			
	public StockDataFrame(String name) {
		super(name);
		stockCode = name;
	}

	public void getData() {
		Crawler crawler = new Crawler();
		try {
			data =  crawler.getData(stockCode);
		}catch (IOException e) {
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