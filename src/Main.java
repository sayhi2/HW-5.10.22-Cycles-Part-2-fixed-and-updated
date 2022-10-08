public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //
        //Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей" с тем количеством месяцев,
        // необходимым для накопления данной суммы.
        int saving = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i++;
            total = total + saving;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }

        //Task 2
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //
        //В результате программы вывод должен получиться следующий:
        //
        //1 2 3 4 5 6 7 8 9 10
        //
        //10 9 8 7 6 5 4 3 2 1
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }

        for (a = 10; a > 0; a--) {
            System.out.printf(" " + a);
        }


        //Task 3
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек. Рассчитайте,
        // какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
        //  В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "

        int population = 12000000;
        int births = 17 * population / 1000;
        int deaths = 8 * population / 1000;
        int yearToDate = 0;
        while (yearToDate < 10) {
            population = population + births - deaths;
            yearToDate++;
            System.out.println(" Год " + yearToDate + ", численность населения составляет " + population);
        }

        //Task 2-1
        //Напишите программу, которая выводит в консоль сумму накоплений.
        ////Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        ////Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        // что процент банка от накоплений не меняется, а всегда равен 7%.
        // Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.

        float deposit = 15000;
        float percentage = 0.07f;
        int goal = 12_000_000;
        int month = 0;
        while (goal > deposit) {
            deposit = deposit + deposit * percentage;
            month++;
            System.out.println(" За месяц " + month + " , сумма накоплений равна " + deposit);
        }

        //Task 2-2
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        // Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.

        deposit = 15000;
        percentage = 0.07f;
        goal = 12_000_000;
        month = 0;
        while (goal > deposit) {
            deposit = deposit + deposit * percentage;
            month++;
            if (month % 6 == 0) {
                System.out.println(" За месяц " + month + ", сумма накоплений равна " + deposit + " рублей ");
            }
        }

        // Task 2-3
        //Василий решил копить деньги ближайшие 9 лет. И он хочет знать,
        // какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        ////Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        ////Напишите программу,
        // которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
        deposit = 15000;
        percentage = 0.07f;
        goal = 12_000_000;
        month = 0;
        while (month <= 108) {
            deposit = deposit + deposit * percentage;
            month++;
            if (month % 6 == 0) {
                System.out.println(" За месяц " + month + ", сумма накоплений равна " + deposit + " рублей ");
            }
    }

        // Task 2-4
        //В вашей компании пятница является днем отчетным.
        //Нам нужно написать программу, которая считает дни месяца по датам, определяет,
        // какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Условия задачи:
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.

        int october = 31;
        int f = 7;
        for (f = 7; f <= 31; f = f + 7) {
            System.out.println(" Сегодня пятница " + f + "-е Октября.Необходимо подготовить отчет. ");
        }

        // Task 3-1
        // Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        // Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        //Условия задачи:
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисления периода можно создать две дополнительные переменные,
        // которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и
        // 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:
        //1896
        //1975
        //2054

        int year = 0;
        int cometCycle = 79;
        int current = 2022;
        int past = current - 200;
        int future = current + 100;
        while (year < future) {
            if (year > past) {
                System.out.println(year);
            }
            year = year + cometCycle;
        }

        // Task 3-2
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:

        for (i = 1; i <= 10; i ++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }



}}