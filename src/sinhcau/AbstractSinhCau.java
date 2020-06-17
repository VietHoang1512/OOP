package sinhcau;

import java.util.Random;
import java.util.List;

public abstract class AbstractSinhCau {
	public String sinhCauNgauNhien(String[] sentences) {
		String a;
		Random rand = new Random();
		int i;
		i = rand.nextInt(sentences.length);
		a = sentences[i];
		return a;
	}
	
	public abstract List<String> sinhDoanVan();
}
