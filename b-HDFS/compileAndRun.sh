# set hadoop path
HADOOP=~/hadoop-2.7.4

./clean.sh

$HADOOP/bin/hadoop com.sun.tools.javac.Main HDFSOperations.java
jar cf HDFS.jar HDFSOperations*.class

rm -rfd output
$HADOOP/bin/hadoop jar HDFS.jar HDFSOperations $1 $2 $3
