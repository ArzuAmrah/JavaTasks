package lesson33;

public class MyLinkedList<E> {

    private MyNode<E> head;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
    }

    public MyNode<E> getHead() {
        return head;
    }

    public void setHead(MyNode<E> head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    public void add(E data) {
        if (head == null) {
            head = new MyNode<>();
            return;
        }

        MyNode curr = head;

        while(curr.getNext() != null){
            curr = curr.getNext();

            curr.setNext(new MyNode<>(data));
        }





    }
}
