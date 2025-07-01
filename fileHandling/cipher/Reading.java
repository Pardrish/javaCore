package fileHandling.cipher;
import java.io.Serializable;
public class Reading implements Serializable{
    private String msg;

    public Reading(String msg){
        this.msg=msg;
    }
    public void displayMsg(){
        System.out.print(msg);
    }
}