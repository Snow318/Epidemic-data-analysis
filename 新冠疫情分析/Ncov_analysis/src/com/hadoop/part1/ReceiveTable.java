package com.hadoop.part1;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;

public class ReceiveTable implements Writable,DBWritable{
	  //column1:Month  column2:sum
	  private String user_area;//访问区域
	  private int num;//数量
	  
	  
	  public ReceiveTable(){

	  }
	  
	  public ReceiveTable(String user_area,int num){
	  this.user_area = user_area;
	  this.num = num;
	  }
	  
		@Override
		public void write(PreparedStatement statement) throws SQLException {
			statement.setString(1,this.user_area);
			statement.setFloat(2,this.num);
		}
		@Override
		public void readFields(ResultSet resultSet) throws SQLException {
		
			this.user_area = resultSet.getString(1);
			this.num = resultSet.getInt(2);
			
		}
		@Override
		public void write(DataOutput out) throws IOException {
			
			out.writeInt(num);
			Text.writeString(out,this.user_area);
			
		}
		@Override
		public void readFields(DataInput in) throws IOException {
			this.user_area = in.readUTF();
			this.num = in.readInt();
		
		}
   

}
