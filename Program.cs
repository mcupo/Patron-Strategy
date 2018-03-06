using System;

using System.Collections.Generic;

namespace DoFactory.GangOfFour.Strategy.RealWorld

{

    class MainApp

    {

        static void Main()

        {

            // Two contexts following different strategies

            SortedList studentRecords = new SortedList();

            studentRecords.Add("Samual");

            studentRecords.Add("Jimmy");

            studentRecords.Add("Sandra");

            studentRecords.Add("Vivek");

            studentRecords.Add("Anna");

            studentRecords.SetSortStrategy(new QuickSort());

            studentRecords.Sort();

            studentRecords.SetSortStrategy(new ShellSort());

            studentRecords.Sort();

            studentRecords.SetSortStrategy(new MergeSort());

            studentRecords.Sort();

            Console.ReadKey();

        }

    }

    // La clase abstracta Strategy

    abstract class SortStrategy

    {

        public abstract void Sort(List<string> list);

    }

    class QuickSort : SortStrategy

    {

        public override void Sort(List<string> list)

        {

            list.Sort(); // Default is Quicksort

            Console.WriteLine("QuickSorted list ");

        }

    }

    class ShellSort : SortStrategy

    {

        public override void Sort(List<string> list)

        {

            /*

            Aca iria la implementacion del Shell Sort

            list.ShellSort();

            */

            Console.WriteLine("ShellSorted list ");

        }

    }

    class MergeSort : SortStrategy

    {

        public override void Sort(List<string> list)

        {

            /*

            Aca iria la implementacion del Merge Sort

            list.MergeSort();

            */

            Console.WriteLine("MergeSorted list ");

        }

    }

    // La clase Context

    class SortedList

    {

        private List<string> _list = new List<string>();

        private SortStrategy _sortstrategy;

        public void SetSortStrategy(SortStrategy sortstrategy)

        {

            this._sortstrategy = sortstrategy;

        }

        public void Add(string name)

        {

            _list.Add(name);

        }

        public void Sort()

        {

            _sortstrategy.Sort(_list);

            foreach (string name in _list)

            {

                Console.WriteLine(" " + name);

            }

            Console.WriteLine();

        }

    }

}
