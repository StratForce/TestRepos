package main.java;

import java.util.TreeSet;

public class TextParser {

    public TextParser(){}

    public TreeSet<String> parseToTSet(String string)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        String[] splitString = string.split(" +");

        for(String str : splitString)
        {
            treeSet.add(str);
        }

        return treeSet;
    }

}
