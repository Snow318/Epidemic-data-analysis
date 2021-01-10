package envlweb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AppDao {

	@Select("select city name, num value from country")
	public List<Map<String,Object>> get1();

	@Select("\n" +
			"select style name,num value from tools")
	public List<Map<String,Object>> get2();

	@Select("\n" +
			"select city name,num value from suspect")
	public List<Map<String,Object>> get5();
	@Select("select * from part3")
	public List<Map<String,Object>> get3();

	@Select("select * from part4 where citys = #{city, jdbcType=VARCHAR}")
	public List<Map<String,Object>> get4( @Param("city") String city);
	
	@Select("SELECT style name,num value FROM result ORDER BY num DESC LIMIT 0,10000;")
	public List<Map<String,Object>> getCiyun();
	
	@Select("select time,num from time")
	public List<Map<String,Object>> get6();
	
	@Select("select time,value from praise")
	public List<Map<String,Object>> get7();
	@Select("select city name, num value from country1")
	public List<Map<String,Object>> get11();
}
