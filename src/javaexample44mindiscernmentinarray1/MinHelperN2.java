
package javaexample44mindiscernmentinarray1;

// another solution for Min() method
public class MinHelperN2 {
    public static int Min(int[] element) throws IllegalArgumentException
    {
        if(element==null)
            throw new IllegalArgumentException();
        
        int[] sequence = element;
        int numOfPairs=0;
        int numOfSingle=0;
        int partialSeqLength=0;
        int[] partialSeq=null;
        int i=0;
        int j=0;
        
        
        while(sequence.length >1)
        {
            numOfPairs=sequence.length/2;
            numOfSingle=sequence.length%2;
            partialSeqLength=numOfPairs+numOfSingle;
            partialSeq=new int[partialSeqLength];
            
            i=0;
            j=0;
            
            while(j<partialSeq.length)     //<---- Another way-------
            {
                if(sequence[i]<sequence[i+1])
                {
                    partialSeq[j]=sequence[i];
                }
                else
                {
                    partialSeq[j]=sequence[i+1];
                }
                
                j++;
                i=i+2;
                                            //--- Another way ----|
                if(j==partialSeqLength-1 && numOfSingle==1)     //|
                {                                               //|
                    partialSeq[j]=sequence[sequence.length-1];  //|
                    break;                                      //|
                }                                               //|
                                            //--------------------| 
            }// end inner-while
            
            sequence=partialSeq;
        }// end outer-while
        return sequence[0];
    }
    
}
