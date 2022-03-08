package ir.mapsa.jobinja.utile;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Component
public class IO {

    public FileInputStream inputCV(String address){
        FileInputStream cv = null;
        try{
            cv = new FileInputStream(address);
        }catch (FileNotFoundException e){
            return null;
        }

        return cv;
    }
}
