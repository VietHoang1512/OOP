package visualize.utils;

import com.opencsv.CSVReader;

import visualize.crawl.StockDataFrame;

import static visualize.utils.Config.dataDir;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.io.File;
import java.io.IOException;

public class TimeSerie {
	public List<String> times = new ArrayList<String>();
	public List<Float> figures = new ArrayList<Float>();
	public int length = 0;
	public String fileName;

	public TimeSerie(String name) {
		fileName = name;
	}

	public boolean checkExist() {
		File tempFile = new File(dataDir + fileName);
		boolean exists = tempFile.exists();
		return exists;
	}

	public void getData(String header) {
		System.out.println("Đang kiểm tra trong cơ sở dữ liệu ...");
		if (!checkExist()) {
			System.out.println("Chưa có trong cơ sở dữ liệu. Bắt đầu tải về...");
			RegExp re = new RegExp();
			StockDataFrame data = new StockDataFrame(re.extractCode(fileName));
			data.toDataBase();
			getData(header);

		} else {
			System.out.println("Dữ liệu đã có sẵn");
			String[] headers;
			try (CSVReader dataReader = new CSVReader(new FileReader(dataDir + fileName), ',', '\'', 0)) {
				headers = dataReader.readNext();

				int column = Arrays.asList(headers).indexOf(header);
				String[] nextLine;
				RegExp re = new RegExp();
				while ((nextLine = dataReader.readNext()) != null) {
					String time = nextLine[0];
					float figure = re.extractFirstNum(nextLine[column]);
					addSample(time, figure);
				}
				System.out.println("Đã lấy dữ liệu cho time serie");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void addSample(String time, float figure) {
		times.add(time);
		figures.add(figure);
		length++;
	}

	public List getTimes() {
		return times;
	}

	public List getFigures() {
		return figures;
	}

	public int getLength() {
		return length;
	}
}
