/*
 * :file description: 
 * :name: /java/src/this01/This.java
 * :author: 张德志
 * :copyright: (c) 2022, Tungee
 * :date created: 2022-10-02 17:50:35
 * :last editor: 张德志
 * :date last edited: 2022-10-02 17:55:55
 */
package this01;

class A01 {
    public double max(double[] arr) {
        if (arr.length <= 0) {
            return 0.0;
        }
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}

public class This {
    public static void main(String[] args) {
        A01 a = new A01();
        double[] arr = { 1, 2, 3, 6, 100, 22 };
        double max = a.max(arr);
        System.out.println(max);
    }
}
