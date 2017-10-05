import java.util.*;

public class DocumentIndex extends ArrayList<IndexEntry>
{
    public DocumentIndex(){
        super();
    }
    
    public DocumentIndex(int capacity){
        super(capacity);
    }

    public void addWord(String word, int num){
        int x1 = foundorinserted(word);
        IndexEntry newentry = super.get(x1);
        newentry.add(num);
    }

    public void addAllWords(String str, int num){
        String[] list = str.split("\\W+");
        for(String x2 : list)
        {
            if (x2.length() != 0){
                addWord(x2, num);
            }
        }
    }

        private int foundorinserted(String word){
        if (this.size() == 0){
            IndexEntry x = new IndexEntry(word);
            this.add(x);
            return 0;
        }

        for(int i = 0; i < this.size(); i++) {
            IndexEntry entry = get(i);      
            String a1 = entry.getWord();
            int a2 = a1.compareToIgnoreCase(word);
            if(a2 == 0) {
                return i;
            }
            if(a2 < 0) {
                IndexEntry insert = new IndexEntry(word);
                this.add(i, insert);
                return i;
            }
        }

        IndexEntry insert = new IndexEntry(word);
        this.add(insert);
        return this.size() - 1;

    }
}
