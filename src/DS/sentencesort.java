package DS;
public class sentencesort {
	    public static void main(String[] args) {
	        String inputSentence = "This is a way to find words in sort maner";	       
	        String[] words = inputSentence.split(" ");     
	        wordSort(words);        
	        String sortedSentence = String.join(" ", words);
	        System.out.println("Original Sentence: " + inputSentence);
	        System.out.println("Sorted Sentence: " + sortedSentence);
	    }   
	    public static void wordSort(String[] arr) {
	        int n = arr.length;
	        boolean flg;
	        do {
	        	flg = false;
	            for (int i = 0; i < n - 1; i++) {
	                if (arr[i].compareTo(arr[i + 1]) > 0) {
	                    String temp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = temp;
	                    flg = true;
	                }
	            }
	        } while (flg);
	    }
	
}
