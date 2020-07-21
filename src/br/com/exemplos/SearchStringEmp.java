package br.com.exemplos;

public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Maria";
        int intIndex = strOrig.indexOf("Hello");

        if (intIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index " + intIndex);
        }
    }
}
