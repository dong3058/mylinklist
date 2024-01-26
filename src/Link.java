

public class Link<T> {


    private Node<T> head;

    private Node<T> tail;

    int size;


    public Link() {

        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            System.out.println("잘못된 인덱스입니다");
            return null;
        } else {
            Node<T> x = head;
            for (int i = 1; i < index; i++) {
                x = x.next;


            }
            System.out.println(x.data);
            return x.data;
        }

    }


    public void add(T t) {
        if (this.head == null) {
            Node<T> n = new Node<>(t);
            head=n;
            size += 1;

        } else if (head != null && head.next == null) {

            Node<T> n = new Node<>(t);


            head.next = n;
            tail = n;
            size += 1;


        } else {
            Node<T> n = new Node<>(t);

            Node<T> x = head;
            for (int i = 1; i < size ; i++) {

                x = x.next;


            }


            x.next = n;
            tail = n;

            size += 1;


        }


    }

    public void delete(int idx) {
        Node<T> x = head;


        if (idx == size) {
            for (int i = 1; i < size; i++) {

                if (i == size - 1) {
                    tail.next=null;
                    tail=x;
                    tail.next=null;
                    size-=1;
                    break;
                }
                else{
                    x=x.next;
                }


            }


        } else {
            Node<T> y = new Node<>();
            for (int i = 1; i < idx+1; i++) {

                if (i == idx - 1) {
                    y = x;
                    x = x.next;
                } else if (i == idx) {
                    y.next = x.next;
                    x.next = null;
                    size -= 1;
                }
                else{
                    x=x.next;
                }


            }


        }


    }

}