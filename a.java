public class a {
    public static void main(String[] args){
    int age = 17;
    if(age>=18){
        System.out.println("you can vote");
    }
    else {
        System.out.println("you can note vote");
    }
    int marks = 90;
    if(marks>=90){
        System.out.println("A grade");
    }
    else if(marks>=80){
        System.out.println("B grade");
    }else if(marks>=70){
        System.out.println("c grade");
    }else{
        System.out.println("Fail");
    }
//    int age = 18;
//    boolean hasvoterid = true;
//    if(age>=18 ||hasvoterid){
//       if("hasvoterid")
//            System.out.println("you can vote");
//    }else System.out.println("get voter id");
//    else {
//         System.out.println("you can note vote");
//        }
        int day = 5;
    switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
    
    }
    System.out.println("outside switch");
    

    }
}