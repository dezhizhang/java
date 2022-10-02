/*
 * :file description: 
 * :name: /java/src/this01/This02.java
 * :author: 张德志
 * :copyright: (c) 2022, Tungee
 * :date created: 2022-10-02 18:03:26
 * :last editor: 张德志
 * :date last edited: 2022-10-02 18:09:30
 */
package this01;

class A02 {
    public int find(String str, String[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                index = i;
            }

        }
        return index;
    }
}

public class This02 {
    public static void main(String[] args) {
        String arr[] = { "123", "hello", "change" };
        A02 a2 = new A02();
        System.out.println(a2.find("hello", arr));

    }
}
