import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double yourIncome = 600000;
        double fedTax = 0;

        System.out.println("Taxes for the year 2019 - 2020");
        System.out.println("What is your salary before taxes?");
        yourIncome = input.nextDouble();



        if (yourIncome>= 510301){
            fedTax = 153798.5 + ((yourIncome - 510300) * .37);
        } else if (yourIncome>= 204101){
            fedTax = 46628.5 + ((yourIncome - 204100) * .35);
        } else if (yourIncome>= 160726) {
            fedTax = 32748.5 + ((yourIncome - 160725) * .32);
        } else if (yourIncome>= 84201) {
            fedTax = 14382.5 + ((yourIncome - 84200) * .24);
        } else if (yourIncome>= 39746) {
            fedTax = 4543 + ((yourIncome - 39475) * .22);
        } else if (yourIncome>= 9701){
            fedTax = 970 + ((yourIncome - 9700) * .12);
        } else if (yourIncome>= 0) {
            fedTax = (yourIncome * .10);
        }

        System.out.println("Gross income: " + "$" + yourIncome);
        System.out.println("Federal taxes: " + "$" + fedTax);
        System.out.println("Income after taxes: " + "$" + (yourIncome - fedTax));


    }
}

