import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;

public class LearnToThrow {

        public static void main(String [] args) throws Exception {
            arrayPractice(7);
            //write();
           // throw new IOException();
        }

    //  public static void write() throws IOException {
    //      BufferedWriter w = new BufferedWriter(new FileWriter("name.text"));
    //      w.write("test");
    //      w.close();
    //  }

      public static void arrayPractice(int i) throws Exception {
            int a[] = new int[5];

            if (i > 5) {
                throw new Exception("Hey, don't put indexes too high");
            }
      }

}
