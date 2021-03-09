package tests.java;

import main.java.Text;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TextTest {

    @Test
    public void setTextByFile() {

        Text actualText = new Text();
        Text exceptText = new Text();

        String filename = "D:\\MyProjects\\src\\main\\resources\\Текст.txt";
        actualText.setTextByFile(filename);

        exceptText.setText("1 2 3 123  a ж   1 1");

        assertEquals(actualText.getText(), exceptText.getText());


    }

}