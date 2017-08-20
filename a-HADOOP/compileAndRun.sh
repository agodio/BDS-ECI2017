# set hadoop path
HADOOP=~/hadoop-2.7.4

$HADOOP/bin/hadoop com.sun.tools.javac.Main RelationCount.java
jar cf rc.jar RelationCount*.class

rm -rfd output
$HADOOP/bin/hadoop jar rc.jar RelationCount input output
