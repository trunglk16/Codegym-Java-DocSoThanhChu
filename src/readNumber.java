public class readNumber {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        if (number < 10 && number >= 0){
            switch (number){
                case(0):
                    System.out.println("zero");
                    break;
                case(1):
                    System.out.println("one");
                    break;
                case(2):
                    System.out.println("two");
                    break;
                case(3):
                    System.out.println("three");
                    break;
                case(4):
                    System.out.println("four");
                    break;
                case(5):
                    System.out.println("five");
                    break;
                case(6):
                    System.out.println("six");
                    break;
                case(7):
                    System.out.println("seven");
                    break;
                case(8):
                    System.out.println("eight");
                    break;
                case(9):
                    System.out.println("nine");
                    break;

            }
        }else if (number < 20){
            switch (number){
                case(10):
                    System.out.println("ten");
                    break;
                case(11):
                    System.out.println("eleven");
                    break;
                case(12):
                    System.out.println("twelve");
                    break;
                case(13):
                    System.out.println("thirdteen");
                    break;
                case(14):
                    System.out.println("fourteen");
                    break;
                case(15):
                    System.out.println("fifteen");
                    break;
                case(16):
                    System.out.println("sixteen");
                    break;
                case(17):
                    System.out.println("seventeen");
                    break;
                case(18):
                    System.out.println("eightteen");
                    break;
                case(19):
                    System.out.println("nineteen");
                    break;
            }
        }else{
            String temp = Integer.toString(number);
            char[] num = temp.toCharArray();
            if(num.length == 2){
                switch (num[0]){

                }
            }

        }
    }
}
