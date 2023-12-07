package LinkedList;
import java.util.*;
public class node<T> {
    // -->>integer type node

    // int data;
    // node next;
    // node(int data)
    // {
    //     this.data = data;
    //     next = null;
    // }


    //-->>generic node 
    T data;
    node<T> next;
    node(T data){
        this.data  = data;
    }



}
