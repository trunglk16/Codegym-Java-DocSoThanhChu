public class test {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Insert the number");
        int number = input.nextInt();
        String output = "";
        String temp = Integer.toString(number);
        if (temp.length() == 0 || temp.length() > 3) {
            System.out.println("Invalid number");
        } else if (temp.length() == 1) {
            switch (number) {
                case (0):
                    output += "zero";
                    break;
                case (1):
                    output += "one";
                    break;
                case (2):
                    output += "two";
                    break;
                case (3):
                    output += "three";
                    break;
                case (4):
                    output += "four";
                    break;
                case (5):
                    output += "five";
                    break;
                case (6):
                    output += "six";
                    break;
                case (7):
                    output += "seven";
                    break;
                case (8):
                    output += "eight";
                    break;
                case (9):
                    output += "nine";
                    break;

            }


        } else if (temp.length() == 2) {
            if (number < 20) {
                switch (number) {
                    case (10):
                        output += "ten";
                        break;
                    case (11):
                        output += "eleven";
                        break;
                    case (12):
                        output += "twelve";
                        break;
                    case (13):
                        output += "thirdteen";
                        break;
                    case (14):
                        output += "fourteen";
                        break;
                    case (15):
                        output += "fifthteen";
                        break;
                    case (16):
                        output += "sixteen";
                        break;
                    case (17):
                        output += "seventeen";
                        break;
                    case (18):
                        output += "eightteen";
                        break;
                    case (19):
                        output += "nineteen";
                        break;
                }
            } else {

                switch (Integer.parseInt(temp.substring(0, 1))) {
                    case (2):
                        output += "twenty";
                        break;
                    case (3):
                        output += "thirty";
                        break;
                    case (4):
                        output += "forty";
                        break;
                    case (5):
                        output += "fifty";
                        break;
                    case (6):
                        output += "sixty";
                        break;
                    case (7):
                        output += "seventy";
                        break;
                    case (8):
                        output += "eighty";
                        break;
                    case (9):
                        output += "ninety";
                        break;


                }
                switch (Integer.parseInt(temp.substring(1, 2))) {
                    case (0):
                        output += "";
                        break;
                    case (1):
                        output += " one";
                        break;
                    case (2):
                        output += " two";
                        break;
                    case (3):
                        output += " three";
                        break;
                    case (4):
                        output += " four";
                        break;
                    case (5):
                        output += " five";
                        break;
                    case (6):
                        output += " six";
                        break;
                    case (7):
                        output += " seven";
                        break;
                    case (8):
                        output += " eight";
                        break;
                    case (9):
                        output += " nine";
                        break;
                }
            }

        } else {
            switch (Integer.parseInt(temp.substring(0, 1))) {
                case (1):
                    output += " one hundred ";
                    break;
                case (2):
                    output += " two hundred ";
                    break;
                case (3):
                    output += " three hundred ";
                    break;
                case (4):
                    output += " four hundred ";
                    break;
                case (5):
                    output += " five hundred ";
                    break;
                case (6):
                    output += " six hundred ";
                    break;
                case (7):
                    output += " seven hundred ";
                    break;
                case (8):
                    output += " eight hundred ";
                    break;
                case (9):
                    output += " nine hundred ";
                    break;
            }
            if (Integer.parseInt(temp.substring(1, 3)) < 20) {
                switch (Integer.parseInt(temp.substring(1, 3))) {
                    case (10):
                        output += "ten";
                        break;
                    case (11):
                        output += "eleven";
                        break;
                    case (12):
                        output += "twelve";
                        break;
                    case (13):
                        output += "thirdteen";
                        break;
                    case (14):
                        output += "fourteen";
                        break;
                    case (15):
                        output += "fifthteen";
                        break;
                    case (16):
                        output += "sixteen";
                        break;
                    case (17):
                        output += "seventeen";
                        break;
                    case (18):
                        output += "eightteen";
                        break;
                    case (19):
                        output += "nineteen";
                        break;
                }
            } else {
                switch (Integer.parseInt(temp.substring(1, 2))) {
                    case (2):
                        output +="twenty";
                        break;
                    case (3):
                        output +="thirty";
                        break;
                    case (4):
                        output +="forty";
                        break;
                    case (5):
                        output +="fifty";
                        break;
                    case (6):
                        output +="sixty";
                        break;
                    case (7):
                        output +="seventy";
                        break;
                    case (8):
                        output +="eighty";
                        break;
                    case (9):
                        output +="ninety";
                        break;


                }
                switch (Integer.parseInt(temp.substring(2, 3))) {
                    case (0):
                        output += "";
                        break;
                    case (1):
                        output += "one";
                        break;
                    case (2):
                        output += "two";
                        break;
                    case (3):
                        output += "three";
                        break;
                    case (4):
                        output += "four";
                        break;
                    case (5):
                        output += "five";
                        break;
                    case (6):
                        output += "six";
                        break;
                    case (7):
                        output += "seven";
                        break;
                    case (8):
                        output += "eight";
                        break;
                    case (9):
                        output += "nine";
                        break;
                }
            }
        }
        System.out.println(output);
    }
}
