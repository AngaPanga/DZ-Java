public class Main {

    public static void main(String[] args) {
        Libs lb = new Libs();
        int sizeArray = lb.input("Введите размер массива: ");
        int [] rndmArray = new  int [sizeArray];
        int limit = lb.input("Введите диапозон случайных значений от 0 до: ");
        for (int i = 0; i < sizeArray; i++){
            rndmArray[i] = lb.randomInt(limit);
            System.out.print(rndmArray[i] + " ");
        }
        System.out.println("\nОтсортированный массив:");
        rndmArray = sortingArray(rndmArray);
        for (int i = 0; i < sizeArray; i++){
            System.out.print(rndmArray[i] + " ");
        }
    }


    private static int[] sortingArray(int[] originalArray){
        if (originalArray == null) {
            return null;
        }
        if (originalArray.length < 2) {
            return originalArray;
        }
        int [] leftArray = new int[originalArray.length / 2];
        System.arraycopy(originalArray, 0, leftArray, 0, originalArray.length / 2);

        int [] rightArray = new int[originalArray.length - originalArray.length / 2];
        System.arraycopy(originalArray, originalArray.length / 2, rightArray, 0,
                originalArray.length - originalArray.length / 2);
        leftArray = sortingArray(leftArray);
        rightArray = sortingArray(rightArray);

        return mergeArray(leftArray, rightArray);
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int [] resultArray = new  int[left.length + right.length];
        int lInd = 0, rInd = 0;

        for (int i = 0; i < resultArray.length; i++) {
            if (lInd == left.length && right.length > rInd){
                resultArray[i] = right[i - lInd];
                rInd++;
            } else if (rInd == right.length && left.length > lInd) {
                resultArray[i] = left[i - rInd];
                lInd++;
            } else if (left[i - rInd] < right[i - lInd]) {
                resultArray[i] = left[i - rInd];
                lInd++;
            } else {
                resultArray[i] = right[i - lInd];
                rInd++;
            }
        }
        return resultArray;
    }
}