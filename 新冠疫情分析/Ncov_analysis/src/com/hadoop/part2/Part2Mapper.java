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
 * ��ʡ����������
 */
public class Part2Mapper extends Mapper<Object, Text, Text, IntWritable> {

      
    public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
    	 //�������һ������
        if (key.toString().equals("0")) {
            return;
        } else {
        }
        String[] words = value.toString().split(",");
        //ͳ�����ڵ����һ��
        if(words[6].equals("20201124")) {
        
        if(words[10].toString().contains("����")) {
       	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("�ӱ�")) {
      	 context.write(new Text("�ӱ�"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("����")) {
      	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("ɽ��")) {
      	 context.write(new Text("ɽ��"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("����")) {
      	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("�㽭")) {
      	 context.write(new Text("�㽭"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("����")) {
      	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("����")) {
      	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("���")) {
      	 context.write(new Text("���"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("�Ϻ�")) {
      	 context.write(new Text("�Ϻ�"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("����")) {
         	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
         }
       if(words[10].toString().contains("����")) {
         	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
         }
       
       if(words[10].toString().contains("ɽ��")) {
         	 context.write(new Text("ɽ��"), new IntWritable(Integer.valueOf(words[7])));
         }   
       if(words[10].toString().contains("����")) {
        	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("������")) {
        	 context.write(new Text("������"), new IntWritable(Integer.valueOf(words[7])));
        }   
       
       if(words[10].toString().contains("����")) {
        	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("����")) {
        	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("����")) {
        	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
        }   
       if(words[10].toString().contains("�㶫")) {
       	 context.write(new Text("�㶫"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("����")) {
       	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("�Ĵ�")) {
       	 context.write(new Text("�Ĵ�"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("����")) {
      	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
      }
       if(words[10].toString().contains("���ɹ�")) {
         	 context.write(new Text("���ɹ�"), new IntWritable(Integer.valueOf(words[7])));
         }
       if(words[10].toString().contains("����")) {
         	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
         }
       if(words[10].toString().contains("����")) {
        	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
        }
       if(words[10].toString().contains("����")) {
        	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
        }
       if(words[10].toString().contains("�½�")) {
        	 context.write(new Text("�½�"), new IntWritable(Integer.valueOf(words[7])));
        }
       if(words[10].toString().contains("����")) {
       	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("�ຣ")) {
       	 context.write(new Text("�ຣ"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("����")) {
       	 context.write(new Text("����"), new IntWritable(Integer.valueOf(words[7])));
       }
       if(words[10].toString().contains("���")) {
         	 context.write(new Text("���"), new IntWritable(Integer.valueOf(words[7])));
         }
 
    	 
     
        
    }

    }
}
