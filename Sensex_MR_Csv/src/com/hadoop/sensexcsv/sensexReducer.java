package com.hadoop.sensexcsv;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class sensexReducer extends Reducer<Text, LongWritable, Text, Text>{
	
	MultipleOutputs<Text, Text> mos;
	String timestamp = new SimpleDateFormat("HHMMSS").format(new Date());
	String OutputPath = "/sensex/MapR/Output";
	
	@Override
	protected void setup(Context context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//super.setup(context);
		mos = new MultipleOutputs<Text,Text>(context);
	}
	
	protected void reduce(Text Key,Iterable<LongWritable> Values, Context context) throws IOException, InterruptedException {
		
		String[] sensex_values = Key.toString().split(",");
		
		if(sensex_values[2].equals("SIP")) {
			if(Integer.parseInt(sensex_values[4]) > 25000 &&  Integer.parseInt(sensex_values[6]) > 10) {
				mos.write("HighDemandMarket", Key, null, OutputPath + "/HighDemandMarket");
			}
			if(Integer.parseInt(sensex_values[5]) < 22000 &&  (Integer.parseInt(sensex_values[6]) > 20 && Integer.parseInt(sensex_values[6]) < 30)) {
				mos.write("OnGoingMarketStrategy", Key, null, OutputPath + "/OnGoingMarketStrategy");
			}
		}
		
		else if(sensex_values[2].equals("ShortTerm")) {
			if(Integer.parseInt(sensex_values[4]) < 5000) {
				mos.write("WealthyProducts", Key, null, OutputPath + "/Wealthy Products");
			}
			if(sensex_values[3].equals("NewYork") ||  sensex_values[3].equals("California")) {
				mos.write("ReliableProducts", Key, null, OutputPath + "/Reliable Products");
			}
		}
		
		else {
			mos.write("OtherProducts", Key, null, OutputPath + "/Other Products");
		}
		
	}
	
	@Override
	protected void cleanup(Context context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		mos.close();
		//super.cleanup(context);
	}

}
