package Test_2013_85_474;

public class Question_1 {
public int longestAscending()
    {
        return longestAscending(_head, 0);
    }
    
    public int longestAscending(IntNode ind, int count)
    {
        if(ind == null || ind.getNext() == null)
            return count;
        if(ind.getNext().getValue() > ind.getValue())
            return longestAscending(ind.getNext(), count+1);
        return longestAscending(ind.getNext(), count);
    }

}
