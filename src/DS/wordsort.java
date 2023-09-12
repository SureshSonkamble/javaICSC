package DS;

public class wordsort {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception
	    {
	        String str = "zbcxyz";
	        char arr[] = str.toCharArray();       
	        char temp;
	        int i = 0;
	        for( i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr.length;j++) {
	        		if (arr[j] < arr[i]) {		                  
		                    temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
	        	}
	        	
	        }

        System.out.println(arr);
	    }

}
