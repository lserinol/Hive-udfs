
name := "levent-hive-funcs"

version := "0.0.2"

scalaVersion := "2.11.6"

organization := "com.levent"

test in assembly := {}

resolvers ++= Seq(
  "releases"  at "http://oss.sonatype.org/content/repositories/releases",
  "snapshots"  at "https://oss.sonatype.org/content/repositories/snapshots"
)



libraryDependencies += "org.apache.hive" % "hive-exec" % "0.12.0" % "provided"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.2.0" % "provided"

libraryDependencies += "joda-time" % "joda-time" % "2.9.1"

libraryDependencies += "org.joda" % "joda-convert" % "1.8"

