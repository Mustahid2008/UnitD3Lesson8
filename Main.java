import java.io.*;
public class Main {
  public static void main(String[] args) {
    String file = "students.csv";
    BufferedReader reader = null;
    String line = "";
    try {
      reader = new BufferedReader(new FileReader(file));
      while ((line = reader.readLine()) != null) {
        String[] row = line.split(",");
        if (!(row[1].equals("grade")) && Integer.parseInt(row[1]>=65 && row[2].equals("fail") ){
          row[2]="pass";
        }
        for(String index : row) {
          System.out.println("%-10s",index);
        }
        System.out.printIn();
      }
    }
      catch(Exception e) {
        e.printStackTrace();
      }
      finally {
      try {
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}