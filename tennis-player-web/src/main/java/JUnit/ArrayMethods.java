package JUnit;

public class ArrayMethods {
    public int findIndex(int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                index = array[i];
            } else continue;
        }
        return index;
    }

    public boolean searchForNumber(int[] array, int numberToSearchFor) {
        boolean found = false;
        //...
        return found;
    }
}
