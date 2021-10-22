using System;

namespace C__game
{
    class Program
    {
        static void Main(string[] args)
        {
            const int GuesTimes = 3;
                int guessIndexes = 0;
                while (true)
                {
                    Console.WriteLine("Guess the number!");

                    int userInput = int.Parse(Console.ReadLine());

                    int minValue = 1;
                    int maxValue = 20;
                    var randomNumber = new Random();
                    var lottoNumber = randomNumber.Next(minValue, maxValue);
                    if (lottoNumber == userInput)
                    {
                        Console.WriteLine("You Win!");
                        break;
                    }
                    else
                    {
                        Console.WriteLine("Wrong. You lose.");
                        guessIndexes++;
                    if (GuesTimes == guessIndexes)
                    {
                        Console.WriteLine("You will be executed!");
                        break;}
                    }
                }


        }
    }
}