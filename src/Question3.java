import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of fruits you want");
        Scanner sc = new Scanner(System.in);
        int noOfFruit = sc.nextInt();
        Fruit[] baskets = new Fruit[noOfFruit];
        int count = 0;
        boolean exit = true;
        while (exit) {
            System.out.println("1.To add Apple");
            System.out.println("2.To add Mango");
            System.out.println("3.To add Orange");
			System.out.println("4.Display list");
            switch (sc.nextInt()) {
				case 1:
					if(count>=0&&count<noOfFruit){
						baskets[count]=new Apple();
						count++;
					}
					else {
						System.out.println("The basket is full");
					}

                    break;
				case 2:
					if(count>=0&&count<noOfFruit){
						baskets[count]=new Mango();
						count++;
					}
					else {

						System.out.println("The basket is full");
					}
                    break;
				case 3:
					if(count>=0&&count<noOfFruit){
						baskets[count]=new Orange();
						count++;
					}
					else {

						System.out.println("The basket is full");
					}
                    break;
				case 4:
					for (Fruit f: baskets) {
						f.show();
					}

            }
        }
    }
}
