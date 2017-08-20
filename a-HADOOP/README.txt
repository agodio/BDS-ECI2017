PURPOSE
**********************************

After having a census in Argentina on 2010, we have a lot of data on different files. One of these files specifies information regarding family formation, occupation, nationality, etc.
One of the questions was about the relationship with the head of household. The possible answers are:

1 Head of household
2 Spouse or partner
3 Son
4 Son in law / Daughter in law
5 Grandchild
6 Father / Mother / Father in law
7 Other relatives
8 Others not relatives
9 Domestic servants and their families
10 MISSING
0 NOT APPLICABLE

I would like to know how many people I have for each category.

DESCRIPTION OF CSV PERSONA.CSV
**********************************

40117096 entries
1.7 GB

CSV header (removed from the file):

PERSONA_REF_IDHOGAR_REF_ID;P01;P02;P03;P05;P06;P07;P12;EDADAGRU;EDADQUI;P08;P09;P10;CONDACT

PERSONA_REF_ID: Person ID
HOGAR_REF_ID: Home ID
P01: "Relation with the head of household"
P02: "Gender"
P03: "Age"
P05: "Is Argentinian?
P06: "Where are they from?"
P07: "Is literate?"
P12: "Use computer?"
EDADAGRU "Age grouped in big-groups"
EDADQUI "Age grouped by 15"
P08 "Scolarship"
P09 "Study Level Attained"
P10 "Do they finished that study level"
CONDACT "Is working?"

I removed all the unneeded columns from the file to save space (from 1.7 GB to 77 MB), The original file can be downloaded from:

http://datar.noip.me/dataset/censo-2010-microdatos/resource/cd85bb6e-1a9b-47be-a46c-a15dea8123ed

DESCRIPTION OF THE SOLUTION
**********************************

Since each entry on the file is independent, it is suitable to use the MapReduce programming model to answer this question.

The map method, processes one line at a time, emitting a key-value pair of < <relation>, 1>.
The reduce method, just sums up the values, which are the occurrence counts for each relation with the head of household.

USAGE
**********************************

Environment variables should be set as follows

export JAVA_HOME=/usr/java/default
export PATH=${JAVA_HOME}/bin:${PATH}
export HADOOP_CLASSPATH=${JAVA_HOME}/lib/tools.jar

Java version should be 8

Properly set the path to SPARK on ocmpileAndRun.sh

To compile and run
./compileAndRun.sh

To se the results
cat output/*

RESULTS
**********************************

0 441191    NOT APPLICABLE
1 12174021  Head of household
2 7304489   Spouse or partner
3 15920188  Son
4 466811    Son in law / Daughter in law
5 1669682   Grandchild
6 526190    Father / Mother / Father in law
7 1192793   Other relatives
8 386209    Others not relatives
9 35522     Domestic servants and their families
