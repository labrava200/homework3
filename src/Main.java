public class Main {
    public static void main(String[] args) {
//Задача 1
        int q = 2000000;
        byte w = 100;
        short e = 20000;
        long r = 90000000L;
        float t = 3.45f;
        double y = 7.01986725;
        System.out.println("Значение переменной q с типом int равно " + q);
        System.out.println("Значение переменной w с типом byte равно " + w);
        System.out.println("Значение переменной e с типом short равно " + e);
        System.out.println("Значение переменной r с типом long равно " + r);
        System.out.println("Значение переменной t с типом float равно " + t);
        System.out.println("Значение переменной y с типом double равно " + y);

//Задача 2
        float a = 27.12f;
        long s = 987678965549L;
        float d = 2.786f;
        short f = 569;
        short g = -159;
        short h = 27897;
        byte j = 67;

//Задача 3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short allPaper = 480;
        byte allStudent =(byte)(teacher1 + teacher2 + teacher3);
        byte paper =(byte) (480 / allStudent);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
//Задача 4
        byte bottleFrMin = 16 / 2;
        short bottle20Min =(short) (bottleFrMin * 20);
        short daysMin = 60 * 24;
        short bottle1Day =(short) (daysMin * bottleFrMin);
        int bottle3Day = (bottle1Day * 3);
        int bottle1Month = bottle1Day * 31;
        System.out.println("За 20 минут машина произвела " + bottle20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottle1Day +  " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottle1Month + " штук бутылок");
//Задача 5
        byte allPaints = 120;
        byte whitePaintFr1Class = 2;
        byte brownPaintFr1Class = 4;
        byte paintsFr1Class = 4+2;
        byte quantityClass =(byte) (allPaints / paintsFr1Class);
        byte allWhitePaint =(byte) (quantityClass * whitePaintFr1Class);
        byte allBrownPaint =(byte) (quantityClass * brownPaintFr1Class);
        System.out.println("В школе, где " + quantityClass + " классов, нужно "+ allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

//Задача 6
        byte bananaQuantity = 5;
        byte bananaWeight = 80;
        short banana =(short) (bananaQuantity * bananaWeight);
        byte milkQuantity = 2;
        byte milkWeight = 105;
        short milk = (short)(milkWeight * milkQuantity);
        byte iceCreamQuantity = 2;
        byte iceCreamWeight = 100;
        short iceCream = (short)(iceCreamWeight * iceCreamWeight);
        byte eggQuantity = 4;
        byte eggWeight = 70;
        short egg = (short)(eggWeight * eggQuantity);
        short breakfast = (short)(banana + milk + iceCream + egg);
        System.out.println("Вес спортзавтрака в граммах составляет " + breakfast + " грамм");
        short kg = 1000;
        float kgBreakfast =(float) breakfast / kg;
        System.out.println("Вес спортзавтрака в килограммах составляет " + kgBreakfast + " килограмм");


//Задача 7
        byte kg1 = 7;
        short gr =(short) (kg1 * 1000);
        short weight1 = 250;
        short days1 =(short) (gr / weight1);
        System.out.println("Если худеть на " + weight1 + " грамм в день, то для похудения на " + kg1 + " кг понадобится " + days1 + " дней");
        short weight2 = 500;
        short days2 = (short) (gr / weight2);
        System.out.println("Если худеть на " + weight2 + " грамм в день, то для похудения на " + kg1 + " кг понадобится " + days2 + " дней");

//Задача 8
        int masha1 = 67760;
        int denis1 = 83690;
        int kris1 = 76230;
        int masha2 = (int) (masha1 * 1.1);
        int denis2 = (int) (denis1 * 1.1);
        int kris2 = (int) (kris1 * 1.1);
        int diffMasha = masha2 - masha1;
        int diffDenis = denis2 - denis1;
        int diffKris = kris2 - kris1;
        System.out.println("Маша теперь получает "+ masha2 + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает "+ denis2 + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает "+ kris2 + " рублей. Годовой доход вырос на " + diffKris + " рублей");

    }

}