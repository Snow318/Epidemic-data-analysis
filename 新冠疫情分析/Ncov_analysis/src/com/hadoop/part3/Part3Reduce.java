package com.hadoop.part3;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;


public class Part3Reduce  extends Reducer<Text,IntWritable,ReceiveTable,NullWritable>{
	
	public void reduce(Text key, Iterable<IntWritable> values, Context context
	                       ) throws IOException, InterruptedException {
	      int sum = 0;
	      for (IntWritable val : values) {
	        sum += val.get();
	        
	      }
	     
	      ReceiveTable receiveTable = new ReceiveTable(key.toString(),sum);
		  context.write(receiveTable,null);
	    }
}
