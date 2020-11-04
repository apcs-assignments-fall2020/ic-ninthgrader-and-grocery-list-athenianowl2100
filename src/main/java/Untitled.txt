public class GroceryList {
    private String[] arr;
    private int count;

    public GroceryList() {
        arr = new String[10];
        count = 0;
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                count++;
                break;
            }
        }
    }

    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                count--;
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
    }

    public String toString() {
        String str = "Grocery List: ";

        for (int i = 0; i < count-1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[count-1];
        
        return str;
    }
}