package javaTest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Optional;

public class OptionalTest {



    static class NullClass{

        String name;

        NullClass(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

    }


    public static void main(String[] args) {
//        NullClass nullClass = new NullClass("1");
//        NullClass nullClass = null;
//        testOptional(nullClass);

        String url = "uat-disk/8A56A2533E35E0751587965865277新能源车.png";
        try {
           String u =  URLEncoder.encode(url,"UTF-8");
           System.out.println(u);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void testOptional(NullClass nullClass){

        Optional<NullClass> optionalNullClass = Optional.ofNullable(nullClass);
        Optional<String> optionalS = optionalNullClass.map(NullClass::getName);
        System.out.println(optionalS.orElse("123"));
    }




}
