package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeventyNineTest {

    @Test
    public void exist() {

        SeventyNine s = new SeventyNine();
//        s.exist(new char[][]{new char[]{'A','B','C','E'},new char[]{'S','F','C','S'},
//                new char[]{'A','D','E','E'}},"ABCCED");

//        s.exist(new char[][]{new char[]{'A'}},"A");

        s.exist(new char[][]{new char[]{'A','B','C','E'},new char[]{'S','F','E','S'},
                new char[]{'A','D','E','E'}},"ABCEFSADEESE");

    }
}