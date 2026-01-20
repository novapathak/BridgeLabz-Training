package com.bridgelabz.dsa.day04.mart;

class ZipZipMart {

    void mergeSort(Sale[] sales, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(sales, left, mid);
            mergeSort(sales, mid + 1, right);

            merge(sales, left, mid, right);
        }
    }

    void merge(Sale[] sales, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Sale[] L = new Sale[n1];
        Sale[] R = new Sale[n2];

        for (int i = 0; i < n1; i++)
            L[i] = sales[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = sales[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].date.compareTo(R[j].date) <= 0) {
                sales[k] = L[i];
                i++;
            } else {
                sales[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            sales[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            sales[k] = R[j];
            j++;
            k++;
        }
    }

    void display(Sale[] sales) {
        for (Sale s : sales) {
            System.out.println(s.date + " : ₹" + s.amount);
        }
    }
}
