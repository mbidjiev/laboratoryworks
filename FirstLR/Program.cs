using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FirstLR
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Лабораторная работа №1\n");
            Console.WriteLine("ФИО: Биджиев Мухаммад Иссаевич");
            Console.WriteLine("Шифр специальности: 09.03.02 Группа: ИНС-б-о-181");
            Console.WriteLine("Дата рождения: 07.01.01");
            Console.WriteLine("Место жительства: село Учкекен");
            Console.WriteLine("Любимый предмет в школе: История");
            Console.WriteLine("Хобби: шахматы\n\n");

            double a_1 = 2.45, b = 3.153, a = -1.5, x = 0, y5 = 8;
            double F = a_1 + b - a * (x + y5);
            Console.Write("Результат вычисления - "); Console.Write(F);
        }
    }
}
