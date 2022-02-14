package com.getpricebitcoin.pricebitcoinmanager.models;

import java.util.ArrayList;

public class Pair {

	private ArrayList<Object> dataChartArrayList;
	private ArrayList<String> labelsChartArrayList;
	
	public Pair(ArrayList<Object> dataChartArrayList, ArrayList<String> labelsChartArrayList) {
		super();
		this.dataChartArrayList = dataChartArrayList;
		this.labelsChartArrayList = labelsChartArrayList;
	}
	public ArrayList<Object> getDataChartArrayList() {
		return dataChartArrayList;
	}
	public void setDataChartArrayList(ArrayList<Object> dataChartArrayList) {
		this.dataChartArrayList = dataChartArrayList;
	}
	public ArrayList<String> getLabelsChartArrayList() {
		return labelsChartArrayList;
	}
	public void setLabelsChartArrayList(ArrayList<String> labelsChartArrayList) {
		this.labelsChartArrayList = labelsChartArrayList;
	}
	
}
