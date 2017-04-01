package darya.com;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Daria on 21.02.2017.
 */
public class bolti_gaiki {
    static Scanner scn;
    static int stroka_1[] = new int[3];
    public String key;
    public static void main(String[] args) throws IOException {
        int m[] = {14,9,-7,123,9};
        System.out.println(m[5]);


        int[] stroka_2 = new int[3];
        int unpaired_details = 0;
        int cost_damage_bolt = 0;
        int cost_damage_nut = 0;
        int balance_bolt = 0;
        int balance_nut = 0;

        try {
             //scn = new Scanner(new File("C:\\Users\\Daria\\Desktop\\input.txt"));
             FileReader fr = new FileReader("C:\\Users\\Daria\\Desktop\\input.txt");
            BufferedReader textReader = new BufferedReader(fr);
            List<Str> chunks = new ArrayList<>();
            String s = textReader.readLine();





     while ((s ) != null) {

            Str newStr = new Str();{
             for (int row = 0; row <stroka_1.length; row++){
                 newStr.stroka_1[row] = Integer.parseInt(s);
                 System.out.println(newStr.stroka_1[row]);
             }
         }



        }





    /*BufferedReader textReader2 = new BufferedReader(fr);
    String[] s2;*/
            //String s2 = textReader2.readLine();
            // String str []= s2.split(" ");


          /*  while (scn.hasNext()) {
                for (int row = 0; row <stroka_1.length; row++) {
                    stroka_1[row] = Integer.parseInt(scn.next());

                    System.out.print(stroka_1[row] + "  ");


                }

            }*/

        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        scn.close();
       /* PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Daria\\Desktop\\output.txt"));

        cost_damage_bolt = (stroka_1[0] / 100) * stroka_1[1] * stroka_1[2];
        cost_damage_nut = (stroka_2[0] / 100) * stroka_2[1] * stroka_2[2];
        balance_bolt = stroka_1[0] - (stroka_1[0] / 100) * stroka_1[1];
        balance_nut = stroka_2[0] - (stroka_2[0] / 100) * stroka_2[1];

        if (balance_bolt > balance_nut) {
            unpaired_details = (balance_bolt - balance_nut) * stroka_1[2];
        } else {
            unpaired_details = (balance_nut - balance_bolt) * stroka_2[2];
        }

        writer.write(cost_damage_bolt + cost_damage_nut + unpaired_details);
*/



       // writer.close();
    }
}
