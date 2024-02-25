package alqoritms;

public class CustomLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedList() {

    }

    public CustomLinkedList(Node head) {
        this.head = head;

    }


    public void add(int value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void remove(int value) {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return;
        }
        Node header = head;
        Node result = head.next;
        while (result != null) {
            if (result.value == value) {
                header.next = result.next;
                size--;
                break;
            }
            header = result;
            result = result.next;
        }
    }


    public void removeV2(int value) {
        if (size == 0) {
            throw new IllegalStateException("Empty List");
        }
        Node node = head;
        Node prev = null;
        while (node != null) {
            if (node.value == value) {
                if (node == head) {
                    head = head.next;
                    if (node == tail) {
                        tail = head;
                    }
                } else {
                    prev.next = node.next;
                    if (node == tail) {
                        tail = prev;
                    }
                }
                size--;
                break;
            } else {
                prev = node;
                node = node.next;
            }
        }
    }

    public boolean contains(int value) {
        if (size == 0) {
            System.out.println("Empty list");
        }
        Node node = head;//100
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public Node findMiddleNode() {
        Node first = head;
        Node second = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
        }
        return second;
    }


    @Override
    public String toString() {
        String result = " ";
        if (head == null || size == 0) {
            return "[ ]";
        }
        Node node = head;
        while (node != null) {
            result = result + node.value + ",";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 1) + "]";
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(100);
        customLinkedList.add(200);
        customLinkedList.add(300);
        customLinkedList.add(400);
        customLinkedList.add(500);
        customLinkedList.add(600);
        customLinkedList.add(700);
        customLinkedList.remove(300);
        System.out.println(customLinkedList);
        Node reverse = reverseV2(customLinkedList.head);

        Node node = reverse;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(reverse);


    }


    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }


    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }


    public static Node reverseV2(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}


