package CodingNinja.Trie;

import java.util.ArrayList;

public class PatternMatching {
    private TrieNode root;

    public PatternMatching() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word){
        add(root, word);
    }

    public boolean patternMatching(ArrayList<String> input, String pattern) {
        // Complete this function
        // Return the output as specified in question
        return true;
    }
}
