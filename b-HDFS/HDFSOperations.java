import java.io.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

public class HDFSOperations {

  public static void main(String[] args) throws IOException {

    FileSystem hdfs = FileSystem.get(new Configuration());

    //Print the home directory
    System.out.println("HOME:" + hdfs.getHomeDirectory() + "\n");

    // Create & Delete Directories
    Path workingDir = hdfs.getWorkingDirectory();
    Path newFolderPath = new Path("/NewFolder");
    newFolderPath = Path.mergePaths(workingDir, newFolderPath);

    //Create new Directory
    hdfs.mkdirs(newFolderPath);
    System.out.println("Folder " + newFolderPath  + " created on working directory\n");

    //Copying File from local to HDFS
    Path localFilePath = new Path(hdfs.getWorkingDirectory() + "/HDFSOperations.java");
    Path hdfsFilePath = new Path(newFolderPath + "/HDFSOperations.java");
    hdfs.copyFromLocalFile(localFilePath, hdfsFilePath);
    System.out.println("File HDFSOperations.java copied from local to HDFS.\n");

    //Creating a file in HDFS
    Path newFilePath = new Path(newFolderPath + "/newFile.txt");
    hdfs.createNewFile(newFilePath);
    System.out.println("File " + newFolderPath + "/newFile.txt created in HDFS.\n");

    //Writing data to a HDFS file
    StringBuilder sb = new StringBuilder();

    for(int i=1;i<=5;i++){
      sb.append("BDS");
      sb.append(i);
      sb.append("\n");
    }

    byte[] byt = sb.toString().getBytes();
    FSDataOutputStream fsOutStream = hdfs.create(newFilePath);
    fsOutStream.write(byt);
    fsOutStream.close();
    System.out.println("Written data to NewFile.\n");

    //Reading data From HDFS File
    System.out.println("Reading from NewFile.");
    BufferedReader bfr = new BufferedReader(
    new InputStreamReader(hdfs.open(newFilePath)));
    String str = null;

    while ((str = bfr.readLine())!= null){
      System.out.println(str);
    }
  }
}
