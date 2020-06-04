package visualize.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.activation.MailcapCommandMap;

public class RegExp {

	public float extractFirstNum(String text) {
		float num = 0;
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(text);

		while (m.find()) {
			num = Float.parseFloat(m.group());
			break;
		}
		return num;
	}

	public String extractCode(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}
}
