package com.hadoop.part3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;
/*
 * 湖北省每天确诊人数
 */
public class Part3Mapper extends Mapper<Object, Text, Text, IntWritable> {

      
    public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
    	 
        if (key.toString().equals("0")) {
            return;
        } else {
        }
        String[] words = value.toString().split(",");
       if(words[10].contains("湖北")) {
    	   if(Integer.valueOf(words[5])> 0) {
    	   context.write(new Text(words[6]),new IntWritable(Integer.valueOf(words[5])));
    	   }else {
    		   context.write(new Text(words[6]),new IntWritable(0));
    	   }
       }
    }
}
