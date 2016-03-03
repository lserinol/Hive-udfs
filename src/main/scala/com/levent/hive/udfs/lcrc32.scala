package com.levent.hive.udfs

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF
import java.util.zip.CRC32

@Description(
	name = "lcrc32",
	value = "_FUNC_(string) takes a string and returns crc32(long) value",
	extended = "SELECT lcrc32('any string') FROM test LIMIT 1;") 
class lcrc32 extends UDF {
  def evaluate(myString: String): Long= {
	if ( myString != null) {
		val crc=new CRC32
		crc.update(myString.getBytes())
	   return crc.getValue
	}
	   return 0;
	
  }

}
