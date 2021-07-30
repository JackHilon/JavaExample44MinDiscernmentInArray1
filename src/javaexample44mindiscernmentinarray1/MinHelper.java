
package javaexample44mindiscernmentinarray1;

import java.util.Arrays;


public class MinHelper {
    
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
                
                j++;
                i=i+2;
            }// end inner-while
            
            if(numOfSingle==1)
                partialSeq[j]=sequence[sequence.length-1];
            
            sequence=partialSeq;
        }// end outer-while
        return sequence[0];
    }
    
    //==========================================================================
    
    public static String PrintArray(int[] a) throws IllegalArgumentException
    {
        if(a==null)
            throw new IllegalArgumentException("There is no array.");
        
        String res="";
        for (int i = 0; i < a.length; i++) {
            res=res+String.valueOf(a[i])+" ";
        }
        return res;
    }
    
    //==========================================================================
    
    public static void SortArray(int[] a) throws IllegalArgumentException
    {
        if(a==null)
            throw new IllegalArgumentException("There is no array.");
        
        Arrays.sort(a);
    }
    
    //==========================================================================
    
    public static int[] CopyArray(int[] a)
    {
        if(a==null)
            return null;
        int[]res=new int[a.length];
        for (int i = 0; i < res.length; i++) {
            res[i]=a[i];
        }
        return res;
    }
    
}
