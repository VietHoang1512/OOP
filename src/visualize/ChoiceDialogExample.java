package visualize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import visualize.utils.RegExp;
import visualize.utils.TimeSerie;

public class ChoiceDialogExample extends Application {

	private Label label;

	private void showChoiceDialog() {

		TimeSerie vnIndex100 = new TimeSerie("VN100-INDEX.csv");
		TimeSerie vnIndex30 = new TimeSerie("VN30INDEX.csv");
		TimeSerie vnIndex = new TimeSerie("VNINDEX.csv");
		List<TimeSerie> stocks = new ArrayList<TimeSerie>(Arrays.asList(vnIndex100, vnIndex30, vnIndex));

		TimeSerie defaultChoice = vnIndex;

		ChoiceDialog<TimeSerie> dialog = new ChoiceDialog<TimeSerie>(defaultChoice, stocks);

		dialog.setTitle("Chọn mã");
		dialog.setHeaderText("Okê anh, chọn mã muốn sinh nào");
		dialog.setContentText("Mã:");

		Optional<TimeSerie> result = dialog.showAndWait();

		result.ifPresent(ts -> {
			String header = " GD khớp lệnh (khối lượng)";
//        	Plot.launch(ts.getCode(), header);

			ts.getData(header);
			Stage newStage = new Stage();
			newStage.setTitle("Biểu đồ");

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
			newStage.setScene(scene);
			newStage.show();

		});
	}

	@Override
	public void start(Stage stage) {

		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);

		this.label = new Label();

		Button button = new Button("Vẽ cái biểu đồ phát");

		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				showChoiceDialog();
			}
		});

		root.getChildren().addAll(button, label);

		Scene scene = new Scene(root, 750, 450);
		stage.setTitle("Menu chính");
		stage.setScene(scene);

		stage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}

}