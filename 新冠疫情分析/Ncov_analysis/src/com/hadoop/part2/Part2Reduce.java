package com.hadoop.part2;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;


public class Part2Reduce  extends Reducer<Text,IntWritable,ReceiveTable,NullWritable>{
	
	public void reduce(Text key, Iterable<IntWritable> values, Context context
	                       ) throws IOException, InterruptedException {
	      int sum = 0;
	      for (IntWritable val : values) {
	    	
	    		 ReceiveTable receiveTable = new ReceiveTable(key.toString(),val.get());
	   		       context.write(receiveTable,null);
	         
	      }
	     
	      
        
	    }
}
