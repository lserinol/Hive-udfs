package com.levent.hive.udfs

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF
import java.net.URLEncoder

@Description(
        name = "lurlEncode",
        value = "_FUNC_(string) URLEncode - encodes a string into application/x-www-form-urlencoded type (UTF-8)",
        extended = "SELECT lurlEncode(url) FROM test LIMIT 1;")
class lurlEncode extends UDF {
  def evaluate(url: String ): String= {
	if (url == null )
	   return null
	val encodedURL= java.net.URLEncoder.encode(url, "UTF-8");
	return (encodedURL)
	
  }

}
