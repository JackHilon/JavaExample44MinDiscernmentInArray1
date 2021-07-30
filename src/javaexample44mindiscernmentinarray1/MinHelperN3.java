
package javaexample44mindiscernmentinarray1;


public class MinHelperN3 {
    
    // second solution
    
    public static int Min(int[] element) throws IllegalArgumentException
    {
        if(element.length==0)
            throw new IllegalArgumentException();
        
        int[] sequence=element;
        int numOfPairs= sequence.length/2;
        int numOfSingle=sequence.length%2;
        int partialLength=numOfPairs+numOfSingle;
        int[] partialSeq=new int[partialLength];
        
        int i=0;
        int j=0;
        
        while(numOfPairs>=1)
        {
            i=0;
            j=0;
            
            while(j<numOfPairs)
            {
                if(sequence[i]<sequence[i+1])
                {
                    partialSeq[j]=sequence[i];
                }
                else
                {
                    partialSeq[j]=sequence[i+1];
                }
                
                i=i+2;
                j++;
            }// end inner-while
            if(numOfSingle==1)
                partialSeq[j]=sequence[2*numOfPairs+numOfSingle-1];
            
            sequence=partialSeq;
            
            numOfPairs=partialLength/2;
            numOfSingle=partialLength%2;
            partialLength=numOfPairs+numOfSingle;
        }// end outer-while
        return sequence[0];
    }
}
