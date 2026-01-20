package com.bridgelabz.dsa.day06.icecreamcrush;

class IceCreamRush {
    void bubbleSort(Flavor[] flavors) {

        for (int i=0; i<flavors.length-1;i++) {
            for (int j=0;j<flavors.length -1-i;j++) {
                if (flavors[j].sold>flavors[j+1].sold) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j+1];
                    flavors[j+1] = temp;
       }
            }
        }
}

    void display(Flavor[] flavors) {
        for (Flavor f:flavors) {
            System.out.println(f.name+" Sold: "+f.sold);
        }
}
}
