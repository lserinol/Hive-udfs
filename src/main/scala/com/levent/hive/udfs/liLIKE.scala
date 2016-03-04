package com.levent.hive.udfs

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF
import java.text.SimpleDateFormat
import org.joda.time.DateTime
import org.joda.time.Days

@Description(
        name = "liLIKE",
        value = "_FUNC_(string1,string2) in-case sensitive like between two strings returns boolean TRUE/FALSE",
        extended = "SELECT liLIKE(string1,string2) FROM test LIMIT 1;")
class liLIKE extends UDF {
  def evaluate(s1: String, s2: String): Boolean = {
	if (s1 == null || s2 == null )
	   return false
	return (s1.toUpperCase == s2.toUpperCase)
	
  }

}
