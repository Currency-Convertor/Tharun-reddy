package cConverter;

import java.util.Scanner;

public class CConverter {
    public static void main(String args[]){
        double todayRate;
        int choice;
        double inr;
        char ansr ;
        do {
            System.out.println("different types of converters");
            System.out.println("1.EurToYen"); 
            System.out.println("2.EurToPound");
            System.out.println("3.EurToCad");
            System.out.println("4.YenToDollar");
            System.out.println("5.YenToInr");
            System.out.println("6.YenToEuro");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            choice = sc.nextInt();
            System.out.println("enter today rate");
            todayRate = sc.nextDouble();
            CcurrencyCov cc = new CcurrencyCov(todayRate);
            switch (choice){               
                case 1 :
                    System.out.println("enter Eur");
                    double Eury = sc.nextDouble();
                    System.out.println(Eury+"Euro are converted to "+cc.EurToYen(Eury)+ "Yen");
                    break;
                case 2 :
                    System.out.println("enter Eur");
                    double Eurp = sc.nextDouble();
                    System.out.println(Eurp+"Euro are converted to "+cc.EurToPound(Eurp)+ "Pound");
                    break;
                case 3 :
                    System.out.println("enter Eur");
                    double Eurc = sc.nextDouble();
                    System.out.println(Eurc+"Euro are converted to "+cc.EurToCad(Eurc)+ "CAD");
                    break;
                case 4 :
                    System.out.println("enter Yen");
                    double Yend = sc.nextDouble();
                    System.out.println(Yend+"Yen are converted to "+cc.YenToDollar(Yend)+ "Dollar");
                    break;
                case 5 :
                    System.out.println("enter Yen");
                    double Yeni = sc.nextDouble();
                    System.out.println(Yeni+"Yen are converted to "+cc.YenToInr(Yeni)+ "INR");
                    break;
                case 6 :
                    System.out.println("enter Yen");
                    double Yene = sc.nextDouble();
                    System.out.println(Yene+"Yen are converted to "+cc.YenToEuro(Yene)+ "Euro");
                    break;                
            }
            System.out.println(" Click 'y' if u wanna try another one");
            ansr = sc.next().charAt(0);

        }while (ansr =='y');


    }
}

