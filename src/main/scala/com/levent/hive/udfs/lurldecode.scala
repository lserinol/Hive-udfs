package com.levent.hive.udfs

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF
import java.net.URLDecoder

@Description(
        name = "lurlDecode",
        value = "_FUNC_(string) URLDecode - decodes application/x-www-form-urlencoded type into string (UTF-8)",
        extended = "SELECT lurlDecode(string) FROM test LIMIT 1;")
class lurlDecode extends UDF {
  def evaluate(url: String ): String= {
	if (url == null )
	   return null
	val decodedURL= java.net.URLDecoder.decode(url, "UTF-8");
	return (decodedURL)
	
  }

}
