public class GroceryList {
    private String[] arr;

    public GroceryList() {
        arr = new String[10];
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
    }

    public String toString() {
        String str = "Grocery List: ";

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
            else {
                break;
            }
        }

        for (int i = 0; i < count-1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[count-1];
        
        return str;
    }
}