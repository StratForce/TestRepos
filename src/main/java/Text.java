package main.java;

import java.io.FileReader;
import java.io.IOException;

public class Text
{
    private String text = "";

    public Text()
    {
        text = "";
    }

    Text(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public void setTextByFile(String fileName){

        StringBuilder stringBuilder = new StringBuilder("");

        try(FileReader reader = new FileReader(fileName))
        {
            int c;
            while((c=reader.read())!=-1)
            {
                stringBuilder.append((char) c);
            }

            text = stringBuilder.toString();
        }
        catch(IOException ex)
        {
            System.out.println("Чтение из файла не удалось");
            System.out.println(ex.getMessage());
        }
    }



}
