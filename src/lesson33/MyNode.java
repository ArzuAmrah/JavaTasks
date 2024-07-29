package lesson33;

import java.util.Objects;

public class MyNode <E> {
    private E data;
    private MyNode <E> next;

    public MyNode(){
        this.data = data;
        this.next = next;
    }

    public <E> MyNode(E data) {
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNode<?> myNode = (MyNode<?>) o;
        return Objects.equals(data, myNode.data) && Objects.equals(next, myNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
