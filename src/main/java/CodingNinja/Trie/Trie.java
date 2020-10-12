package CodingNinja.Trie;

public class Trie {
    private TrieNode root;
    public int count;
    public Trie() {
        root = new TrieNode('\0');
        count = 0;
    }

    private boolean add(TrieNode root, String word){
        if(word.length() == 0){
            if (!root.isTerminating) {
                root.isTerminating = true;
                return true;
            } else {
                return false;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return add(child, word.substring(1));

    }

    public void add(String word){
        if (add(root, word)) {
            this.count++;
        }
    }

    /**
     * Code: Search word in Trie
     * Send Feedback
     * Implement the function SearchWord for the Trie class.
     * For a trie, write the function for searching a word. Return true if found successfully otherwise return false.
     * Note : main function is given for your reference which we are using internally to test the code.
     * @param word
     * @return
     */
    private boolean search(TrieNode root, String word){
        if(word.length() == 0){
            if(!root.isTerminating){
                return false;
            }
            return true;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(child, word.substring(1));
    }

    public boolean search(String word){
        // add your code her
        return search(root, word);
    }

    private int countWords(TrieNode root){
        int result = 0;

        // Leaf denotes end of a word
        if (root.isTerminating)
            result++;

        for (int i = 0; i < 26; i++)
            if (root.children[i] != null )
                result += countWords(root.children[i]);
        return result;
    }

    public int countWords(){
        return countWords(root);
    }
}
