package com.hadoop.sensexcsv;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.LazyOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class Sensex_MR_Csv {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		
		Configuration conf = new Configuration();
		Job job = new Job(conf,"Sensex Analysis");
		job.setJarByClass(Sensex_MR_Csv.class);
		
		job.setMapperClass(sensexMapper.class);
		job.setReducerClass(sensexReducer.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);
		
		//job.setNumReduceTasks(0);
		
		LazyOutputFormat.setOutputFormatClass(job, TextOutputFormat.class);
		
		//job.setOutputFormatClass(MultipleTextOutputFormat.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		MultipleOutputs.addNamedOutput(job, "HighDemandMarket", TextOutputFormat.class, Text.class, Text.class);
		MultipleOutputs.addNamedOutput(job, "OnGoingMarketStrategy", TextOutputFormat.class, Text.class, Text.class);
		MultipleOutputs.addNamedOutput(job, "WealthyProducts", TextOutputFormat.class, Text.class, Text.class);
		MultipleOutputs.addNamedOutput(job, "ReliableProducts", TextOutputFormat.class, Text.class, Text.class);
		MultipleOutputs.addNamedOutput(job, "OtherProducts", TextOutputFormat.class, Text.class, Text.class);
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
