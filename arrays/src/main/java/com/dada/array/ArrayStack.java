package com.dada.array;

/**
 * Created by dnalband on 13/05/15.
 */
public class ArrayStack <E>{

    E [] dataArray;
    private int top = -1;

    public ArrayStack(int capacity){
        dataArray = (E[])new Object[capacity];
    }

    public ArrayStack()
    {
        this(1024);
    }

    public void push(E data )
    {
        if(top == dataArray.length)
        {
            throw new RuntimeException("stack is full");
        }
        dataArray[++top] = data;
    }

    public E pop()
    {
        if(top ==-1)
        {
            throw new RuntimeException("stack is empty");
        }
        E data = dataArray[top];
        dataArray[top] = null;
        --top;
        return data;
    }

    public  boolean isEmpty()
    {
       return  (top<0)? true:false;
    }

    public E get()
    {
        return dataArray[top];
    }

    public void display()
    {
        for (int i=0; i<=top; i++)
        {
            System.out.println(dataArray[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack<String> stringArrayStack = new ArrayStack<String>(10);
        stringArrayStack.push("dada");
        stringArrayStack.push("peer");
        stringArrayStack.push("peer2");

        stringArrayStack.display();
        stringArrayStack.pop();
        stringArrayStack.pop();
        System.out.println("popped list..");
        stringArrayStack.display();
    }



}
