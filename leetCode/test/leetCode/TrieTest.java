package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    @Test
    public void insert() {

        Trie trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");

        Boolean p = trie.startsWith("app");
//        trie.insert("apple");
//        System.out.println(trie);
//        Boolean param1 = trie.startsWith("appl");
//        Boolean param2 = trie.search("apple");
//        Boolean param3 = trie.search("appled");
        System.out.println(trie);

    }
}