package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class knacpsack {
    public static void main(String[] args) {
Item item1= new Item(4, 20);//5
Item item2 = new Item(3,18);//6
Item item3= new Item(2,14);//7

final Item items[]={item1,item2,item3};
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerWeight).reversed()); // сортируем массив по ценности предметов в обратном порядке от большего к меньшему
        System.out.println(Arrays.toString(items));
    }
}
class Item{
    private int weight;
    private int value;
    public Item(int weight, int value){
        this.value=value;
        this.weight=weight;
    }
    public double valuePerWeight(){
        return value/ (double)weight;
    }
    public  int getWeight(){
        return weight;
}
    public int getValue() {
        return value;
    }
    public String toString(){
        return "{w:"+ weight+ ",v:"+ value +"}";
    }
}