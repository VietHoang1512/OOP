package visualize.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DataFrame {

	public String fileName;
	public Elements data;
	public List<String> headers = new ArrayList<String>();

	public DataFrame(String name) {
		fileName = name + ".csv";
	}

	public void getHeader() {
		Elements rawHeaders = data.get(0).select("td");
		for (Element e : rawHeaders) {
			if (e.attributes().toString().contains("none"))
				continue;
			String header = e.ownText().trim();
			if ((header.equals("GD khớp lệnh")) || (header.equals("GD thỏa thuận"))) {
				headers.add(header + " (khối lượng)");
				headers.add(header + " (giá trị)");
			} else {
				headers.add(header);
			}
		}
		data.remove(0);
		data.remove(0);
	}

	public void toCSV(String dir) {
		try {
//			TODO: os.path.join or kind of
			String dataPath = dir + fileName;
			FileWriter writer = new FileWriter(dataPath);

			writer.write(String.join(", ", headers));
			writer.write("\n");

			for (Element row : data) {

				Elements cells = row.getElementsByTag("td");
				for (Element cell : cells) {
					if (cell.attributes().toString().contains("none"))
						continue;
					String text = cell.text().replace(",", ".");
					if (!text.equals("")) {
						writer.write(text.concat(", "));
					}
				}
				writer.write("\n");
			}
			writer.close();
			System.out.println("Lưu dữ liệu vào " + dataPath + ". Xong!");
		} catch (IOException e) {
			System.out.println("Không thể lưu dữ liệu!");
			e.getStackTrace();
		}
	}
}
