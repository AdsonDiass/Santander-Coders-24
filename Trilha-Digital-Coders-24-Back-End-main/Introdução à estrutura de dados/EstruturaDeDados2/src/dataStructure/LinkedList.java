package dataStructure;
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista vazia");
        }else {
            System.out.println("Head: " + head.data);
        }
    }
    public void getTail() {
        if (this.head == null) {
            System.out.println("Lista vazia");
        }else {
            System.out.println("Head: " + tail.data);
        }
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    /**
     * Node
     */
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public LinkedList(String data) {
        length =1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        System.out.println("--------------------------------");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("--------------------------------");
    }

    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node RemoveLast() {
        if (length ==0) {
            return null;
        }
        Node pre = head;
        Node temp = null;

        while (pre.next != tail) {
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if (length ==0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void preprend(String data) {
        Node newNode = new Node(data);

        if (length ==0) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node RemoveFirst() {
        if (length ==0) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length ==0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        if(index <0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, String data) {
        if(index <0 || index >= length) return false;

        if (index == 0) {
            preprend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;

        length++;
        return true;
    }

    public boolean set(int index, String data) {
        Node temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;

    }

    public Node remove (int index) {
        if(index < 0 || index >= length) return null;
        if(index ==0) return remove(index);
        if(index == length -1) return RemoveLast();

        Node prev = get(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;

        length--;

        return temp;
    }
 














    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.preprend("Elemento 0");

        list.insert(3, "elemento 2.5");

        list.remove(2);
        list.print();

        //System.out.println(list.get(2).data);

        //System.out.println(list.RemoveLast().data);
        //System.out.println(list.RemoveFirst().data);
        list.print();

        list.set(1, "elemento 0.5");
        list.print();

        //list.getHead();
        //list.getTail();
        //list.getLength();
        //list.print();
    }


}
