# set spark path
SPARK=~/spark-2.2.0-bin-hadoop2.7

./clean.sh

$SPARK/bin/spark-shell -i RelationCount.scala
