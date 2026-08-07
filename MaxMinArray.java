public class MaxMinArray {
    public static void main(String args[]) {

        int a[] = {14,16,87,36,25,89,34};
        int temp;

        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int m=1;
        int n=3;

        int max=a[a.length-m];
        int min=a[n-1];

        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Sum = "+(max+min));
        System.out.println("Difference = "+(max-min));
    }
}