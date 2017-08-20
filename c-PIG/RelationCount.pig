A = load '/home/agodio/BDS/a-HADOOP/input/PERSONA-reduced.csv';
B = foreach A generate flatten(TOKENIZE((chararray)$0)) as word;
C = filter B by word matches '\\w+';
D = group C by word;
E = foreach D generate COUNT(C), group;
store E into '/home/agodio/BDS/c-PIG/output';
