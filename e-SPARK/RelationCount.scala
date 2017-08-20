val textFile = sc.textFile("../a-HADOOP/input/PERSONA-reduced.csv")
val counts = textFile.map(word => (word, 1)).reduceByKey(_ + _)
counts.saveAsTextFile("output")
System.exit(0)
