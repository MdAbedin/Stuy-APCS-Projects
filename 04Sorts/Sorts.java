public class Sorts{
    public static String name(){
	return "09.Abedin.Md"; 
    }
    
    public static void selectionSort(int[] data){
	int lowest;
	for(int i = 0; i < data.length - 1; i++){
	    lowest = i;
	    for(int j = i+1; j < data.length; j++){
		if(data[j] < data[lowest]){
		    lowest = j;
		}
	    }
	    int old = data[i];
	    data[i] = data[lowest];
	    data[lowest] = old;
	}
    }
    
    public static void insertionSort(int[] data){
	int current;
	int ln = data.length;
	for(int i = 1; i < ln; i++){
	    current = data[i];
	    for(int j = i; j >= 0; j--){
		if(j == 0){
		    data[0] = current;
		}
		if(current < data[j-1]){
		    data[j] = data[j-1];
		}
		else{
		    data[j] = current;
		}
	    }
	}
    }

    public static void bubbleSort(int[] data){
	for(int i = data.length - 1; i > 0; i--){
	    boolean swapped = false;
	    for(int j = 0; j < i; j++){
		if(data[j] > data[j+1]){
		    int current = data[j];
		    data[j] = data[j+1];
		    data[j+1] = current;
		    swapped = true;
		}
	    }
	    if(!swapped){
		return;
	    }
	}
    }

    public static void main(String[] a){
	int[] b = {64, 25, 12, 22, 11};
	Sorts.bubbleSort(b);
	for(int i = 0; i < b.length; i++){
	    System.out.print(b[i] + ",");
	}
    }
}
