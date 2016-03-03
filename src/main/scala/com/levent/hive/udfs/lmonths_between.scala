package com.levent.hive.udfs

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF
import java.text.SimpleDateFormat
import org.joda.time.DateTime
import org.joda.time.Months

@Description(
        name = "lmonths_between",
        value = "_FUNC_(date1,date2) calculates months difference between two dates and  returns number of months(int) value",
        extended = "SELECT lmonths_between(date1,date2) FROM test LIMIT 1;")
class lmonths_between extends UDF {
  def evaluate(sdate: String, edate: String): Int = {

	val dateformat = new SimpleDateFormat("yyyy-M-dd")

	val sDateJ = dateformat.parse(sdate)
	val eDateJ = dateformat.parse(edate)

	
	val startDate:DateTime = new DateTime(sDateJ);
	val endDate:DateTime = new DateTime(eDateJ);

	val m:Months= Months.monthsBetween(startDate, endDate)

	return m.getMonths()
	
  }

}
