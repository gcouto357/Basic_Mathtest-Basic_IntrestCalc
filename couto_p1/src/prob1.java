import java.util.Scanner;
import java.security.SecureRandom;
public class prob1 {

    static int correctAnswer = 0;
    static int wrongAnswer = 0;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int i=0,ans=0,type, diffi;
        double num1 = 0,num2 = 0;


        while(i == 0){
            correctAnswer = 0;
            wrongAnswer = 0;
            System.out.println("What difficulty would you like? (1 - 4)");
            diffi = scnr.nextInt();
            System.out.println("What type of problems would you like? Please choose from 1 to 5.");
            System.out.println("1: Addition");
            System.out.println("2: Multiplication");
            System.out.println("3: Subtraction");
            System.out.println("4: Division");
            System.out.println("5: A mix of all");
            type = scnr.nextInt();

            for(int j = 0; j < 10; ++j){
            difficulty(ans, diffi, type, num1, num2, scnr, rand);
            }


            double percent = (correctAnswer / 10) * 100;
            if(percent >= 75){
                System.out.println("You got " + correctAnswer + " correct and " + wrongAnswer + " incorrect");
                System.out.println("Congratulations, you are ready to go to the next level!");

            }
            else{
                System.out.println("You got " + correctAnswer + " correct and " + wrongAnswer + " incorrect");
                System.out.println("Please ask your teacher for extra help");
            }

            System.out.println("Would you like to continue. Type 1 if you wish to stop.");
            int cont = scnr.nextInt();

            if (cont == 1){
                break;
            }
        }

    }

    public static void difficulty(int ans, int diffi, int type, double num1, double num2, Scanner scnr, SecureRandom rand) {
        switch (diffi) {
            case 1:
                num1 = rand.nextInt(10);
                num2 = rand.nextInt(10);

                question(ans,diffi,type,num1,num2,scnr,rand);
            break;

            case 2:
                num1 = rand.nextInt(100);
                num2 = rand.nextInt(100);

                question(ans,diffi,type,num1,num2,scnr,rand);

                break;

            case 3:
                num1 = rand.nextInt(1000);
                num2 = rand.nextInt(1000);

                question(ans,diffi,type,num1,num2,scnr,rand);
                break;

            case 4:
                num1 = rand.nextInt(10000);
                num2 = rand.nextInt(10000);

                question(ans,diffi,type,num1,num2,scnr,rand);
                break;
        }
    }



    public static void response_R(double num1, double num2, Scanner scnr, SecureRandom rand) {
        int num4 = rand.nextInt(4);
        switch (num4) {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }

    }

    public static void response_W(double num1, double num2, Scanner scnr, SecureRandom rand) {
        int num4 = rand.nextInt(4);
            switch (num4) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don’t give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;

        }

    }

    public static void question(int ans, int diffi, int type, double num1, double num2, Scanner scnr, SecureRandom rand) {
        switch (type) {
            case 1:
                System.out.println("How much is " + num1 + " plus " + num2);
                ans = scnr.nextInt();

                if (ans == (num1 + num2)) {
                    response_R(num1, num2, scnr, rand);
                    correctAnswer++;
                } else {
                    response_W(num1, num2, scnr, rand);
                    wrongAnswer++;
                }
                break;
            case 2:
                System.out.println("How much is " + num1 + " times " + num2);
                ans = scnr.nextInt();

                if (ans == (num1 * num2)) {
                    response_R(num1, num2, scnr, rand);
                    correctAnswer++;
                } else {
                    response_W(num1, num2, scnr, rand);
                    wrongAnswer++;
                }

                break;
            case 3:
                System.out.println("How much is " + num1 + " minus " + num2);
                ans = scnr.nextInt();

                if (ans == (num1 - num2)) {
                    response_R(num1, num2, scnr, rand);
                    correctAnswer++;
                } else {
                    response_W(num1, num2, scnr, rand);
                    wrongAnswer++;
                }
                break;
            case 4:
                System.out.println("How much is " + num1 + " divided by " + num2);
                ans = scnr.nextInt();

                if (ans == (num1 / num2)) {
                    response_R(num1, num2, scnr, rand);
                    correctAnswer++;
                } else {
                    response_W(num1, num2, scnr, rand);
                    wrongAnswer++;
                }
                break;

            case 5:
                int num3 = rand.nextInt(4);

                switch (num3) {
                    case 0:
                        System.out.println("How much is " + num1 + " plus " + num2);
                        ans = scnr.nextInt();

                        if (ans == (num1 + num2)) {
                            response_R(num1, num2, scnr, rand);
                            correctAnswer++;
                        } else {
                            response_W(num1, num2, scnr, rand);
                            wrongAnswer++;
                        }
                        break;
                    case 1:
                        System.out.println("How much is " + num1 + " times " + num2);
                        ans = scnr.nextInt();

                        if (ans == (num1 * num2)) {
                            response_R(num1, num2, scnr, rand);
                            correctAnswer++;
                        } else {
                            response_W(num1, num2, scnr, rand);
                            wrongAnswer++;
                        }

                        break;
                    case 2:
                        System.out.println("How much is " + num1 + " minus " + num2);
                        ans = scnr.nextInt();

                        if (ans == (num1 - num2)) {
                            response_R(num1, num2, scnr, rand);
                            correctAnswer++;
                        } else {
                            response_W(num1, num2, scnr, rand);
                            wrongAnswer++;
                        }
                        break;
                    case 3:
                        System.out.println("How much is " + num1 + " divided by " + num2);
                        ans = scnr.nextInt();

                        if (ans == (num1 / num2)) {
                            response_R(num1, num2, scnr, rand);
                            correctAnswer++;
                        } else {
                            response_W(num1, num2, scnr, rand);
                            wrongAnswer++;
                        }
                        break;

                }

        }
    }
}
