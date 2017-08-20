PURPOSE
**********************************

This exercise solves the same problem that a-HADOOP solves, using SPARK streaming.
Instead of dreading the list of relations with the head of household from a file,
it reads it from a socket.

USAGE
**********************************

Set the path of spark and sbt
./compileAndRun.sh

on a diferent terminal run (check the path)
nc -lk 9999 < ~/BDS/a-HADOOP/input/PERSON-reduced.csv

it will send the file through a socket

