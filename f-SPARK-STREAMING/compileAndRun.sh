# set spark and sbt path
SPARK=~/spark-2.2.0-bin-hadoop2.7
SBT=~/sbt/bin

$SBT/sbt compile
$SBT/sbt package
$SPARK/bin/spark-submit --class "RelationCount" target/scala-2.11/relation-count_2.11-1.0.jar localhost 9999
