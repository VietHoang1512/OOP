package visualize.crawl;

import static visualize.utils.Config.*;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Crawler {
	public Elements getData(String code) throws IOException{
		
		String url = baseURL + code + "-1.chn";
		System.out.println("Đang lấy dữ liệu từ:" + url);
		Document doc = Jsoup.connect(url).timeout(5000).get();
		Elements data = doc.select("tbody").get(1).select("tr");	
		System.out.println("Xong!");
		return data;
	}
}
