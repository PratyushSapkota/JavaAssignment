import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int items = sc.nextInt();

        float totalPrice = 0;

        for(int i = 1; i<=items; i++){
            System.out.println("Enter the price for item " + i);
            float perItemPrice = sc.nextInt();
            System.out.println("Enter the quantity for item " + i);
            float perItemQuantity = sc.nextFloat();

            totalPrice = totalPrice + (perItemPrice * perItemQuantity);
        }

        float discountedPrice = totalPrice - ( ((float) 10 /100) * totalPrice );

        float vatAppliedPrice = discountedPrice - ( ((float) 13/100) * discountedPrice );

        System.out.println("Your final Price is: " + vatAppliedPrice);
    }
}
