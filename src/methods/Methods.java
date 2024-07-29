package methods;

import java.time.LocalDate;

public class Methods {


public void first(String inp) throws  NullnputException{
    if(inp == null){
        throw new NullnputException("String is null");
    }
    System.out.println("String is" + " " + inp);
}

public void first(LocalDate inp) throws NullnputException{
    if(inp == null){
        throw new NullnputException("LocalDate is null");
    }
    System.out.println("LocalDate is" + " " + inp);
}

public void first(Integer inp) throws NullnputException{

    if(inp == null){
        throw new NullnputException("Integer is null");
    }
    System.out.println("Integer is" + " " + inp);
}


    public static void main(String[] args) {

    Methods methods = new Methods();
 try{
     methods.first("Arzu");
     methods.first(LocalDate.now());
     methods.first(345);
 }catch (NullnputException e){
     System.out.println("Exception:" + e.getMessage());
 }

    }

}
