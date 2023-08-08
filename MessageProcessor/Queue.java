/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MessageProcessor;

/**
 *
 * @author Admin
 * @param <T>
 */
    public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    public boolean isEmpty() {
        return front == null;
    }
}


