public class Main {

    public static void main(String[] args) {
        System.out.print(numberToString(785));
    }

    public static String numberToString(int number){
        String sNum = "";
        switch (number / 100){
            case 1: sNum += "сто ";
                break;
            case 2: sNum += "двести ";
                break;
            case 3: sNum += "триста ";
                break;
            case 4: sNum += "четыреста ";
                break;
            case 5: sNum += "пятьсот ";
                break;
            case 6: sNum += "шестьсот ";
                break;
            case 7: sNum += "семьсот ";
                break;
            case 8: sNum += "восемьсот ";
                break;
            case 9: sNum += "девятьсот ";
                break;
        }
        if(number % 100 < 20 && number % 100 >= 10){
            switch (number % 100){
                case 10: sNum += "десять";
                    break;
                case 11: sNum += "одиннадцать";
                    break;
                case 12: sNum += "двенадцать";
                    break;
                case 13: sNum += "тринадцать";
                    break;
                case 14: sNum += "четырнадцать";
                    break;
                case 15: sNum += "пятнадцать";
                    break;
                case 16: sNum += "шестнадцать";
                    break;
                case 17: sNum += "семнадцать";
                    break;
                case 18: sNum += "восемнадцать";
                    break;
                case 19: sNum += "девятнадцать";
                    break;
            }
            return sNum;
        }
        else {
            switch (number % 100 / 10){
                case 2: sNum += "двадцать ";
                    break;
                case 3: sNum += "тридцать ";
                    break;
                case 4: sNum += "сорок ";
                    break;
                case 5: sNum += "пятьдесят ";
                    break;
                case 6: sNum += "шестьдесят ";
                    break;
                case 7: sNum += "семьдесят ";
                    break;
                case 8: sNum += "восемьдесят ";
                    break;
                case 9: sNum += "девяноста ";
                    break;
            }
        }
        switch (number % 10){
            case 1: sNum += "один";
                break;
            case 2: sNum += "два";
                break;
            case 3: sNum += "три";
                break;
            case 4: sNum += "четыре";
                break;
            case 5: sNum += "пять";
                break;
            case 6: sNum += "шесть";
                break;
            case 7: sNum += "семь";
                break;
            case 8: sNum += "восемь";
                break;
            case 9: sNum += "девять";
                break;
        }
        return sNum;
    }
}