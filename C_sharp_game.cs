using System;

namespace C__game
{
    class Program
    {
        static void Main(string[] args)
        {
            /*string namae = "Veera Tommila";
            const string namae2 = "Jari Mäkipää";   //This value cannot change again.
            //namae2 = "Jari Mäkipää";
            int number = 2021;

            //Is the number greater or smaller than 100?
            if (number > 100){
                System.Console.WriteLine("The number is greater than 100.");
            }
            if(number < 100){
                System.Console.WriteLine("The number is less than 100.");
            }

            Console.WriteLine("Hello " + namae + "!");
            Console.WriteLine("This is " + namae2 + ".");
            Console.WriteLine("Number is: " + number + ".");*/

            /*Console.WriteLine("Please, give a number. The program tells is it greater than 100 or not: ");
            
            string number = Console.ReadLine(); //To read a value from keyboard.
            int value = int.Parse(number);      //Converts a string to an integer -> int.Parse(number).
            value = value + 0;

            //Is the number greater or smaller than 100? Use variable 'value', that's an integer!
            if (value > 100){
                System.Console.WriteLine("The number is greater than 100.\n");
            }
            if(value < 100){
                System.Console.WriteLine("The number is less than 100.\n");
            }

            Console.WriteLine("Values from 1 to 10.");
            for(value = 1; value < 11; value++){
                Console.WriteLine(value);
            }*/

            /*Console.WriteLine("");

            int[] numberArray = {2, 47, 5, 8, 10, 11}; //An array of numbers. The lenght is 6.
            for (int i = 0; i < numberArray.Length; i++)
            {
                int valueArray = numberArray[i];
                Console.WriteLine(valueArray);
            }

            foreach (int value in numberArray)
            {
                Console.WriteLine(value);
            }*/

            double result = 123 / 5.6;
            Console.WriteLine(result); //21,964285714285715
            Console.WriteLine("{0} and {1:N5}", 456, result); //Prints 456 and 21,96429 for example, not the whole number.



        }
    }
}