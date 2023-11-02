public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");
        boolean isMan = false;
        if (!isMan) {
            System.out.println("Этот клиент мужского пола.");
        } else {
            System.out.println("Этот клиент жеского пола.");
        }

        short age = 20;
        if (age > 18) {
            System.out.println("Вы являетесь совершеннолетним.");
        } else {
            System.out.println("Вы ещё несовершеннолетний.");
        }

        float height = 1.9f;
        if (height < 1.8) {
            System.out.println("Вы невысокого роста.");
        } else {
            System.out.println("У вас высокий рост.");
        }

        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается с буквы М.");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается с буквы I.");
        } else {
            System.out.println("Ваше имя начинается не с букв М или I.");
        }

        System.out.println("\n2.Поиск большего числа.");
        byte num1 = 22;
        byte num2 = 11;
        System.out.println("Первое число равно " + num1);
        System.out.println("Второе число равно " + num2);
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа.");
        int num3 = -5;
        if (num3 != 0 ) {
            if (num3 % 2 == 0 && num3 > 0) {
                System.out.println("Число " + num3 + " является чётным  и положительным.");
            } else if (num3 % 2 == 1 && num3 > 0) {
                System.out.println("Число " + num3 + " является нечётным и положительным.");
            } else if(num3 % 2 == 0 && num3 < 0) {
                System.out.println("Число " + num3 + " является чётным и отрицательным.");
            } else if(num3 % 2 == -1 && num3 < 0) {
                System.out.println("Число " + num3 + " является нечётным и отрицательным.");
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах.");
        int num4 = 123;
        int num5 = 333;
        int hundreds4 = num4 / 100;
        int tens4 = (num4 / 10) % 10;
        int ones4 = num4 % 10;
        int hundreds5 = num5 / 100;
        int tens5 = (num5 / 10) % 10;
        int ones5 = num5 % 10;
        if ((hundreds4 != hundreds5) && (tens4 != tens5) && (ones4 != ones5)) {
            System.out.println("В этих числах нет равных цифр, стоящих в одинаковых разрядах.");
        } else if ((hundreds4 == hundreds5) && (tens4 == tens5) && (ones4 != ones5)) {
            System.out.println("Одинаковая цифра в третьем разряде = " + hundreds4 + 
                    "; одинаковая цифра во втором разряде = " + tens4 + ".");
        } else if ((hundreds4 == hundreds5) && (tens4 != tens5) && (ones4 == ones5)) {
            System.out.println("Одинаковая цифра в третьем разряде = " + hundreds4 + 
                    "; одинаковая цифра в первом разряде = " + ones4 + ".");
        } else if ((hundreds4 == hundreds5) && (tens4 != tens5) && (ones4 != ones5)) {
            System.out.println("Одинаковая цифра в третьем разряде = " + hundreds4 + ".");
        } else if ((hundreds4 != hundreds5) && (tens4 == tens5) && (ones4 == ones5)) {
            System.out.println("Одинаковая цифра во втором разряде = " + tens4 + 
                    "; одинаковая цифра в первом разряде = " + ones4 + ".");
        } else if ((hundreds4 != hundreds5) && (tens4 == tens5) && (ones4 != ones5)) {
            System.out.println("Одинаковая цифра во втором разряде = " + tens4 + ".");
        } else if ((hundreds4 != hundreds5) && (tens4 != tens5) && (ones4 == ones5)) {
            System.out.println("Одинаковая цифра в первом разряде = " + ones4 + ".");
        } else {
            System.out.println("Числа равны.");
        }

        System.out.println("\n5.Определение символа по его коду.");
        char symbol = 'A';
        if (symbol > 47 && symbol < 59) {
            System.out.println("Символ " + symbol + " является цифрой"); 
        } else if (symbol > 96 && symbol < 123) {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol > 64 && symbol < 91) {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else {
            System.out.println("Символ " + symbol + " является не буквой и не цифрой");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %.");
        double startMoney = 100000d;
        double sumMoney  = 100000d;
        double sumProfit = 0;
        if (startMoney < 100000) {
            sumProfit = startMoney * 0.05;
            sumMoney += sumProfit;
        } else if (startMoney >= 100000 && startMoney <= 300000) {
            sumProfit = startMoney * 0.07;
            sumMoney += sumProfit;
        } else if (startMoney > 300000) {
            sumProfit = startMoney * 0.1;
            sumMoney += sumProfit;
        }
        System.out.println("Сумма вклада = " + startMoney + "; Сумма начисленных процентов = " +
                + sumProfit + "; Итоговая сумма = " + sumMoney + ".");

        System.out.println("\n7.Определение оценки по предметам.");
        int historyPercent = 59;
        int historyMark = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        } else if (historyPercent > 91 && historyPercent <= 100) {
            historyMark = 5;
        }
        System.out.println("История = " + historyMark);
        int programmingPercent = 92;
        int programmingMark = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        } else if (programmingPercent > 91 && programmingPercent <= 100) {
            programmingMark = 5;
        }
        System.out.println("Программирование = " + programmingMark);
        int averageMark = (historyMark + programmingMark) / 2;
        System.out.println("Cредний балл оценок по предметам = " + averageMark);
        double averagePercent = (double) (historyPercent + programmingPercent) / 2;
        System.out.println("Средний процент по предметам = " + averagePercent);

        System.out.println("\n8.Расчёт годовой прибыли.");
        int monthlySales = 15000;
        int rentCost = 5000;
        int productionCost = 9000;
        int annualProfit = (monthlySales - rentCost - productionCost) * 12;
        if (annualProfit < 0 || annualProfit > 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        }
    }
}