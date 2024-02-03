package Ex2_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarQueueManagement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayQueue carsQ = new ArrayQueue(10);
        int sel = 0;

        System.out.println("1.Car arrival");
        System.out.println("2.Car departure");
        System.out.println("3.Display queue");
        System.out.println("4.Exit");

        while(sel != 4){
            try {
                System.out.println("Enter your selection:");
                sel = sc.nextInt();
                switch (sel) {
                    case 1:
                        try {
                            sc.nextLine();//absorb previous /n
                            System.out.print("Enter licence plate: ");
                            String plate = sc.nextLine();
                            carsQ.enqueue(new Car(plate));
                        } catch (QueueFullException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            Car c = (Car) carsQ.dequeue();
                            System.out.println("Car leaving the Area: " + c.toString());
                        } catch (QueueEmptyException e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                        break;
                    case 3:
                        carsQ.printQ();
                        break;
                    case 4:
                        System.out.println("Terminating...");
                        break;
                    default:
                        System.out.println("No such selection");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("You must enter a number, try again");
                sc.nextLine();
            }
        }
    }
}
