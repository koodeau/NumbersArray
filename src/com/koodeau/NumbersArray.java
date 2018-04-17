package com.koodeau;

import javax.swing.*;


public class NumbersArray {

    public static void main(String[] args) {


        byte i,size;


        String ODDtext = "Array from odd numbers: ";
        String EVENtext = "Array from even numbers: ";



        size = Byte.parseByte(JOptionPane.showInputDialog("Enter the array length: \n\nMin length: 1."+"\nMax length: "+Byte.MAX_VALUE+".\nRecommendation: Do not input length larger than 30,\nor you will do that on your own risk!\n"));



        if (size<1){
            size=1; // Better for people ))).
        }



        int[] ODDNums=new int[size];
        int[] EVENNums=new int[size];





        for (i=0; i<size; i++){
            ODDNums[i]=2*i+1;
            ODDtext += i+". '"+ODDNums[i]+"';   ";
        }




        for (i=0; i<size; i++){
            EVENNums[i]=2*i;
            EVENtext += i+". '"+EVENNums[i]+"';   ";
        }




        JOptionPane.showMessageDialog(null,ODDtext+"\n"+EVENtext,"Numbers Array",JOptionPane.PLAIN_MESSAGE);



    }
}
