import java.util.Scanner;
public class Grocery{
    public static void main(String[] arggs){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t welcome to AGL Store");
        float amount = 0f;
        int a=1;
        int x = 1;
        do{
            System.out.println("Would you want any things select the Number");
            System.out.println("\n1.Rice \n2.Oil \n3.Dhal \n4.Soya \n5.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("You select rice how much kg you want \nkg=50rupee");
                    float kg = sc.nextInt();
                    amount +=  kg * 50;
                    System.out.println("The amount is" + amount);
                    System.out.println("If you need more things then number \n1.Yes \n2.No");
                    int more = sc.nextInt();
                    if (more == 1){
                        a = 1;
                    }
                    else{
                        a = 0;
                    }
                    break;
                case 2:
                    System.out.println("You select Oil how much packets you want \npackets=192rupee");
                    int packets = sc.nextInt();
                    amount +=  packets * 192;
                    System.out.println("The amount is" + amount);
                    System.out.println("If you need more things then number \n1.Yes \n2.No");
                    int b = sc.nextInt();
                    if (b == 1){
                        a = 1;
                    }
                    else{
                        a = 0;
                    }
                    break;
                    case 3:
                    System.out.println("You select Dhal how much kg you want \nkg=125rupee");
                    float kg2 = sc.nextInt();
                    amount +=  kg2 * 125;
                    System.out.println("The amount is" + amount);
                    System.out.println("If you need more things then number \n1.Yes \n2.No");
                    int c = sc.nextInt();
                    if (c == 1){
                        a = 1;
                    }
                    else{
                        a = 0;
                    }
                    break;
                    case 4:
                    System.out.println("You select Soya how much kg you want \nkg=85rupee");
                    float kg3 = sc.nextInt();
                    amount +=  kg3 * 85;
                    System.out.println("The amount is" + amount);
                    System.out.println("If you need more things then number \n1.Yes \n2.No");
                    int d = sc.nextInt();
                    if (d == 1){
                        a = 1;
                    }
                    else{
                        a = 0;
                    }
                    break;
                    case 5:
                        System.out.println("you select Exit Thank you for Coming");
                        a = 0;
                    break;
                    default:
                    System.out.println("Invalid input");
                    a = 1;
                    break;
                     
            }
        }
        while(a == 1);
          if(amount > 0 ){
            System.out.println("If you pay amount then confirm your order things \n then pay "+amount);
             float pay = sc.nextFloat();
             if (pay == amount){
               System.out.println("Your payment is successfully your things can be orderd");
             }
             else if(pay < amount){
                System.out.println("You less paid");
          
            }  
            else{
              System.out.println("you much more amount");
            }
          }
            
    
    }
}