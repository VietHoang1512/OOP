package visualize;

import static visualize.utils.Config.*;

import visualize.crawl.StockDataFrame;
import visualize.utils.TimeSerie;

import visualize.plot.Plot;

import javafx.stage.Stage;

public class Test {

	public static void main(String[] args) {
//		StockDataFrame test = new StockDataFrame("G20");
//		test.toDataBase();
//		RegExp re = new RegExp();
//		System.out.println(re.extractCode("nguadFVS.csv"));

		TimeSerie ts = new TimeSerie("X18.csv");
		ts.getData(3);

//		Plot plot = new Plot();
//		plot.getSerie("VNINDEX", 3);
//		try {
//			plot.start(new Stage());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
	}
}
