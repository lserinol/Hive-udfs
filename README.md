# Hive-udfs
Collection of my Scala Hive UDFs

## Requirements
- SBT
- Scala
- Hive

## Compile

1. git clone/fork project https://github.com/lserinol/Hive-udfs.git  <br />
2. sbt assembly <br />
3. add jar 'target/scala-<version number>/levent-hive-funcs-assembly-<version number>.jar' to HIVE_AUX_JARS_FILE_PATH <br />
   or use "add jar" command for Hive-CLI/Beeline

## Registering UDFs
create temporary function lcrc32 as 'com.levent.hive.udfs.lcrc32'; <br />
create temporary function ldays_between as 'com.levent.hive.udfs.ldays_between'; <br />
create temporary function lmonths_between as 'com.levent.hive.udfs.lmonths_between'; <br />
create temporary function ilike as 'com.levent.hive.udfs.liLIKE'; <br />


### com.levent.hive.udfs.lcrc32
- takes a string input and returns crc32(long) value <br />

### com.levent.hive.udfs.ldays_between
- calculates days difference between two dates and  returns number of days(int) value <br />

### com.levent.hive.udfs.lmonths_between
- calculates months difference between two dates and  returns number of months(int) value <br />

### com.levent.hive.udfs.liLIKE
- Hive ilike function in-case sensitive like between two strings retuns boolean TRUE/FALSE <br />



