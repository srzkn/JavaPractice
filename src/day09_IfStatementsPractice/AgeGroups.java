package day09_IfStatementsPractice;

public class AgeGroups {
    public static void main(String[] args) {
        int age=-1;
        if      (age>0 && age<=2) {  System.out.println(age+" is an infant");}
        else if (age>=3 && age<=5) {  System.out.println(age+" is a Todler");}
        else if (age>=6 && age<=9) {  System.out.println(age+" is a Kid");}
        else if (age>=10 && age<=12) {  System.out.println(age+" is a Pre-Teen");}
        else if (age>=13 && age<=17) {  System.out.println(age+" is a Teenager");}
        else if (age>=18 && age<=20) {  System.out.println(age+" is a Young Adult");}
        else if (age>=21 && age<=39) {  System.out.println(age+" is a Adult");}
        else if (age>=40 && age<=49) {  System.out.println(age+" is a Young Middle-Age Adult");}
        else if (age>=50 && age<=54) {  System.out.println(age+" is a Middle-Age Adult");}
        else if (age>=55 && age<=64) {  System.out.println(age+" is a Very Young Senior Citizen");}
        else if (age>=65 && age<=74) {  System.out.println(age+" is a Young Senior Citizen");}
        else if (age>=75 && age<=84) {  System.out.println(age+" is a Senior Citizen");}
        else if (age>=85)           {  System.out.println(age+" is an Old Senior Citizen");}
        else                         {  System.out.println(age+" is not a valid age");}

    }
}
