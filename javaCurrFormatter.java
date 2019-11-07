/*
double payment
NumberFormat class
getCurrencyInstance
*/


import java.util.*;
import java.text.*; //NumberFormat class, get

public class javaCurrFormatter {

    public static void main(String[] args) {      

        Locale l = new Locale("en","INDIA");
    
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale(l).format());
        System.out.println(nf.getCurrency());

        System.out.println(nf.format(1234.98));

    }

}