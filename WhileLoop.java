package exercises.WhileLoop;
//The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
//It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
//It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
//On days where it sells, it can only sell 1000 pounds for euros.
//Write a while loop
//Use the calculation for exchange rate below
//1 + (Math.random() * 0.2);
//To recalculate our rate every day (once per loop)
//Print the number of days it takes for our bot to sell its pounds
public class WhileLoop {
        public static void main(String[] args) {
                int britishPounds = 10000;
                int daysCount = 0;

                while (britishPounds > 0) {
                        if (britishPounds <= 0) {
                                break;
                        }

                        double exchangeRate = 1 + (Math.random() * 0.2);



                        if (exchangeRate > 1.15) {
                                britishPounds -= 1000; //britishPounds = britishPounds - 1000;
                                System.out.println("The exchange rate today is great! It's time to sell.           -1000 = £" + britishPounds + " remaining.");

                        }else {
                                System.out.println("The exchange rate is not optimal today. So it's not for sale.");
                        }

                        System.out.print("Day " + daysCount + ": ");

                        daysCount ++ ;

                }
                System.out.println((daysCount - 1) + " days it takes to sell all the pounds.");

        }
}

