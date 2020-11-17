using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SecondLR
{
    class Program
    {
        static void Main(string[] args)
        {
            double a, b, c, p, S;
            Console.WriteLine("Введите переменные a, b, c");
            a = Convert.ToDouble(Console.ReadLine());
            b = Convert.ToDouble(Console.ReadLine());
            c = Convert.ToDouble(Console.ReadLine());
            if ((a > 1 & b > 1 & c > 1) & (a<=1000 & b<=1000 & c<=1000))
            {
                if ((a + b > c) & (a + c > b) & (c + b > a))
                {
                    p = (a + b + c) / 2;
                    S = Math.Sqrt(p*(p-a)*(p-b)*(p-c));
                    Console.WriteLine("Площадь треугольника равна "); Console.Write(S); 
                }
                else Console.WriteLine("Ошибка! Сумма двух сторон треугольника должна быть больше третьей");
            }
            else Console.WriteLine("Ошибка! Стороны не должны превосходить 1000 или быть меньше 1");
        }
    }
}
