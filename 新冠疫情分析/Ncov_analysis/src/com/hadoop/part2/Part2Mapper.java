package com.hadoop.part2;

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
 * 各省市死亡人数
 */
public class Part2Mapper extends Mapper<Object, Text, Text, IntWritable> {

      
    public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
    	 //不处理第一行数据
        if (key.toString().equals("0")) {
            return;
        } else {
        }
        String[] words = value.toString().split(",");
        //统计日期的最后一天
        if(words[6].equals("20201124")) {
        
        if(words[10].toString().contains("河南")) {
       	 context.write(new Text("河南"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("河北")) {
      	 context.write(new Text("河北"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("陕西")) {
      	 context.write(new Text("陕西"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("山西")) {
      	 context.write(new Text("山西"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("江苏")) {
      	 context.write(new Text("江苏"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("浙江")) {
      	 context.write(new Text("浙江"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("安徽")) {
      	 context.write(new Text("安徽"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("福建")) {
      	 context.write(new Text("福建"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("天津")) {
      	 context.write(new Text("天津"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("上海")) {
      	 context.write(new Text("上海"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("北京")) {
         	 context.write(new Text("北京"), new IntWritable(Integer.valueOf(words[7])));
         }
       if(words[10].toString().contains("江西")) {
         	 context.write(new Text("江西"), new IntWritable(Integer.valueOf(words[7])));
         }
       
       if(words[10].toString().contains("山东")) {
         	 context.write(new Text("山东"), new IntWritable(Integer.valueOf(words[7])));
         }   
       if(words[10].toString().contains("辽宁")) {
        	 context.write(new Text("辽宁"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("黑龙江")) {
        	 context.write(new Text("黑龙江"), new IntWritable(Integer.valueOf(words[7])));
        }   
       
       if(words[10].toString().contains("吉林")) {
        	 context.write(new Text("吉林"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("湖北")) {
        	 context.write(new Text("湖北"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("湖南")) {
        	 context.write(new Text("湖南"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("广东")) {
       	 context.write(new Text("广东"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("广西")) {
       	 context.write(new Text("广西"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("四川")) {
       	 context.write(new Text("四川"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("贵州")) {
      	 context.write(new Text("贵州"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("内蒙古")) {
         	 context.write(new Text("内蒙古"), new IntWritable(Integer.valueOf(words[7])));
         }
       if(words[10].toString().contains("甘肃")) {
         	 context.write(new Text("甘肃"), new IntWritable(Integer.valueOf(words[7])));
         }
       if(words[10].toString().contains("宁夏")) {
        	 context.write(new Text("宁夏"), new IntWritable(Integer.valueOf(words[7])));
        }
       if(words[10].toString().contains("重庆")) {
        	 context.write(new Text("重庆"), new IntWritable(Integer.valueOf(words[7])));
        }
       if(words[10].toString().contains("新疆")) {
        	 context.write(new Text("新疆"), new IntWritable(Integer.valueOf(words[7])));
        }
       if(words[10].toString().contains("云南")) {
       	 context.write(new Text("云南"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("青海")) {
       	 context.write(new Text("青海"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("西藏")) {
       	 context.write(new Text("西藏"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("香港")) {
         	 context.write(new Text("香港"), new IntWritable(Integer.valueOf(words[7])));
         }
 
    	 
     
        
    }

    }
}
