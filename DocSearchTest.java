import java.net.URI;
import java.io.IOException;
import java.util.*;

public class DocSearchTest{
    @Test
    public void returnHandleURL(){
        return handleURL();
    }
    public String handleRequest(URI url){
        if(url.getPath().equals("/")){
            return "There are" + getFiles() + "files to search";
        }else if(url.getPath().contains("/search")){
            String[] parameters = url.getQuery().split("=");
            
            
        }
    }
}