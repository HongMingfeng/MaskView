package com.media.watermark;

import java.util.ArrayList;
import java.util.Random;
/*The random number sequence is generated by using the random method, and the image matrix is generated by filling the array
 @Time 2020-04-20 14:49:01
 */
public class Sequences {

    private ArrayList<double [][]> randSequences;

    public ArrayList<double [][]> getRandSequences(){
        return this.randSequences;
    }

    public Sequences(ArrayList<double [][]> aa){
        this.randSequences=aa;
    }

    /**The random number sequence is generated by using the random method, and the image matrix is generated by filling the array
     * @param seeds  seed sequence
     * @param num The number of images generated
     * @param row  The number of rows in the image matrix
     * @param cole The number of coles in the image matrix
     * @return Generated image matrix sequence
     */
    public static Sequences sequences(int[]seeds, int row, int cole, int num){
        ArrayList<double [][]> randSequences=new ArrayList<>();                                                             //The container matrix that stores the sequence of images
        for (int i=0;i<num;i++){
            //Random is used to generate Random Numbers
            Random r1 = new Random((long)seeds[i]);
            double [][] text=new double[row][cole];
            for (int j=0;j<row;j++) {
                for (int k = 0; k < cole; k++) {
                    text[j][k]=r1.nextInt(256);
                }
            }
            randSequences.add(text);
        }
        return new Sequences(randSequences);
    }
}
