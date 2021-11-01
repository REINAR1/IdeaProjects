
package com.itschool;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in); // Экземпляр класса Scanner для ввода значений в консоль

    public static void main(String[] args) {
        Random r = new Random();
        double b = r.nextDouble(10) - 5;
        System.out.println(System.lineSeparator() + ConsoleColors.GREEN_BACKGROUND_BRIGHT + String.format("%8.3f", b) + ConsoleColors.RESET);
        // Форматирование вывода на экран вещественных числовых значений + управление цветом текста и фона, стилем текста
        // "%8.3f" означает: 8 знаков для вещественного числа (f - float) с выравниванием по правому краю,
        // при этом 3 знака после запятой (дробная часть)

        ConditionExample_1();
//      ConditionExample_2();
//      ConditionExample_3();
//      ConditionExample_4();
//      ConditionExample_5();
//
//      TernaryExample_1();
//      TernaryExample_2();
//      TernaryExample_3();
//      TernaryExample_4();
//      TernaryExample_5();
//
//      SwitchExample_1();
//      SwitchExample_2();
//      SwitchExample_3();
//      SwitchExample_4();
//      CoffeeMakerExample();
//
//      FromIfToTernary();
//      FromIfToSwitch();
//
//      HardwareLogicExample();
//      ShortLogic();
//      LogicalExpressions();
//
//      HomeworkExample_1();
//      HomeworkExample_2();
    }

    // Ветвления. Пример 1
    private static void ConditionExample_1() {
        System.out.println("\nВетвления. Пример 1");
        int a = 1, b = 2; // создаем две целочисленные переменные

        // В 52-й строке создаем условную конструкцию if, в условии которой проверяем: a меньше b
        if (a < b)      // Если условие удовлетворяет истинности, выполняем тело условной конструкции.
        {
            System.out.println("a < b");     // Ветвь 1
        }
    }

    // Ветвления. Пример 2
    private static void ConditionExample_2() {
        System.out.println("\nВетвления. Пример 2");
        int a = 2, b = 1;

        if (a < b)  // Если условие удовлетворяет истинности, выполняем тело блока if.
        {
            System.out.println("a < b");               // Ветвь 1
        } else        // Иначе, выполняем тело блока else.
        {
            System.out.println("a не меньше b");       // Ветвь 2
        }
    }

    // Ветвления. Пример 3
    private static void ConditionExample_3() {
        System.out.println("\nВетвления. Пример 3");
        int a = 1, b = 2;

        // Если тело блока if или else состоит из одного выражения, то операторные скобки можно опустить

        if (a < b) {
            System.out.println("a < b");           // Ветвь 1
        } else {
            System.out.println("a не меньше b");   // Ветвь 2
        }
    }

    // Ветвления. Пример 4
    private static void ConditionExample_4() {
        System.out.println("\nВетвления. Пример 4");
        int a = 2, b = 2;

        if (a < b)      // каскад условных операторов
        {
            System.out.println("a < b");   // Ветвь 1
        } else if (a > b) // идем на новую проверку
        {
            System.out.println("a > b");   // Ветвь 2
        } else {
            System.out.println("a == b");  // Ветвь 3
        }
    }

    // Ветвления. Пример 5
    private static void ConditionExample_5() {
        System.out.println("\nВетвления. Пример 5");

        String login = "Admin";
        String password = "P@ssw0rd";

        System.out.print("Введите login: ");

        // В 114 строке создаем локальную строковую переменную с именем userLogin
        // и принимаем в нее ввод от пользователя

        String userLogin = scanner.next();

        // login == usersLogin - сравнивает ссылки
        // login.equals(userLogin) - сравнивает значения

        if (login.equalsIgnoreCase(userLogin)) {
            System.out.print("Введите password: ");
            String usersPassword = scanner.next();

            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + userLogin + " Вы вошли в систему.");
            } else {
                System.out.println("Вы ввели неверный пароль.");
            }
        } else {
            System.out.println("Нет пользователя с таким именем.");
        }
    }

    //  Тернарный оператор. Пример 1
    private static void TernaryExample_1() {
        System.out.println("\nТернарный оператор. Пример 1");
        int a = 1, b = 2, max = 0;

        // Переменной max, присваиваем возвращаемое значение тернарного оператора.
        max = (a > b) ? a : b;   // ЕСЛИ:  (a > b)  ТО:  вернуть a  ИНАЧЕ: вернуть b;

        System.out.println(max);
    }

    //  Тернарный оператор. Пример 2
    private static void TernaryExample_2() {
        System.out.println("\nТернарный оператор. Пример 2");
        String str = "Hello, ";

        System.out.println("Введите свой логин : ");

        // На 152 строке создаем переменную с именем login типа string и принимаем в нее ввод от пользователя
        String login = scanner.next();

        // На 155 строке переменной str присваиваем возвращаемое значение тернарного оператора
        str += login.equalsIgnoreCase("Admin") ? "Administrator" : "User";

        System.out.println(str);
    }

    //  Тернарный оператор. Пример 3
    private static void TernaryExample_3() {
        System.out.println("\nТернарный оператор. Пример 3");
        int a = 1;
        double b = 0.0;
        int max;

        // Выражения [?] и [:]  - должны быть одного типа.
        max = (int) ((a > b) ? a : b);

        // ... или так
        max = (a > b) ? a : (int) b;

        System.out.println(max);
    }

    //  Тернарный оператор. Пример 4
    private static void TernaryExample_4() {
        System.out.println("\nТернарный оператор. Пример 4");
        // Определение квадранта в котором лежит заданная точка.
        // Для упрощения примера условимся, что точка не будет лежать в центре координат и на координатных осях,
        // это значит, что x и y - не могут быть равны 0.

        int x = 10, y = -5;

        // Не рекомендуется вкладывать тернарные операторы, так как это ухудшает чтение кода.

        //                         condition    true block    false block     condition   true block       false block
        //                          -------- ? ------------ : -------------    -------- ? ------------- : --------------
        String quadrant = (x > 0) ? ((y > 0) ? "I квадрант" : "IV квадрант") : ((y > 0) ? "II квадрант" : "III квадрант");
        //                ------- ? ---------------------------------------- : -------------------------------------------
        //                condition               true block                                   false block

        // ... или так

        quadrant = x > 0 ? (y > 0 ? "I квадрант" : "IV квадрант") : (y > 0 ? "II квадрант" : "III квадрант");

        // ... или вообще, вот так

        quadrant = x > 0 ? y > 0 ? "I квадрант" : "IV квадрант" : y > 0 ? "II квадрант" : "III квадрант";

        System.out.println(quadrant);
    }

    //  Тернарный оператор. Пример 5
    private static void TernaryExample_5() {
        System.out.println("\nТернарный оператор. Пример 5");
        byte quantity = (byte) Math.round(5 + Math.random() * 10);    // Количество единиц товара.
        double price = 100;      // Цена за единицу товара.
        double discount = 0.25;  // Скидка на общую стоимость - 25%.
        double cost = 0.0;       // Общая стоимость.

        // ЕСЛИ: Купили 10 единиц товара и больше. ТО: предоставить скидку в 25%. ИНАЧЕ: Скидку не предоставлять.
        cost = quantity * price * (quantity >= 10 ? (1 - discount) : 1);

        System.out.println("Общая стоимость " + quantity + " единиц товара составляет: " + cost + " у.е.");
    }

    //   Оператор множественного выбора. Пример 1
    private static void SwitchExample_1() {
        System.out.println("\nОператор множественного выбора. Пример 1");

        // Предлагаем пользователю ввести число.
        System.out.println("Введите число 1 или 2: ");

        // Принимаем ввод от пользователя.
        String number = scanner.next();

        // В 231 строке создаем конструкцию многозначного выбора, переключатель - switch,
        // которому в качестве выражения-селектора, передаем переменную - number.

        switch (number)  // (number) — выражение-селектор.
        {
            // В теле переключателя switch-case, в 239 и 245 строках,
            // создаем два оператора case, c постоянными выражениями равными "1" и "2" соответственно.

            // Если значение выражения-селектора совпадет с одним из значений постоянных выражений,
            // то выполняется тело оператора case, постоянное выражение которого, совпало с выражением-селектора.

            case "1":   // "1" — постоянное выражение.
            {
                System.out.println("Один");                                       // Ветвь 1
                break;   // Выход из переключателя.
            }

            case "2": {
                System.out.println("Два");                                        // Ветвь 2
                break;
            }

            // В 253 строке создаем (необязательный) оператор default, тело которого выполняется в случае,
            // если значение выражения-селектора не совпадет ни с одним из значений постоянных выражений.

            default: {
                System.out.println("Вы ввели значение отличное от 1 и 2.");       // Ветвь 3
                break;
            }
            // Если в переключателе отсутствует оператор default, то управление передается за пределы переключателя switch.
        }
    }

    //   Оператор множественного выбора. Пример 2
    private static void SwitchExample_2() {
        System.out.println("\nОператор множественного выбора. Пример 2");
        System.out.println("Введите номер дня недели (число от 1 до 7): ");

        String myDay = scanner.next();

        // Конвертируем значение строковой переменной myDay в целочисленное значение
        // и записываем его в переменную с именем day типа int

        int day = Integer.parseInt(myDay);

        switch (day) {
            case 1:
                System.out.println("Понедельник.");
                break;
            case 2:
                System.out.println("Вторник.");
                break;
            case 3:
                System.out.println("Среда.");
                break;
            case 4:
                System.out.println("Четверг.");
                break;
            case 5:
                System.out.println("Пятница.");
                break;
            case 6:
                System.out.println("Суббота.");
                break;
            case 7:
                System.out.println("Воскресенье.");
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
    }

    //   Оператор множественного выбора. Пример 3
    private static void SwitchExample_3() {
        System.out.println("\nОператор множественного выбора. Пример 3");
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");

        String day = scanner.next();

        switch (day) {
            // Для пустых операторов case разрешено "проваливание" от одного оператора к другому.
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("Этот день недели - Рабочий.");
                break;
            case "6":
            case "7":
                System.out.println("Этот день недели - Выходной.");
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
    }

    //   Оператор множественного выбора. Пример 4
    private static void SwitchExample_4() {
        System.out.println("\nОператор множественного выбора. Пример 4");

        int k = (int) Math.round((Math.random() * 3) + 1);

        switch (k) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            default -> System.out.println("many");
        }

        System.out.println(
                switch (k) {
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    default -> "many";
                }
        );
    }

    //   Реализация простого кофейного автомата (switch)
    private static void CoffeeMakerExample() {
        System.out.println("\nКофейный автомат");
        // Предлагаем пользователю выбрать напиток.
        System.out.println("Размеры стаканчиков кофе: 1 = Маленький, 2 = Средний, 3 = Большой");
        System.out.print("Пожалуйста, сделайте свой выбор: ");

        // Принимаем ввод от пользователя.
        String coffeeSize = scanner.next();

        int cost = 1;

        switch (coffeeSize) {
            case "1":
                cost += 25;
                break;
            case "2":
                cost += 50;
                break;
            case "3":
                cost += 75;
                break;
            default:
                System.out.println("Неверный выбор. Пожалуста выберите 1, 2, или 3.");
                break;
        }

        if (cost != 0) {
            System.out.println("Внесите " + cost + " копеек.");
            System.out.println("Спасибо!");
        } else {
            System.out.print("Пожалуйста, повторите выбор.");
        }
    }

    // Переход от конструкции if-else, к тернарному оператору(?:)
    private static void FromIfToTernary() {
        System.out.println("\nПереход от конструкции if-else, к тернарному оператору(?:)");
        int a = 3, b = 10;

        // Реализация сравнения на if-else
        if (a < b) {
            System.out.println("a меньше b");
        } else {
            System.out.println("а больше b");
        }

        // Реализвация сравнения на тернарном операторе (?:)
        System.out.println("a " + (a < b ? "меньше" : "больше") + " b");
    }

    // Переход от конструкции if-else, к switch
    private static void FromIfToSwitch() {
        System.out.println("\nПереход от конструкции if-else, к switch-case");
        int a = 2;

        // Реализвация на if-else
        if (a == 1) {
            System.out.println("a = 1");
        } else if (a == 2) {
            System.out.println("a = 2");
        } else {
            System.out.println("Переменная а не равна ни 1, ни 2");
        }

        // Реализация на switch-case
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("Переменная а не равна ни 1, ни 2");
                break;
        }
    }

    // Побитовые логические операции. (&, |)
    private static void HardwareLogicExample() {
        System.out.println("\nПобитовые логические операции. (&, |)");

        // Например:
        // Мы имеем порт ввода/вывода или регистр с определенным значением в нем.
        // Нам необходимо включить устройство управляемое первым битом, установив первый бит в 1.
        // После нам потребуется выключить устройство, сбросив первый бит в 0.
        //  1 1 1 1   0 0 0 0  -  начальное значение порта ввода/вывода.
        //  7 6 5 4   3 2 1 0  -  нумерация битов управления устройствами.

        byte port = (byte) 0xF0;     // 1 1 1 1   0 0 0 0  -  начальное значение порта ввода/вывода.
        byte mask = (byte) 0x02;     // 0 0 0 0   0 0 1 0  -  маска включения устройства управляемого первым битом.

        System.out.println("port = " + Integer.toBinaryString(port).substring(24)); // ситуация с лампочкой в комнате

        port = (byte) (port | mask);  // Включить устройство управляемое первым битом.
        System.out.println("port = " + Integer.toBinaryString(port).substring(24)); // ситуация с лампочкой в комнате

        mask = (byte) 0xFD;          // 1 1 1 1   1 1 0 1  -  Создаем маску выключения устройства управляемого первым битом.

        port = (byte) (port & mask);  // Выключить устройство управляемое первым битом.
        System.out.println("port = " + Integer.toBinaryString(port).substring(24));
    }

    //   Короткозамкнутое вычисление
    private static void ShortLogic() {
        System.out.println("\nКороткозамкнутое вычисление");
        int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // Условие, которое работает с использованием техники КОРОТКОЗАМКНУТОГО ВЫЧИСЛЕНИЯ.
        // Если бы это выражение вычислялось полностью, то операция деления во втором операнде,
        // генерировала бы ошибку деления на 0.

        if ((denominator != 0) && (item / denominator) > MIN_VALUE) // Оставьте один оператор &
        {
            System.out.println("Мы в блоке IF");
        } else {
            System.out.println("Мы в блоке ELSE");
        }
    }
    //   Примеры логических выражений -- ОБЯЗАТЕЛЬНО К ОЗНАКОМЛЕНИЮ

    private static void LogicalExpressions() {
        System.out.println("\nПримеры логических ветвлений");

        // Переменные для сравнения
        int a = 2, b = 3, c = 3;

        // Переменная, содержащая результат логической функции
        boolean bool = false;

        // Выведем значения переменных на экран
        System.out.println("a = " + a + " , b = " + b + " , c = " + c);

        // Простые логические выражения
        System.out.print("Простые логические выражения");

        bool = (a > b);                                    // false
        System.out.println("a > b = " + bool);

        bool = (a < b);                                    // true
        System.out.println("a < b = " + bool);

        bool = (a == b);                                   // false
        System.out.println("a == b = " + bool);

        bool = (a != b);                                   // true
        System.out.println("a != b = " + bool);

        bool = (b == c);                                   // true
        System.out.println("b == c = " + bool);

        bool = (b >= c);                                   // true
        System.out.println("b >= c = " + bool);

        bool = (b <= c);                                   // true
        System.out.println("b <= c = " + bool);


        // Рассмотрим составные логические выражения
        System.out.println("Составные логические выражения");

        bool = (a > b) || (b == c);                           // true
        System.out.println("(a > b) || (b==c) = " + bool);

        bool = !(a > b) && ((a <= c) || (a == c));            // true
        System.out.println(" !(a>b) && ((a<=c) ||(a==c)) = " + bool);

        bool = (a + b) > (a + c);                             // false
        System.out.println("(a+b) > (a+c) = " + bool);

        bool = !((a + b) > (a + c));                          // true
        System.out.println("!((a+b) > (a+c)) = " + bool);

        bool = ((double) a / b) >= ((double) b / a);          // false
        System.out.println("((double)a/b) >= ((double)b/a) = " + bool);

        bool = (a + (b / c)) >= (b + (b * c));                // false
        System.out.println("(a+(b/c)) >= (b+(b*c)) = " + bool);

        bool = false & true;                                    // false
        System.out.println("false&true = " + bool);

        bool = true | false;                                    // true
        System.out.println("true|false = " + bool);

        // Сложное логическое выражение
        a = 2;
        b = 3;
        c = 4;
        System.out.println("Сложное логическое выражение");
        bool = (((++a * c++) / (a++ + --b)) > ++b * c) && (a * b * c + a * (-b) / c) >= (a * b * (c++)); // false
        System.out.println("(((++a*c++)/(a++ + --b)) > ++b * c) && (a*b*c + a*(-b)/c) >= (a*b*(c++)) = " + bool);
    }

    //   Типовая задача из домашнего задания. Пример 1
    private static void HomeworkExample_1() {
     /* Написать программу, которая вычисляет оптимальный вес для пользователя,
        сравнивает его с реальным и выдает рекомендацию о необходимости поправиться или похудеть.
        Оптимальный вес вычисляется по формуле: Рост (см) – 100. */

        System.out.println("Типовая задача из домашнего задания. Пример 1");

        // Вес
        double weight = 0D;
        // Идеальный вес
        double idealWeight = 0D;
        // Рост
        double growth = 0D;

        System.out.print("Введите Ваш вес : ");
        weight = scanner.nextDouble();

        System.out.print("Введите ваш рост : ");
        growth = scanner.nextDouble();

        // Находим идеальный вес
        idealWeight = growth - 100;

        // Если вес больше идеального веса
        if (weight > idealWeight) {
            System.out.println("Вам необходимо похудеть на " + (weight - idealWeight) + " кг");
        }
        // Иначе если вес меньше идеального веса
        else if (weight < idealWeight) {
            System.out.println("Вам необходимо поправится на " + (idealWeight - weight) + " кг");
        }
        // Иначе
        else {
            System.out.println("Ваш вес идеален ! ");
        }
    }

    //   Типовая задача из домашнего задания. Пример 2
    private static void HomeworkExample_2() {
      /*Напишите программу, которая запрашивает у пользователя номер месяца и затем выводит соответствующее название времени года.
      В случае, если пользователь введет недопустимое число, программа должна вывести сообщение "Ошибка ввода данных". */

        System.out.println("Типовая задача из домашнего задания. Пример 2");

        int index = 0;
        System.out.print("Введите номер месяца : ");
        index = scanner.nextInt();

        if (index == 1 || index == 2) {
            System.out.println("Сейчас зима...");
        } else if (index >= 3 && index <= 5) {
            System.out.println("Сейчас весна...");
        } else if (index >= 6 && index <= 8) {
            System.out.println("Сейчас лето...");
        } else if (index >= 9 && index <= 11) {
            System.out.println("Сейчас осень...");
        } else if (index == 12) {
            System.out.println("Сейчас зима и скоро Новый год :)");
        } else {
            System.out.println("Ошибка ввода данных");
        }
    }
}