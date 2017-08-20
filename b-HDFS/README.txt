PURPOSE
**********************************

Use basic HDFS file-system operations

DESCRIPTION OF THE SOLUTION
**********************************

This non-interactive app simply makes use of the following HDFS operations:

getHomeDirectory
getWorkingDirectory
mkdirs
copyFromLocalFile
createNewFile
create
open

USAGE
**********************************

Environment variables should be set as follows

export JAVA_HOME=/usr/java/default
export PATH=${JAVA_HOME}/bin:${PATH}
export HADOOP_CLASSPATH=${JAVA_HOME}/lib/tools.jar

Java version should be 8

Properly set the path to HADOOP on ocmpileAndRun.sh

To compile and run
./compileAndRun.sh

To se the results
tree ; cat NewFolder/newFile.txt

RESULTS
**********************************

HOME:file:/home/agodio

Folder file:/home/agodio/BDS/b-HDFS/NewFolder created on working directory

File HDFSOperations.java copied from local to HDFS.

File file:/home/agodio/BDS/b-HDFS/NewFolder/newFile.txt created in HDFS.

Written data to NewFile.

Reading from NewFile.
BDS1
BDS2
BDS3
BDS4
BDS5
<tree>
.
|-- clean.sh
|-- compileAndRun.sh
|-- HDFS.jar
|-- HDFSOperations.class
|-- HDFSOperations.java
|-- NewFolder
|   |-- HDFSOperations.java
|   `-- newFile.txt
`-- README.txt

1 directory, 8 files
<cat>
BDS1
BDS2
BDS3
BDS4
BDS5
