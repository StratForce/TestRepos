package tests.java;

import main.java.Text;
import main.java.TextParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

public class TextParserTest {

    @Test
    public void testParseToTSet() {

        TreeSet<String> actualTreeSet = new TreeSet<>();
        TreeSet<String> exceptedTreeSet = new TreeSet<>();
        String filename = "D:\\MyProjects\\src\\main\\resources\\Текст.txt";

        exceptedTreeSet = setTestData(exceptedTreeSet);

        Text text = new Text();
        text.setTextByFile(filename);
        actualTreeSet = new TextParser().parseToTSet(text.getText());

        assertEqualTSets(actualTreeSet , exceptedTreeSet);
    }

    public TreeSet<String> setTestData(TreeSet<String> treeSet)
    {
        treeSet.clear();

        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("123");
        treeSet.add("a");
        treeSet.add("ж");
        treeSet.add("1");

        return treeSet;
    }

    public void assertEqualTSets(TreeSet<String> actual, TreeSet<String> excepted)
    {
        assertNotNull(actual);
        assertTrue(actual.size() == excepted.size());

        Iterator<String> actualIterator = actual.iterator();
        Iterator<String> exceptedIterator = excepted.iterator();

        while(actualIterator.hasNext())
        {
            assertEquals(actualIterator.next(), exceptedIterator.next());
        }

    }


}