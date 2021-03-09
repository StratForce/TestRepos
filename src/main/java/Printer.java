package main.java;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class Printer {

    public void printString(String str)
    {
        System.out.println(str);
    }

    public void printTSet(TreeSet<String> treeSet)
    {
        for(String str : treeSet)
        {
            System.out.print(str + " ");
        }

        System.out.println();
    }

}
