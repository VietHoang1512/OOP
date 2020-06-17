package cackieudulieu;

public class ChungKhoanTheoNgay {
	private String stockCode;
	private String ticker;
	private String date;
	private double openValue;
	private double highestValue;
	private double lowestValue;
	private double closeValue;
	private int volume;
	private double amplitude;
	private double dif;

	public ChungKhoanTheoNgay() {

	}

	public String convertVolume() {
		String string = volume > 1000000 ? "hơn " + volume / 1000000 + " triệu"
				: volume > 1000 ? "hơn " + volume / 1000 + " nghìn" : String.valueOf(volume);
		return string;
	}

	public String getStockCode() {
		return this.stockCode;
	}

	public String getTicker() {
		return ticker;
	}

	public String getDate() {
		return date;
	}

	public double getOpenValue() {
		return 1000 * openValue;
	}

	public double getHighestValue() {
		return 1000 * highestValue;
	}

	public double getLowestValue() {
		return 1000 * lowestValue;
	}

	public double getCloseValue() {
		return 1000 * closeValue;
	}

	public int getVolume() {
		return volume;
	}

	public double getAmplitude() {
		this.amplitude = (highestValue - lowestValue) / lowestValue;
		return amplitude;
	}

	public double getDif() {
		this.dif = 1000 * closeValue - 1000 * openValue;
		return dif;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public void setDate(String date) {
		this.date = date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4);
	}

	public void setOpenValue(double openValue) {
		this.openValue = openValue;
	}

	public void setHighestValue(double highestValue) {
		this.highestValue = highestValue;
	}

	public void setLowestValue(double lowestValue) {
		this.lowestValue = lowestValue;
	}

	public void setCloseValue(double closeValue) {
		this.closeValue = closeValue;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void displayData() {
		System.out.println(stockCode + "|" + ticker + "|" + date + "|" + openValue + "|" + highestValue + "|"
				+ lowestValue + "|" + closeValue + "|" + volume);
	}

}