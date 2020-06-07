package visualize.plot;

import visualize.utils.RegExp;
import visualize.utils.TimeSerie;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Plot extends Application {
	public static TimeSerie ts;
	public static String header;

	public Plot() {
		super();
	}

	public static void launch(String code, String head) {
		ts = new TimeSerie(code + ".csv");
		header = head;
		Application.launch(Plot.class);
	}

	@Override
	public void start(Stage stage) throws Exception {

		ts.getData(header);
		stage.setTitle("Biểu đồ");

		final NumberAxis yAxis = new NumberAxis(0, 5000000, 1);
		final CategoryAxis xAxis = new CategoryAxis();
		final LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);

		yAxis.setLabel("Giá");
		xAxis.setLabel("Thời gian");
		xAxis.setAutoRanging(true);
		yAxis.setAutoRanging(true);

		lineChart.setTitle(header + " trong " + ts.length + " ngày gần nhất");
		XYChart.Series series = new XYChart.Series();

		series.setName(new RegExp().extractCode(ts.fileName));
		List<String> times = ts.getTimes();
		List<Float> figures = ts.getFigures();

		for (int i = 0; i < ts.getLength(); i++) {
			series.getData().add(new XYChart.Data(times.get(i), figures.get(i)));
		}

		lineChart.getData().addAll(series);
		Scene scene = new Scene(lineChart, 1000, 800);
		stage.setScene(scene);
		stage.show();
	}

}
