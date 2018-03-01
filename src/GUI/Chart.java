/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.text.NumberFormat;
import javafx.scene.chart.NumberAxis;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Bugy
 */
public class Chart {
    private XYSeriesCollection data;
    
    public Chart(JPanel panel){
        data = new XYSeriesCollection();
        XYSeries seriesA = new XYSeries("Pripad A");
        XYSeries seriesB = new XYSeries("Pripad B");
        data.addSeries(seriesA);              
        
        data.addSeries(seriesB);
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Úspešne vyhratie automobilu",
                "Počet replikácií", // x-axis Label
                "Pravdepodobnosť", // y-axis Label
                data, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        panel.setLayout(new java.awt.BorderLayout());        
        panel.add(chartPanel, BorderLayout.CENTER);
        panel.validate();
    }
    
    public void addValueToSeries(int index, double x, double y){
        data.getSeries(index).add(x, y);
        
    }
}
