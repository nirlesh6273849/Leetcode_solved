class TreeNode{
    TreeNode[] child; 
    boolean end=false;
    public TreeNode(){
        child= new TreeNode[26];
    }
    public void insert(String word,int i){
        
        if(i<word.length()){

            int j=word.charAt(i)-'a';
            if(child[j]==null)
            child[j]= new TreeNode();
            child[j].insert(word,i+1);
        }
        else{
            end=true;
            return;
        }
    }
    public boolean search(String word,int i){
       
        if(i<word.length()){
            int j=word.charAt(i)-'a';
            if(child[j]!=null){
                return child[j].search(word,i+1);
            }
            else return false;
        }
        return end;
    }
    public boolean startsWith(String word,int i){
        
        if(i<word.length()){
            int j=word.charAt(i)-'a';
            if(child[j]!=null){
                return child[j].startsWith(word,i+1);
            }
            else return false;
        }
        else{
            return true;
        }
        
    }
}
class Trie {
    TreeNode root;
    public Trie() {
        root= new TreeNode();
    }
    
    public void insert(String word) {
        root.insert(word,0);
    }
    
    public boolean search(String word) {
        return root.search(word,0);
    }
    
    public boolean startsWith(String prefix) {
        return root.startsWith(prefix,0);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
