package fileHandling.cipher;

import java.io.*;


public class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Reading reading = new Reading("Hello World");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(("C:\\Users\\dirip\\OneDrive\\Desktop\\input.txt")));
        objectOutputStream.writeObject(reading);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\dirip\\OneDrive\\Desktop\\input.txt"));
        Reading objectFromFile = (Reading) objectInputStream.readObject();
        objectFromFile.displayMsg();

        

    }
}