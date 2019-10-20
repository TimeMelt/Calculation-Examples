import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Stevens_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        System.out.println("What type of problems do you want.");
        System.out.println("1: Addition only");
        System.out.println("2: Multiplication only");
        System.out.println("3: Subtraction only");
        System.out.println("4: Division only");
        System.out.println("5: Mixture of all kinds");

        switch(type) {
            case 1:
                Add();
                break;
            case 2:
                Mult();
                break;
            case 3:
                Sub();
                break;
            case 4:
                Div();
                break;
            default:
                System.out.println("Pick a valid choice (1-5)");
                break;
        }

    }

    public static void Add() {
        Scanner s = new Scanner(System.in);
        int diff = s.nextInt();
        int correct = 0;
        System.out.println("What difficulty do you want?");
        System.out.println("1 is easiest and 5 is hardest");

        switch (diff) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(10);
                    int randNum2 = rand.nextInt(10);
                    int answer = randNum1 + randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " + " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                int percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

            case 2:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(99);
                    int randNum2 = rand.nextInt(99);
                    int answer = randNum1 + randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " + " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 3:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(999);
                    int randNum2 = rand.nextInt(999);
                    int answer = randNum1 + randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " + " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns =  r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }

                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 4:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randAdd1 = rand.nextInt(9999);
                    int randAdd2 = rand.nextInt(9999);
                    int answer = randAdd1 + randAdd2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randAdd1 + " + " + randAdd2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

            break;

        }
    }

    public static void Mult() {
        Scanner s = new Scanner(System.in);
        int diff = s.nextInt();
        int correct = 0;
        System.out.println("What difficulty do you want?");
        System.out.println("1 is easiest and 5 is hardest");

        switch (diff) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(10);
                    int randNum2 = rand.nextInt(10);
                    int answer = randNum1 * randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " * " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                int percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

            case 2:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(99);
                    int randNum2 = rand.nextInt(99);
                    int answer = randNum1 * randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " * " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 3:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(999);
                    int randNum2 = rand.nextInt(999);
                    int answer = randNum1 * randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " * " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns =  r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }

                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 4:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(9999);
                    int randNum2 = rand.nextInt(9999);
                    int answer = randNum1 * randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " * " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

        }
    }

    public static void Sub() {
        Scanner s = new Scanner(System.in);
        int diff = s.nextInt();
        int correct = 0;
        System.out.println("What difficulty do you want?");
        System.out.println("1 is easiest and 5 is hardest");

        switch (diff) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(10);
                    int randNum2 = rand.nextInt(10);
                    int answer = randNum1 - randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " - " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                int percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

            case 2:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(99);
                    int randNum2 = rand.nextInt(99);
                    int answer = randNum1 - randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " - " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 3:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(999);
                    int randNum2 = rand.nextInt(999);
                    int answer = randNum1 - randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " - " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns =  r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }

                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 4:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(9999);
                    int randNum2 = rand.nextInt(9999);
                    int answer = randNum1 - randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " - " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

        }
    }

    public static void Div() {
        Scanner s = new Scanner(System.in);
        int diff = s.nextInt();
        int correct = 0;
        System.out.println("What difficulty do you want?");
        System.out.println("1 is easiest and 5 is hardest");

        switch (diff) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(10);
                    int randNum2 = rand.nextInt(10);
                    int answer = randNum1 / randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " / " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                int percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

            case 2:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(99);
                    int randNum2 = rand.nextInt(99);
                    int answer = randNum1 / randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " / " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 3:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(999);
                    int randNum2 = rand.nextInt(999);
                    int answer = randNum1 / randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " / " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns =  r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }

                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;
            case 4:
                for (int i = 0; i < 10; i++) {
                    Random rand = new SecureRandom();
                    int randNum1 = rand.nextInt(9999);
                    int randNum2 = rand.nextInt(9999);
                    int answer = randNum1 / randNum2;
                    int pAnswer = s.nextInt();
                    System.out.println("What is " + randNum1 + " / " + randNum2);

                    if (pAnswer == answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("Very Good!");
                                correct++;
                                break;
                            case 1:
                                System.out.println("Excellent!");
                                correct++;
                                break;
                            case 2:
                                System.out.println("Nice Work!");
                                correct++;
                                break;
                            case 3:
                                System.out.println("Keep up the good work!");
                                correct++;
                                break;
                            default:
                                System.out.println("ERROR!!");
                                break;
                        }
                    }

                    if (pAnswer != answer) {
                        Random r = new SecureRandom();
                        int randAns = r.nextInt(4);
                        switch (randAns) {
                            case 0:
                                System.out.println("No. Please Try Again.");
                                break;
                            case 1:
                                System.out.println("Wrong. Try once more.");
                                break;
                            case 2:
                                System.out.println("Don't Give up!");
                                break;
                            case 3:
                                System.out.println("No. Keep Trying");
                                break;
                            default:
                                System.out.println("SYSTEM ERROR!!");
                                break;
                        }
                    }
                }
                percent = (correct / 10) * 100;

                if (percent >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");

                break;

        }
    }
}

