package com.hadoop.sensexcsv;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class sensexMapper extends Mapper<Object, Text, Text, LongWritable> {
	
	protected void map(Object Key,Text Value,Context context) throws IOException, InterruptedException {
		
		context.write(Value, new LongWritable(0));
		
	}
}
